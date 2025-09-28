class Car extends AbstractVehicleAdapter {
    public void start() {
        System.out.println("Car starting...");
    }

    public void drive() {
        System.out.println("Car driving on the road.");
    }

    public void stop() {
        System.out.println("Car stopping.");
    }
}