/* 3.The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
*/

package assignment;

public class Question3 {
    public static void main(String[] args) {
        int totalStudents = 90;
        int totalBoys = 45;

        int gradeAStudents = totalStudents / 2; // 50% of 90 = 45
        int boysWithGradeA = 20;

        int girlsWithGradeA = gradeAStudents - boysWithGradeA;

        System.out.println("Number of girls who got grade A: " + girlsWithGradeA);
    }
}
/* Number of girls who got grade A: 25
*/