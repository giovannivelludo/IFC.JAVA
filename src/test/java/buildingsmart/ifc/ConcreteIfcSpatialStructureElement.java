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

import lombok.NonNull;

public class ConcreteIfcSpatialStructureElement
        extends IfcSpatialStructureElement {

    /**
     * Creates a new IfcSpatialStructureElement, using the provided globalId.
     *
     * @param globalId        Assignment of a globally unique identifier within
     *                        the entire software world.
     * @param ownerHistory    Assignment of the information about the current
     *                        ownership of that object, including owning actor,
     *                        application, local identification and information
     *                        captured about the recent changes of the object,
     *                        NOTE: only the last modification in stored.
     * @param name            Optional name for use by the participating
     *                        software systems or users. For some subtypes of
     *                        IfcRoot the insertion of the Name attribute may be
     *                        required . This would be enforced by a where
     *                        rule.
     * @param description     Optional description, provided for exchanging
     *                        informative comments.
     * @param objectType      The type denotes a particular type that indicates
     *                        the object further. The use has to be established
     *                        at the level of instantiable subtypes. In
     *                        particular it holds the user defined type, if the
     *                        enumeration of the attribute PredefinedType is set
     *                        to USERDEFINED.
     * @param objectPlacement Placement of the product in space, the placement
     *                        can either be absolute (relative to the world
     *                        coordinate system), relative (relative to the
     *                        object placement of another product), or
     *                        constraint (e.g. relative to grid axes). It is
     *                        determined by the various subtypes of
     *                        IfcObjectPlacement, which includes the axis
     *                        placement information to determine the
     *                        transformation for the object coordinate system.
     * @param representation  Reference to the representations of the product,
     *                        being either a representation
     *                        (IfcProductRepresentation)
     *                        or as a special case a shape representations
     *                        (IfcProductDefinitionShape). The product
     *                        definition shape provides for multiple geometric
     *                        representations of the shape property of the
     *                        object within the same object coordinate system,
     *                        defined by the object placement.
     * @param longName        Long name for a spatial structure element, used
     *                        for informal purposes. Maybe used in conjunction
     *                        with the inherited Name attribute.
     * @param compositionType Denotes, whether the predefined spatial structure
     *                        element represents itself, or an aggregate
     *                        (complex) or a part (part). The interpretation is
     *                        given separately for each subtype of spatial
     *                        structure element.
     * @throws IllegalArgumentException If globalId or ownerHistory are null; if
     *                                  globalId was used in another instance of
     *                                  this class; if representation is not
     *                                  null and objectPlacement is, while
     *                                  representation is an instance of
     *                                  IfcProductDefinitionShape; if
     *                                  compositionType is null.
     */
    public ConcreteIfcSpatialStructureElement(
            @NonNull IfcGloballyUniqueId globalId,
            @NonNull IfcOwnerHistory ownerHistory, IfcLabel name,
            IfcText description, IfcLabel objectType,
            IfcObjectPlacement objectPlacement,
            IfcProductRepresentation representation, IfcLabel longName,
            @NonNull IfcElementCompositionEnum compositionType) {
        super(globalId, ownerHistory, name, description, objectType,
                objectPlacement, representation, longName, compositionType);
    }

    /**
     * Creates a new IfcSpatialStructureElement and generates a pseudo random
     * globalId.
     *
     * @param ownerHistory    Assignment of the information about the current
     *                        ownership of that object, including owning actor,
     *                        application, local identification and information
     *                        captured about the recent changes of the object,
     *                        NOTE: only the last modification in stored.
     * @param name            Optional name for use by the participating
     *                        software systems or users. For some subtypes of
     *                        IfcRoot the insertion of the Name attribute may be
     *                        required . This would be enforced by a where
     *                        rule.
     * @param description     Optional description, provided for exchanging
     *                        informative comments.
     * @param objectType      The type denotes a particular type that indicates
     *                        the object further. The use has to be established
     *                        at the level of instantiable subtypes. In
     *                        particular it holds the user defined type, if the
     *                        enumeration of the attribute PredefinedType is set
     *                        to USERDEFINED.
     * @param objectPlacement Placement of the product in space, the placement
     *                        can either be absolute (relative to the world
     *                        coordinate system), relative (relative to the
     *                        object placement of another product), or
     *                        constraint (e.g. relative to grid axes). It is
     *                        determined by the various subtypes of
     *                        IfcObjectPlacement, which includes the axis
     *                        placement information to determine the
     *                        transformation for the object coordinate system.
     * @param representation  Reference to the representations of the product,
     *                        being either a representation
     *                        (IfcProductRepresentation)
     *                        or as a special case a shape representations
     *                        (IfcProductDefinitionShape). The product
     *                        definition shape provides for multiple geometric
     *                        representations of the shape property of the
     *                        object within the same object coordinate system,
     *                        defined by the object placement.
     * @param longName        Long name for a spatial structure element, used
     *                        for informal purposes. Maybe used in conjunction
     *                        with the inherited Name attribute.
     * @param compositionType Denotes, whether the predefined spatial structure
     *                        element represents itself, or an aggregate
     *                        (complex) or a part (part). The interpretation is
     *                        given separately for each subtype of spatial
     *                        structure element.
     * @throws IllegalArgumentException If ownerHistory is null; if
     *                                  representation is not null and
     *                                  objectPlacement is, while representation
     *                                  is an instance of
     *                                  IfcProductDefinitionShape;
     *                                  if compositionType is null.
     */
    public ConcreteIfcSpatialStructureElement(
            @NonNull IfcOwnerHistory ownerHistory, IfcLabel name,
            IfcText description, IfcLabel objectType,
            IfcObjectPlacement objectPlacement,
            IfcProductRepresentation representation, IfcLabel longName,
            @NonNull IfcElementCompositionEnum compositionType) {
        super(ownerHistory, name, description, objectType, objectPlacement,
                representation, longName, compositionType);
    }
}
