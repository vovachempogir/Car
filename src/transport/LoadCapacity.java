package transport;

public enum LoadCapacity {
    N1(0D, 3.5),
    N2(3.5, 12D),
    N3(12D, null);

    private final Double loadCapacityLowerLimit;
    private final Double loadCapacityUpperLimit;

    LoadCapacity(Double loadCapacityLowerLimit, Double loadCapacityUpperLimit) {
        this.loadCapacityLowerLimit = loadCapacityLowerLimit;
        this.loadCapacityUpperLimit = loadCapacityUpperLimit;
    }

    public Double getLoadCapacityLowerLimit() {
        return loadCapacityLowerLimit;
    }

    public Double getLoadCapacityUpperLimit() {
        return loadCapacityUpperLimit;
    }


    @Override
    public String toString() {
        return "Грузоподъесность от " + loadCapacityLowerLimit + " тонн до " + loadCapacityUpperLimit + " тонн";
    }
}
