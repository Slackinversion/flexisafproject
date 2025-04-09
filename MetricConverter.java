class MetricConverter extends UnitConverter {
    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        double baseValue = switch (fromUnit.toLowerCase()) {
            case "km" -> value * 1000;
            case "cm" -> value / 100;
            case "mm" -> value / 1000;
            case "m" -> value;
            case "kg" -> value * 1000;
            case "g" -> value;
            case "mg" -> value / 1000;
            default -> throw new IllegalArgumentException("Invalid unit: " + fromUnit);
        };

        return switch (toUnit.toLowerCase()) {
            case "km" -> baseValue / 1000;
            case "cm" -> baseValue * 100;
            case "mm" -> baseValue * 1000;
            case "m" -> baseValue;
            case "kg" -> baseValue / 1000;
            case "g" -> baseValue;
            case "mg" -> baseValue * 1000;
            default -> throw new IllegalArgumentException("Invalid unit: " + toUnit);
        };
    }
}