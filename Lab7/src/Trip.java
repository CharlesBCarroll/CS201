public class Trip {
    private Terrain[] hops;
    public Trip(int numHops) {
        if (numHops < 2) {
            throw new IllegalArgumentException("Trips must have at least a start and finish");
        }
        this.hops = new Terrain[numHops];
    }
    public void setHop(int hop, Terrain t) {
        hops[hop] = t;
    }
    public boolean isTripPossible(Vehicle v) {
// Check the first hop
        if (!v.startTrip(hops[0])) {
            return false;
        }
// Check all hops between the first and last
        for (int i = 1; i < hops.length - 1; i++) {
            if (!v.move(hops[i])) {
                return false;
            }
        }
// Check the last hop
        if (!v.endTrip(hops[hops.length - 1])) {
            return false;
        }
// success!
        return true;
    }
}