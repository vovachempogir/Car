package transport;

public enum NumberOfSeats {
    EXTREMELY_SMALL(0, 10),
    SMALL(10, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    EXTREMELY_LARGE(100, 120);

    private final Integer numberOfSeatsLowerLimit;
    private final Integer numberOfSeatsUpperLimit;

    NumberOfSeats(Integer numberOfSeatsLowerLimit, Integer numberOfSeatsUpperLimit) {
        this.numberOfSeatsLowerLimit = numberOfSeatsLowerLimit;
        this.numberOfSeatsUpperLimit = numberOfSeatsUpperLimit;
    }

    public Integer getNumberOfSeatsLowerLimit() {
        return numberOfSeatsLowerLimit;
    }

    public Integer getNumberOfSeatsUpperLimit() {
        return numberOfSeatsUpperLimit;
    }


    @Override
    public String toString() {
        return "Количество мест от " + numberOfSeatsLowerLimit + " до " + numberOfSeatsUpperLimit;
    }
}
