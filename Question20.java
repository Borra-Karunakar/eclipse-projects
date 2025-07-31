package assignment;

/*
Question 20:
Abstract class example using startEngine() and stopEngine() with Car and Motorcycle.
*/

abstract class MyVehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class MyCar extends MyVehicle {
    void startEngine() {
        System.out.println("Car engine started.");
    }

    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class MyMotorcycle extends MyVehicle {
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Question20 {
    public static void main(String[] args) {
        MyVehicle car = new MyCar();
        MyVehicle bike = new MyMotorcycle();

        car.startEngine();
        car.stopEngine();
        bike.startEngine();
        bike.stopEngine();
    }
}

/* 
Car engine started.
Car engine stopped.
Motorcycle engine started.
Motorcycle engine stopped.
*/
