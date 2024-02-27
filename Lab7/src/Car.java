public class Car extends Vehicle {
    public boolean endTrip(Terrain t) {
        if ( t == Terrain.AIRPORT || t == Terrain.MARINA ) {
            return true;
        } else {
            return false;
        }
    }
    public boolean move(Terrain t) {
        if ( t == Terrain.AIRPORT || t == Terrain.MARINA || t == Terrain.ROAD ) {
            return true;
        } else {
            return false;
        }
    }
    public boolean startTrip(Terrain t) {
        if ( t == Terrain.AIRPORT || t == Terrain.MARINA ) {
            return true;
        } else {
            return false;
        }
    }
    public Car(double maxSpeed) {
        super(maxSpeed);
    }
}