public class Car {
    private int Model;
    private int YearOfManufacture;
    private boolean carStatus;
    private String serviceDate;
    private boolean reservationStatus;
    private double feeStructure;
    private double taxDetails;

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

    public boolean isReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(boolean reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public double getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(double feeStructure) {
        this.feeStructure = feeStructure;
    }

    public double getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(double taxDetails) {
        this.taxDetails = taxDetails;
        totalFee();
    }

    public void totalFee() {
        feeStructure += taxDetails;
    }




}
