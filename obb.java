class Car {
    void fuel() {
        System.out.println("All cars need fuel or energy.");
    }

    void start() {
        System.out.println("Car starts.");
    }
}

class Sedan extends Car {
    void luxury() {
        System.out.println("Sedan provides a comfortable ride.");
    }
}

class SUV extends Car {
    void offRoad() {
        System.out.println("SUV is suitable for off-road driving.");
    }
}

class SportsCar extends Car {
    void speed() {
        System.out.println("Sports car has high speed.");
    }
}

public class obb {
    public static void main(String[] args) {

        Sedan s = new Sedan();
        System.out.println("Sedan:");
        s.start();
        s.fuel();
        s.luxury();

        System.out.println();

        SUV u = new SUV();
        System.out.println("SUV:");
        u.start();
        u.fuel();
        u.offRoad();

        System.out.println();

        SportsCar sp = new SportsCar();
        System.out.println("Sports Car:");
        sp.start();
        sp.fuel();
        sp.speed();
    }
}