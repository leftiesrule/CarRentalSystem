public class Car {
    private int Model;
    private int YearOfManufacture;
    private boolean carStatus;
    private String serviceDate;
    private boolean reservationStatus;

    public Car(int Model, int YearOfManufacture, boolean carStatus, String serviceDate, boolean reservationStatus) {
        this.Model = Model;
        this.YearOfManufacture = YearOfManufacture;
        this.carStatus = carStatus;
        this.serviceDate = serviceDate;
        this.reservationStatus = reservationStatus;
    }

    public int getModel() {
        return Model;
    }

    public void setModel(int Model) {
        this.Model = Model;
    }

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int YearOfManufacture) {
        this.YearOfManufacture = YearOfManufacture;
    }

    public boolean isCarStatus() {
        return carStatus;
    }

    public void setCarStatus(boolean carStatus) {
        this.carStatus = carStatus;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }
}
