package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;
import java.util.Set;

/**
 * An assignment of one or many surface style elements to a surface, defined by
 * subtypes of
 * <I>IfcSurface</I>,
 * <I>IfcFaceBasedSurfaceModel</I>,
 * <I>IfcShellBasedSurfaceModel</I>, or by
 * subtypes of <I>IfcSolidModel</I>. The positive direction of the surface
 * normal relates to the positive side. In case of solids the outside of the
 * solid is to be taken as positive side.</P>
 * <BLOCKQUOTE><FONT SIZE="-1">NOTE: The surface style is often referred
 * to as material definition in rendering applications .</FONT></BLOCKQUOTE>
 * <BLOCKQUOTE>
 */
public class IfcSurfaceStyle extends IfcPresentationStyle {
    private final IfcSurfaceSide side;
    private final Set<IfcSurfaceStyleElementSelect> styles;

    //TODO: test constructor
    /**
     * @param name   Name of the presentation style.
     * @param side   An indication of which side of the surface to apply the
     *               style.
     * @param styles A collection of different surface styles.
     * @throws IllegalArgumentException If side or syles is null; if the size of
     *                                  styles is lower than 1 or bigger than 5;
     *                                  if styles contains more than one
     *                                  instance of each type that implements
     *                                  IfcSurfaceStyleElementSelect.
     */
    public IfcSurfaceStyle(IfcLabel name, @NotNull IfcSurfaceSide side,
                           @NotNull Set<IfcSurfaceStyleElementSelect> styles) {
        super(name);
        if (side == null) {
            throw new IllegalArgumentException("side cannot be null");
        }
        if (styles == null) {
            throw new IllegalArgumentException("styles cannot be null");
        }
        if (styles.size() < 1 || styles.size() > 5) {
            throw new IllegalArgumentException(
                    "size of styles cannot be lower than 1 nor bigger than 5");
        }

        int ifcSurfaceStyleShadingCounter = 0;
        int ifcSurfaceStyleLightingCounter = 0;
        int ifcSurfaceStyleRefractionCounter = 0;
        int ifcSurfaceStyleWithTexturesCounter = 0;
        int ifcExternallyDefinedSurfaceStyleCounter = 0;
        for (IfcSurfaceStyleElementSelect style : styles) {
            if (style instanceof IfcSurfaceStyleShading) {
                ifcSurfaceStyleShadingCounter++;
            } else if (style instanceof IfcSurfaceStyleLighting) {
                ifcSurfaceStyleLightingCounter++;
            } else if (style instanceof IfcSurfaceStyleRefraction) {
                ifcSurfaceStyleRefractionCounter++;
            } else if (style instanceof IfcSurfaceStyleWithTextures) {
                ifcSurfaceStyleWithTexturesCounter++;
            } else if (style instanceof IfcExternallyDefinedSurfaceStyle) {
                ifcExternallyDefinedSurfaceStyleCounter++;
            }
        }
        if (ifcSurfaceStyleShadingCounter > 1 ||
                ifcSurfaceStyleLightingCounter > 1 ||
                ifcSurfaceStyleRefractionCounter > 1 ||
                ifcSurfaceStyleWithTexturesCounter > 1 ||
                ifcExternallyDefinedSurfaceStyleCounter > 1) {
            throw new IllegalArgumentException(
                    "each type that implements IfcSurfaceStyleElementSelect " +
                            "shall only be used maximum once within styles");
        }

        this.side = side;
        this.styles = styles;
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
        IfcSurfaceStyle that = (IfcSurfaceStyle) o;
        return side == that.side && styles.equals(that.styles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side, styles);
    }
}
