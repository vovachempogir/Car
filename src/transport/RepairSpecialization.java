package transport;

public enum RepairSpecialization {
    SPECIALIZATION_CAR("Ремонт легковых машин"),
    SPECIALIZATION_TRUCK("Ремонт грузовых машин"),
    SPECIALIZATION_BUS("Ремонт автобусов"),
    SPECIALIZATION_UNIVERSAL("Ремонт всех машин");
    private final String RepairSpecialization;

    RepairSpecialization (String repairSpecialization) {
        RepairSpecialization = repairSpecialization;
    }

    public String getRepairSpecialization() {
        return RepairSpecialization;
    }

    @Override
    public String toString() {
        return getRepairSpecialization();
    }
}
