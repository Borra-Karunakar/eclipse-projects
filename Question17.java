package assignment;

/*
Question 17:
Create a class Vehicle. Subclasses: Truck, Car, Bus.
Add common methods in Vehicle. Add specific methods in each subclass.
In the Road class, create objects for Truck, Bus, Car and call their methods.


*/

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Truck extends Vehicle {
    void carryLoad() {
        System.out.println("Truck is carrying heavy goods.");
    }
}

class Bus extends Vehicle {
    void pickPassengers() {
        System.out.println("Bus is picking up passengers.");
    }
}

class Car extends Vehicle {
    void runFast() {
        System.out.println("Car is running on highway.");
    }
}

public class Question17 {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Bus bus = new Bus();
        Car car = new Car();

        truck.move();
        truck.carryLoad();

        bus.move();
        bus.pickPassengers();

        car.move();
        car.runFast();
    }
}

/*
Output:
Vehicle is moving.
Truck is carrying heavy goods.
Vehicle is moving.
Bus is picking up passengers.
Vehicle is moving.
Car is running on highway.
*/
