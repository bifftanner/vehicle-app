public class Dirtbike extends Motorcycle {
    private String engineType;
    private int suspensionTravel;

    public Dirtbike(String make, String model, int topSpeed, int engineDisplacement, int passengerCapacity, String engineType, int suspensionTravel) {
        super(make, model, topSpeed, engineDisplacement, passengerCapacity);
        this.engineType = engineType;
        this.suspensionTravel = suspensionTravel;
    }

    @Override
    public String Ride() {
        return getMake() + " " +  getModel() + " hit a jump with " + suspensionTravel + " suspension travel";
    }
}
