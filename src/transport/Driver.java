package transport;

public abstract class Driver {

    private String name;
    private boolean DriverLicense;
    private int practiceDriveInYears;

    public Driver(String name, boolean driverLicense, int practiceDriveInYears) {
        this.name = name;
        DriverLicense = driverLicense;
        this.practiceDriveInYears = practiceDriveInYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return DriverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        DriverLicense = driverLicense;
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
