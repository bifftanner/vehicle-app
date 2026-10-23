public class Cruiser extends Motorcycle implements StreetLegal {
    private int saddlebagCapacity;
    private boolean hasPassengerBackrest;
    private String licensePlate;

    public Cruiser(String make, String model, int topSpeed, int engineDisplacement, int passengerCapacity, int saddlebagCapacity, boolean hasPassengerBackrest, String licensePlate) {
        super(make, model, topSpeed, engineDisplacement, passengerCapacity);
        this.saddlebagCapacity = saddlebagCapacity;
        this.hasPassengerBackrest = hasPassengerBackrest;
        this.licensePlate = licensePlate;
    }

    @Override
    public String Ride() {
        return getMake() + " " + getModel() + " is riding track at medium speed carrying " + saddlebagCapacity + " lbs of saddlebag capacity.";
    }

    @Override
    public String RideStreetLegal() {
        return getMake() + " " + getModel() + " is riding street legally at medium speed carrying " + saddlebagCapacity + " lbs of saddlebag capacity.";
    }
}
