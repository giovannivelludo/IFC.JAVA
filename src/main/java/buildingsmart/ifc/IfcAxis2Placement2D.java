package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

/**
 * The location and orientation in two dimensional space of two mutually
 * perpendicular axes. An axis2_placement_2d is defined in terms of a point,
 * (inherited from the placement supertype), and an axis. It can be used to
 * locate and originate an object in two dimensional space and to define a
 * placement coordinate system. The class includes a point which forms the
 * origin of the placement coordinate system. A direction vector is required to
 * complete the definition of the placement coordinate system. The reference
 * direction defines the placement X axis direction, the placement Y axis is
 * derived from this.
 */
public class IfcAxis2Placement2D extends IfcPlacement
        implements IfcAxis2Placement {
    private final IfcDirection refDirection;
    //private IfcDirection[] P;

    /**
     * @param location     The geometric position of a reference point, such as
     *                     the center of a circle, of the item to be located.
     *                     Cannot be null
     * @param refDirection The direction used to determine the direction of the
     *                     local X Axis.
     * @throws IllegalArgumentException If location is null or it is not
     *                                  bidimensional, if refDirection is not
     *                                  null and not bidimensional.
     */
    public IfcAxis2Placement2D(@NotNull IfcCartesianPoint location,
                               IfcDirection refDirection) {
        super(location);
        if (refDirection != null && refDirection.getDim().getValue() != 2) {
            throw new IllegalArgumentException(
                    "if refDirection is not null, it must be bidimensional");
        }
        if (location.getDim().getValue() != 2) {
            throw new IllegalArgumentException(
                    "location must be bidimensional");
        }
        this.refDirection = refDirection;
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
        IfcAxis2Placement2D that = (IfcAxis2Placement2D) o;
        return Objects.equals(refDirection, that.refDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), refDirection);
    }
}
