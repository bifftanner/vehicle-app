public class Sportbike extends Motorcycle {
    private int maxLeanAngle;
    private int tractionControlLevel;
    private String licensePlate;

    public Sportbike(String make, String model, int topSpeed, int engineDisplacement, int passengerCapacity, int maxLeanAngle, int tractionControlLevel, String licensePlate) {
        super(make, model, topSpeed, engineDisplacement, passengerCapacity);
        this.maxLeanAngle = maxLeanAngle;
        this.tractionControlLevel = tractionControlLevel;
        this.licensePlate = licensePlate;
    }

    @Override
    public String Ride() {
        return getMake() + " " + getModel() + " riding track at high speed with " + maxLeanAngle + " degree lean angle and " + tractionControlLevel + " traction control level.";
    }
}
