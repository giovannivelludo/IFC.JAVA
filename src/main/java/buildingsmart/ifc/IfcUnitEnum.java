package buildingsmart.ifc;

/**
 * An enumeration type for allowed unit types of IfcNamedUnit.
 */
public enum IfcUnitEnum implements IfcDefinedType {
    ABSORBEDDOSEUNIT, AMOUNTOFSUBSTANCEUNIT, AREAUNIT, DOSEEQUIVALENTUNIT,
    ELECTRICCAPACITANCEUNIT, ELECTRICCHARGEUNIT, ELECTRICCONDUCTANCEUNIT,
    ELECTRICCURRENTUNIT, ELECTRICRESISTANCEUNIT, ELECTRICVOLTAGEUNIT, ENERGYUNIT, FORCEUNIT, FREQUENCYUNIT, ILLUMINANCEUNIT, INDUCTANCEUNIT,
    LENGTHUNIT, LUMINOUSFLUXUNIT, LUMINOUSINTENSITYUNIT, MAGNETICFLUXDENSITYUNIT, MAGNETICFLUXUNIT, MASSUNIT, PLANEANGLEUNIT,
    POWERUNIT, PRESSUREUNIT, RADIOACTIVITYUNIT, SOLIDANGLEUNIT,
    THERMODYNAMICTEMPERATUREUNIT, TIMEUNIT, VOLUMEUNIT, USERDEFINED;

    /**
     * @return The representation of the type in an IFC STEP file.
     */
    @Override
    public String serialize() {
        return "." + name() + ".";
    }
}
