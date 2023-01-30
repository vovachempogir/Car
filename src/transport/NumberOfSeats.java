package transport;

public enum NumberOfSeats {
    NUMBER_OF_SEATS_EXTREMELY_SMALL(0, 10),
    NUMBER_OF_SEATS_SMALL(10, 25),
    NUMBER_OF_SEATS_MEDIUM(40, 50),
    NUMBER_OF_SEATS_LARGE(60, 80),
    NUMBER_OF_SEATS_EXTREMELY_LARGE(100, 120);

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
}
