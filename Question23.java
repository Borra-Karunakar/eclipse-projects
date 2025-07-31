package assignment;

import house.Hall;
import house.Kitchen;

/*
Question 23:
Package house with Hall and Kitchen.
Hall: print message without using System.
Kitchen: array + copy and print.


*/

public class Question23 {
    public static void main(String[] args) {
        Hall hall = new Hall();
        Kitchen kitchen = new Kitchen();

        hall.show();
        kitchen.showAppliances();
    }
}

/*
This is the first room while entering the house
Kitchen Appliances: [Fridge, Microwave, Stove, Blender]
Copied Appliances: [Fridge, Microwave, Stove, Blender]
*/
