/*14.Create a class called shape with the following methods
1. area
2. perimeter

                    Overload the area and perimeter method to calculate for both square and rectangle.
                    Create a main class and invoke the area method to calculate the area of the square and 
rectangle. Also invoke the perimeter method to calculate the perimeter of the square 
and rectangle.
 */
package assignment;

class Shape {
    // Area for square
    public void area(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    // Area for rectangle
    public void area(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

    // Perimeter for square
    public void perimeter(double side) {
        double perimeter = 4 * side;
        System.out.println("Perimeter of square: " + perimeter);
    }

    // Perimeter for rectangle
    public void perimeter(double length, double breadth) {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}

public class Question14 {
    public static void main(String[] args) {
        Shape s = new Shape();

        // Square: side = 5
        s.area(5);
        s.perimeter(5.0);

        // Rectangle: length = 6, breadth = 4
        s.area(6, 4);
        s.perimeter(6.0, 4.0);
    }
}
/* Area of square: 25
Perimeter of square: 20.0
Area of rectangle: 24
Perimeter of rectangle: 20.0
*/
