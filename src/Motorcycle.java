public abstract class Motorcycle {
    private String make;
    private String model;
    private int topSpeed;
    private int engineDisplacement;
    private int passengerCapacity;

    public abstract String Ride();

    public Motorcycle(String make, String model, int topSpeed, int engineDisplacement, int passengerCapacity) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.engineDisplacement = engineDisplacement;
        this.passengerCapacity = passengerCapacity;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
