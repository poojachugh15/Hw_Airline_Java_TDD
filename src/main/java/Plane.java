public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane) {
        this.plane = plane;
    }

    public PlaneType getPlaneType() {
        return plane;
    }

    public int getStoreCapacity(){
        return plane.getCapacity();
    }
    public double getPlaneWeight(){
        return plane.getWeight();
    }

    public double CalTotalWeight(){
        return plane.getWeight() * 0.5  * 1000;
    }
}
