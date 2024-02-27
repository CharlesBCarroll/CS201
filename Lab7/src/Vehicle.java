public abstract class Vehicle {
    public abstract boolean startTrip(Terrain t);
    public abstract boolean endTrip(Terrain t);
    public abstract boolean move(Terrain t);
    private double maxSpeed;
    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

