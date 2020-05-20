package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;
import java.util.Set;

/**
 * The <i>IfcShapeModel</i> represents the concept of a particular geometric
 * and/or topological representation of a product's shape or a product
 * component's shape within a representation context. This representation
 * context has to be a geometric representation context (with the exception of
 * topology representations without associated geometry). The two subtypes are
 * <i>IfcShapeRepresentation</i>
 * to cover the geometric models (or sets) that represent a shape, and
 * <i>IfcTopologyRepresentation</i>
 * to cover the conectivity of a product or product component. The topology may
 * or may not have geometry associated.</p> The <i>IfcShapeModel</i> can be a
 * shape representation (geometric and/or topologogical) of a product (via
 * <i>IfcProductDefinitionShape</i>),
 * or a shape representation (geometric and/or topologogical) &nbsp;of a
 * component of a product shape (via <i>IfcShapeAspect</i>).<br>
 */
public class IfcShapeModel extends IfcRepresentation {
    private IfcShapeAspect ofShapeAspect; //inverse attribute

    /**
     * @param contextOfItems           Definition of the representation context
     *                                 for which the different subtypes of
     *                                 representation are valid.
     * @param representationIdentifier The optional identifier of the
     *                                 representation as used within a project.
     * @param representationType       The description of the type of a
     *                                 representation context. The
     *                                 representation
     *                                 type defines the type of geometry or
     *                                 topology used for representing the
     *                                 product representation. More information
     *                                 is given at the subtypes
     *                                 IfcShapeRepresentation
     *                                 and IfcTopologyRepresentation. The
     *                                 supported values for context type are to
     *                                 be specified by implementers agreements.
     * @param items                    Set of geometric representation items
     *                                 that are defined for this representation.
     * @throws IllegalArgumentException If contextOfItems or items are null; if
     *                                  the size of items is lower than 1.
     */
    public IfcShapeModel(@NotNull IfcRepresentationContext contextOfItems,
                         IfcLabel representationIdentifier,
                         IfcLabel representationType,
                         @NotNull Set<IfcRepresentationItem> items) {
        super(contextOfItems, representationIdentifier, representationType,
                items);
    }

    /**
     * @param contextOfItems           Definition of the representation context
     *                                 for which the different subtypes of
     *                                 representation are valid.
     * @param representationIdentifier The optional identifier of the
     *                                 representation as used within a project.
     * @param representationType       The description of the type of a
     *                                 representation context. The
     *                                 representation
     *                                 type defines the type of geometry or
     *                                 topology used for representing the
     *                                 product representation. More information
     *                                 is given at the subtypes
     *                                 IfcShapeRepresentation
     *                                 and IfcTopologyRepresentation. The
     *                                 supported values for context type are to
     *                                 be specified by implementers agreements.
     * @param items                    Set of geometric representation items
     *                                 that are defined for this representation.
     * @throws IllegalArgumentException If contextOfItems or items are null; if
     *                                  the size of items is lower than 1.
     */
    public IfcShapeModel(@NotNull IfcRepresentationContext contextOfItems,
                         IfcLabel representationIdentifier,
                         IfcLabel representationType,
                         @NotNull IfcRepresentationItem... items) {
        super(contextOfItems, representationIdentifier, representationType,
                items);
    }

    //TODO: test setters
    //TODO: call setters when this object is used by the types passed as
    // arguments in the setters, do the inverse in IfcRelDecomposes

    /**
     * @param ofShapeAspect Reference to the shape aspect, for which it is the
     *                      shape representation.
     * @throws IllegalStateException If ofProductRepresentation or
     *                               representationMap is already set (the
     *                               IfcShapeModel shall be used by an
     *                               IfcProductRepresentation, by an
     *                               IfcRepresentationMap or by an
     *                               IfcShapeAspect).
     */
    public void setOfShapeAspect(IfcShapeAspect ofShapeAspect) {
        if ((this.ofProductRepresentation != null ||
                this.representationMap != null) && ofShapeAspect != null) {
            throw new IllegalStateException(
                    "ofProductRepresentation or representationMap is already" +
                            " set!");
        }
        this.ofShapeAspect = ofShapeAspect;
    }

    /**
     * @param representationMap Use of the representation within an
     *                          IfcRepresentationMap. If used, this
     *                          IfcRepresentation may be assigned to many
     *                          representations as one of its Items using an
     *                          IfcMappedItem. Using IfcRepresentationMap is the
     *                          way to share one representation (often of type
     *                          IfcShapeRepresentation) by many products.
     * @throws IllegalStateException If ofProductRepresentation or ofShapeAspect
     *                               is already set (the IfcShapeModel shall be
     *                               used by an IfcProductRepresentation, by an
     *                               IfcRepresentationMap or by an
     *                               IfcShapeAspect).
     */
    @Override
    public void setRepresentationMap(IfcRepresentationMap representationMap) {
        if ((this.ofProductRepresentation != null ||
                this.ofShapeAspect != null) && representationMap != null) {
            throw new IllegalStateException(
                    "ofProductRepresentation or ofShapeAspect is already" +
                            " set!");
        }
        super.setRepresentationMap(representationMap);
    }

    /**
     * @param ofProductRepresentation Reference to the product shape, for which
     *                                it is the shape representation.
     * @throws IllegalStateException If ofShapeAspect or representationMap is
     *                               already set (the IfcShapeModel shall be
     *                               used by an IfcProductRepresentation, by an
     *                               IfcRepresentationMap or by an
     *                               IfcShapeAspect).
     */
    @Override
    public void setOfProductRepresentation(
            IfcProductRepresentation ofProductRepresentation) {
        if ((this.ofShapeAspect != null || this.representationMap != null) &&
                ofProductRepresentation != null) {
            throw new IllegalStateException(
                    "ofShapeAspect or representationMap is already" + " set!");
        }
        super.setOfProductRepresentation(ofProductRepresentation);
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
        IfcShapeModel that = (IfcShapeModel) o;
        return Objects.equals(ofShapeAspect, that.ofShapeAspect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ofShapeAspect);
    }
}
