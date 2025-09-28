class Plane extends AbstractVehicleAdapter {
    public void start() {
        System.out.println("Plane engines starting...");
    }

    public void fly() {
        System.out.println("Plane flying in the sky.");
    }

    public void stop() {
        System.out.println("Plane landing and stopping.");
    }
}
