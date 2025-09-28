public class VehicleAdapter {
    public static void main(String[] args) {
        InterfaceVehicle car = new Car();
        InterfaceVehicle boat = new Boat();
        InterfaceVehicle plane = new Plane();

        car.start();
        car.drive();
        car.stop();

        System.out.println();

        boat.start();
        boat.sail();
        boat.stop();

        System.out.println();

        plane.start();
        plane.fly();
        plane.stop();
    }
}
