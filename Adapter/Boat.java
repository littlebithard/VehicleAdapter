class Boat extends AbstractVehicleAdapter {
    public void start() {
        System.out.println("Boat starting...");
    }

    public void sail() {
        System.out.println("Boat sailing on the water.");
    }

    public void stop() {
        System.out.println("Boat stopping.");
    }
}
