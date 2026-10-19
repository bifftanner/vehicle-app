public class Cruiser extends Motorcycle {
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
        return getMake() + " " + getModel() + " riding street at medium speed carrying " + saddlebagCapacity + " saddlebag capacity.";
    }
}
