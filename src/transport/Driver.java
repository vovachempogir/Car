package transport;

import exception.CarLicenceException;

public abstract class Driver {

    private String name;
    private boolean driverLicense;
    private int practiceDriveInYears;

    public Driver(String name, boolean driverLicense, int practiceDriveInYears) throws CarLicenceException {
        if (name == null || name.isEmpty()) {
            this.name = "Имя";
        } else {
            this.name = name;
        }
        if (driverLicense == true) {
            this.driverLicense = true;
        } else {
            throw new CarLicenceException(this, "без прав управлять автомобилем нельзя");
        }
        if (practiceDriveInYears <= 0) {
            this.practiceDriveInYears = 1;
        } else {
            this.practiceDriveInYears = practiceDriveInYears;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        driverLicense = driverLicense;
    }

    public int getPracticeDriveInYears() {
        return practiceDriveInYears;
    }

    public void setPracticeDriveInYears(int practiceDriveInYears) {
        this.practiceDriveInYears = practiceDriveInYears;
    }

    public abstract void startMove();
    public abstract void stopMove();
    public abstract void refillAuto();
}
