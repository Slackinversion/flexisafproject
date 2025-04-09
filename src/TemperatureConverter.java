class TemperatureConverter extends UnitConverter {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("C") && toUnit.equalsIgnoreCase("F")) {
            return (value * 9/5) + 32;
        } else if (fromUnit.equalsIgnoreCase("C") && toUnit.equalsIgnoreCase("K")) {
            return value + 273.15;
        } else if (fromUnit.equalsIgnoreCase("F") && toUnit.equalsIgnoreCase("C")) {
            return (value - 32) * 5/9;
        } else if (fromUnit.equalsIgnoreCase("F") && toUnit.equalsIgnoreCase("K")) {
            return (value - 32) * 5/9 + 273.15;
        } else if (fromUnit.equalsIgnoreCase("K") && toUnit.equalsIgnoreCase("C")) {
            return value - 273.15;
        } else if (fromUnit.equalsIgnoreCase("K") && toUnit.equalsIgnoreCase("F")) {
            return (value - 273.15) * 9/5 + 32;
        }
        return value;
    }
}