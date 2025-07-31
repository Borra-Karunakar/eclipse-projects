package assignment;

/*
Question 22:
Create interfaces Drawable and Fillable.
Implement them in Line, Circle, and Square classes.


*/

// Interface 1
interface Drawable {
    void drawingColor();
    void thickness();
}

// Interface 2
interface Fillable {
    void fillingColor();
    void size();
}

// Class 1
class Line implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Drawing Line with color: Black");
    }

    public void thickness() {
        System.out.println("Line thickness: 2px");
    }

    public void fillingColor() {
        System.out.println("Filling Line with color: White");
    }

    public void size() {
        System.out.println("Line size: Medium");
    }
}

// Class 2
class Circle implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Drawing Circle with color: Blue");
    }

    public void thickness() {
        System.out.println("Circle thickness: 3px");
    }

    public void fillingColor() {
        System.out.println("Filling Circle with color: Yellow");
    }

    public void size() {
        System.out.println("Circle size: Large");
    }
}

// Class 3
class Square implements Drawable, Fillable {
    public void drawingColor() {
        System.out.println("Drawing Square with color: Red");
    }

    public void thickness() {
        System.out.println("Square thickness: 4px");
    }

    public void fillingColor() {
        System.out.println("Filling Square with color: Green");
    }

    public void size() {
        System.out.println("Square size: Small");
    }
}

// Main class
public class Question22 {
    public static void main(String[] args) {
        Drawable d;
        Fillable f;

        Line line = new Line();
        d = line;
        f = line;
        d.drawingColor(); d.thickness(); f.fillingColor(); f.size();

        System.out.println();

        Circle circle = new Circle();
        d = circle;
        f = circle;
        d.drawingColor(); d.thickness(); f.fillingColor(); f.size();

        System.out.println();

        Square square = new Square();
        d = square;
        f = square;
        d.drawingColor(); d.thickness(); f.fillingColor(); f.size();
    }
}

/*
Output:
Drawing Line with color: Black
Line thickness: 2px
Filling Line with color: White
Line size: Medium

Drawing Circle with color: Blue
Circle thickness: 3px
Filling Circle with color: Yellow
Circle size: Large

Drawing Square with color: Red
Square thickness: 4px
Filling Square with color: Green
Square size: Small
*/
