public class CarGroup{
    private Car cars[];
    private double taxDetails;

    CarGroup(){
        this.cars = new Car[0];
    }

    CarGroup(Car car[]){
        this.cars = car;
    }

    double getTaxDetails(Reservation r){
        return r.getFeeStructure() * 0.10;
        // 10% Tax
    }

}