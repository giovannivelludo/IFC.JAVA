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

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

import java.util.Set;

/**
 * The aggregation relationship
 * <I>IfcRelAggregates</I> is a special type of the general
 * composition/decomposition (or whole/part) relationship
 * <I>IfcRelDecomposes</I>.
 * The aggregation relationship can be applied to all subtypes of object.</P>
 * <P> Some further specializations of decomposition may imply additional
 * constraints and meanings, such as the requirement of aggregates to represent
 * physical containment. In cases of physical containment the representation
 * (within the same representation context) of the whole can be taken from the
 * sum of the representations of the parts.</P>
 * <BLOCKQUOTE><FONT SIZE="-1">EXAMPLE: A roof is the aggregation of the
 * roof elements, such as roof slabs, rafters, purlins, etc. Within the same
 * representation context, e.g. the detailed geometric representation, the shape
 * representation of the roof is given by the shape representation of its
 * parts</FONT></BLOCKQUOTE>
 * <P> Decompositions imply a dependency, i.e. the definition of the
 * whole depends on the definition of the parts and the parts depend on the
 * existence of the whole. The behavior that is implied from the dependency has
 * to be established inside the applications.
 */
@ToString(callSuper = true)
public class IfcRelAggregates extends IfcRelDecomposes {
    /**
     * Creates a new IfcRelAggregates, using the provided globalId, and
     * automatically modifies relatingObject and relatedObjects to make them all
     * contain a reference to this relationship, either in isDecomposedBy or
     * decomposes.
     *
     * @param globalId       Assignment of a globally unique identifier within
     *                       the entire software world.
     * @param ownerHistory   Assignment of the information about the current
     *                       ownership of that object, including owning actor,
     *                       application, local identification and information
     *                       captured about the recent changes of the object,
     *                       NOTE: only the last modification in stored.
     * @param name           Optional name for use by the participating software
     *                       systems or users. For some subtypes of IfcRoot the
     *                       insertion of the Name attribute may be required.
     *                       This would be enforced by a where rule.
     * @param description    Optional description, provided for exchanging
     *                       informative comments.
     * @param relatingObject The object that represents the nest or
     *                       aggregation.
     * @param relatedObjects The objects being nested or aggregated.
     * @throws NullPointerException     If globalId, ownerHistory,
     * relatingObject
     *                                  or relatedObjects are null.
     * @throws IllegalArgumentException If globalId was used in another instance
     *                                  of this class or its superclass, if the
     *                                  size of relatedObjects is zero, if
     *                                  relatedObjects contains relatingObject.
     */
    @Builder
    public IfcRelAggregates(@NonNull IfcGloballyUniqueId globalId,
                            @NonNull IfcOwnerHistory ownerHistory,
                            IfcLabel name,
                            IfcText description,
                            @NonNull IfcObjectDefinition relatingObject,
                            @NonNull @Singular
                                    Set<IfcObjectDefinition> relatedObjects) {
        super(globalId,
              ownerHistory,
              name,
              description,
              relatingObject,
              relatedObjects);
    }

    /**
     * Creates a new IfcRelAggregates and generates a pseudo random globalId,
     * and automatically modifies relatingObject and relatedObjects to make them
     * all contain a reference to this relationship, either in isDecomposedBy or
     * decomposes.
     *
     * @param ownerHistory   Assignment of the information about the current
     *                       ownership of that object, including owning actor,
     *                       application, local identification and information
     *                       captured about the recent changes of the object,
     *                       NOTE: only the last modification in stored.
     * @param name           Optional name for use by the participating software
     *                       systems or users. For some subtypes of IfcRoot the
     *                       insertion of the Name attribute may be required.
     *                       This would be enforced by a where rule.
     * @param description    Optional description, provided for exchanging
     *                       informative comments.
     * @param relatingObject The object that represents the nest or
     *                       aggregation.
     * @param relatedObjects The objects being nested or aggregated.
     * @throws NullPointerException     If ownerHistory, relatingObject or
     *                                  relatedObjects are null.
     * @throws IllegalArgumentException If the size of relatedObjects is zero,
     *                                  if relatedObjects contains
     *                                  relatingObject.
     */
    public IfcRelAggregates(@NonNull IfcOwnerHistory ownerHistory,
                            IfcLabel name,
                            IfcText description,
                            @NonNull IfcObjectDefinition relatingObject,
                            @NonNull Set<IfcObjectDefinition> relatedObjects) {
        super(ownerHistory, name, description, relatingObject, relatedObjects);
    }

    /**
     * Creates a new IfcRelAggregates, using the provided globalId, and
     * automatically modifies relatingObject and relatedObjects to make them all
     * contain a reference to this relationship, either in isDecomposedBy or
     * decomposes.
     *
     * @param globalId       Assignment of a globally unique identifier within
     *                       the entire software world.
     * @param ownerHistory   Assignment of the information about the current
     *                       ownership of that object, including owning actor,
     *                       application, local identification and information
     *                       captured about the recent changes of the object,
     *                       NOTE: only the last modification in stored.
     * @param name           Optional name for use by the participating software
     *                       systems or users. For some subtypes of IfcRoot the
     *                       insertion of the Name attribute may be required.
     *                       This would be enforced by a where rule.
     * @param description    Optional description, provided for exchanging
     *                       informative comments.
     * @param relatingObject The object that represents the nest or
     *                       aggregation.
     * @param relatedObjects The objects being nested or aggregated.
     * @throws NullPointerException     If globalId, ownerHistory,
     * relatingObject
     *                                  or relatedObjects are null.
     * @throws IllegalArgumentException If globalId was used in another instance
     *                                  of this class or its superclass, if the
     *                                  size of relatedObjects is zero, if
     *                                  relatedObjects contains relatingObject.
     */
    public IfcRelAggregates(@NonNull IfcGloballyUniqueId globalId,
                            @NonNull IfcOwnerHistory ownerHistory,
                            IfcLabel name,
                            IfcText description,
                            @NonNull IfcObjectDefinition relatingObject,
                            @NonNull IfcObjectDefinition... relatedObjects) {
        super(globalId,
              ownerHistory,
              name,
              description,
              relatingObject,
              relatedObjects);
    }

    /**
     * Creates a new IfcRelAggregates and generates a pseudo random globalId,
     * and automatically modifies relatingObject and relatedObjects to make them
     * all contain a reference to this relationship, either in isDecomposedBy or
     * decomposes.
     *
     * @param ownerHistory   Assignment of the information about the current
     *                       ownership of that object, including owning actor,
     *                       application, local identification and information
     *                       captured about the recent changes of the object,
     *                       NOTE: only the last modification in stored.
     * @param name           Optional name for use by the participating software
     *                       systems or users. For some subtypes of IfcRoot the
     *                       insertion of the Name attribute may be required.
     *                       This would be enforced by a where rule.
     * @param description    Optional description, provided for exchanging
     *                       informative comments.
     * @param relatingObject The object that represents the nest or
     *                       aggregation.
     * @param relatedObjects The objects being nested or aggregated.
     * @throws NullPointerException     If ownerHistory, relatingObject or
     *                                  relatedObjects are null.
     * @throws IllegalArgumentException If the size of relatedObjects is zero,
     *                                  if relatedObjects contains
     *                                  relatingObject.
     */
    public IfcRelAggregates(@NonNull IfcOwnerHistory ownerHistory,
                            IfcLabel name,
                            IfcText description,
                            @NonNull IfcObjectDefinition relatingObject,
                            @NonNull IfcObjectDefinition... relatedObjects) {
        super(ownerHistory, name, description, relatingObject, relatedObjects);
    }
}
