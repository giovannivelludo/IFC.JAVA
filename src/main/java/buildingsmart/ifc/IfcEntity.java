/*
 * Copyright (C) 2020 Giovanni Velludo
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

/**
 * One of the entities defined in the IFC specification. This interface is not
 * part of the IFC specification, its only purpose is to distinguish IFC
 * entities from IFC defined types and enumerations.
 */
public abstract class IfcEntity {

    /**
     * @return The attributes that should be serialized in the representation of
     * this class in an IFC file.
     */
    public abstract Object[] getAttributes();

    /**
     * @return The attributes representing an inverse relationship which must be
     * serialized after this class.
     */
    public abstract Object[] getInverseAttributes();

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();
}
