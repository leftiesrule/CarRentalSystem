public class Reservation {
    private int customerId;
    private int reservationId;
    //Enable the following when a class/Interface named "Car" is made
    private Car car;
    private String startTime;
    private String endTime;
    private double feeStructure;

    // Constructor
    public Reservation(int customerId, int reservationId, Car car, String startTime, String endTime, double feeStructure) {
        this.customerId = customerId;
        this.reservationId = reservationId;
        this.car = car;

        this.startTime = startTime;
        this.endTime = endTime;
        this.feeStructure = feeStructure;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }
//Enable the following two functions when a class/Interface named "Car" is made
/*    public Car getCarGroup() {
        return carGroup;
    }

    public void setCarGroup(Car carGroup) {
        this.carGroup = carGroup;
    }*/

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public double getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(double feeStructure) {
        this.feeStructure = feeStructure;
    }

    public void setCarStatus(boolean carStatus) {
        car.setCarStatus(carStatus);
    }
}
