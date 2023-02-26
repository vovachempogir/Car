package exception;

import transport.Driver;

public class CarLicenceException extends Exception {
    private final Driver driver;

    public CarLicenceException(Driver driver, String message) {
        super(message);
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }
}
