package Chapter11.Homework;

public class VehicleFactory {

    public static Horse getHorse() {
        return new Horse();
    }

    public static Boat getBoat() {
        return new Boat();
    }
}
