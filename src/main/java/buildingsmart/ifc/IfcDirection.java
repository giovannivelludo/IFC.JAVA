/*
 * Copyright (C) 2019 Pieter Pauwels, Ghent University
 * Modifications Copyright (C) 2020 Giovanni Velludo
 *
 * This file is part of IFC.JAVA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package buildingsmart.ifc;

import buildingsmart.io.Attribute;
import buildingsmart.io.Order;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This entity defines a general direction vector in two or three dimensional
 * space. The actual magnitudes of the components have no effect upon the
 * direction being defined, only the ratios X:Y:Z or X:Y are significant.
 */
public class IfcDirection extends IfcGeometricRepresentationItem
        implements IfcVectorOrDirection {
    @Attribute
    @Order(value = 0)
    private final List<IfcReal> directionRatios;
    private final IfcDimensionCount dim; // derived attribute

    /**
     * @param directionRatios The components in the direction of X axis
     *                        (DirectionRatios[1]), of Y axis
     *                        (DirectionRatios[2]),
     *                        and of Z axis (DirectionRatios[3]). The size of
     *                        this list must be either 2 or 3, and it cannot be
     *                        null.
     * @throws IllegalArgumentException If the size of directionRatios is not 2
     *                                  or 3, or if directionRatios is null.
     */
    public IfcDirection(@NotNull List<IfcReal> directionRatios) {
        if (directionRatios == null) {
            throw new IllegalArgumentException(
                    "directionRatios cannot be null");
        }
        if (directionRatios.size() < 2 || directionRatios.size() > 3) {
            throw new IllegalArgumentException(
                    "size of directionRatios must be 2 or 3");
        }
        this.directionRatios = directionRatios;
        this.dim = new IfcDimensionCount((byte) directionRatios.size());
    }

    /**
     * @param directionRatios The components in the direction of X axis
     *                        (DirectionRatios[1]), of Y axis
     *                        (DirectionRatios[2]),
     *                        and of Z axis (DirectionRatios[3]). The size of
     *                        this array must be either 2 or 3, and it cannot be
     *                        null.
     * @throws IllegalArgumentException If the size of directionRatios is not 2
     *                                  or 3, or if directionRatios is null.
     */
    public IfcDirection(@NotNull double... directionRatios) {
        if (directionRatios == null) {
            throw new IllegalArgumentException(
                    "directionRatios cannot be null");
        }
        if (directionRatios.length < 2 || directionRatios.length > 3) {
            throw new IllegalArgumentException(
                    "size of directionRatios must be 2 or 3");
        }
        List<IfcReal> directionRatiosList =
                new ArrayList<>(directionRatios.length);
        for (double dirRatio : directionRatios) {
            directionRatiosList.add(new IfcReal(dirRatio));
        }
        this.directionRatios = directionRatiosList;
        this.dim = new IfcDimensionCount((byte) directionRatiosList.size());
    }

    /**
     * @return The space dimensionality of this class, defined by the number of
     * real in the list of DirectionRatios.
     */
    @Override
    public IfcDimensionCount getDim() {
        return this.dim;
    }

    /**
     * @return The components of the direction in the direction of X axis
     * (DirectionRatios[1]), of Y axis (DirectionRatios[2]), and of Z axis
     * (DirectionRatios[3])
     */
    @Override
    public List<IfcReal> getDirectionRatios() {
        return directionRatios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        IfcDirection that = (IfcDirection) o;
        return directionRatios.equals(that.directionRatios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), directionRatios);
    }
}
