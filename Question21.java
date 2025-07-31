package assignment;

/*
Question 21:
Create an abstract class Person with abstract methods eat() and exercise().
Create subclasses Athlete and LazyPerson and implement how each eats and exercises.


*/

abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Athlete eats a high-protein diet.");
    }

    @Override
    void exercise() {
        System.out.println("Athlete trains hard every morning.");
    }
}

class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("LazyPerson eats fast food while lying on the couch.");
    }

    @Override
    void exercise() {
        System.out.println("LazyPerson barely moves a muscle.");
    }
}

public class Question21 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazy = new LazyPerson();

        athlete.eat();
        athlete.exercise();

        lazy.eat();
        lazy.exercise();
    }
}

/*
 Output:
Athlete eats a high-protein diet.
Athlete trains hard every morning.
LazyPerson eats fast food while lying on the couch.
LazyPerson barely moves a muscle.
*/
