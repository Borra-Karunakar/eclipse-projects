/*12.Create a class called Student with the following details: RollNo, StudName, MarksInEng, 
MarksInMaths and MarksInScience. Write getters and setters for the all variables. RollNo
should be automatically generated whenever a new student is added.

	     Create a class called Standard with 8 students’ details and write separate method for each of 
the following tasks and invoke the same.
1. To display the entire roll no and the name of the students in the class in the ascending order of roll no.
2. To display the roll no and the name of the student who has got the highest percentage.
3. To display the roll no and the name of the student who scored highest mark 
in mathematics.
4. To display the roll no and the name of the student in the ascending order of the total marks in mathematics and science alone.
5. To display the roll no, name, total marks, percentage and rank of all the students in the descending order of rank.
 */
package assignment;

import java.util.*;

class Student {
    private static int nextRoll = 1;

    private int rollNo;
    private String name;
    private int eng, math, science;

    public Student(String name, int eng, int math, int science) {
        this.rollNo = nextRoll++;
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.science = science;
    }

    // Getters
    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int getEng() { return eng; }
    public int getMath() { return math; }
    public int getScience() { return science; }

    public int getTotal() {
        return eng + math + science;
    }

    public double getPercentage() {
        return getTotal() / 3.0;
    }
}

public class Question12 {
    public static void main(String[] args) {
        // Create list of 8 students
        Student[] students = {
            new Student("Karunakar", 85, 90, 92),
            new Student("Akash", 78, 88, 80),
            new Student("Ravi", 65, 70, 68),
            new Student("Sita", 90, 95, 94),
            new Student("John", 60, 72, 68),
            new Student("Neha", 88, 85, 83),
            new Student("Ali", 75, 76, 79),
            new Student("Meera", 84, 91, 89)
        };

        // 1. Display roll no and name in ascending order of roll no
        System.out.println("All Students (by Roll No):");
        for (Student s : students) {
            System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getName());
        }

        // 2. Student with highest percentage
        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getPercentage() > topStudent.getPercentage()) {
                topStudent = s;
            }
        }
        System.out.println("\nHighest Percentage: " + topStudent.getName() +
                           " (" + topStudent.getPercentage() + "%)");

        // 3. Student with highest math marks
        Student bestMath = students[0];
        for (Student s : students) {
            if (s.getMath() > bestMath.getMath()) {
                bestMath = s;
            }
        }
        System.out.println("\nTopper in Math: " + bestMath.getName() +
                           " (" + bestMath.getMath() + " marks)");

        // 4. Students sorted by Math + Science total
        Arrays.sort(students, (s1, s2) ->
            Integer.compare(s2.getMath() + s2.getScience(), s1.getMath() + s1.getScience()));
        System.out.println("\nSorted by Math + Science Total:");
        for (Student s : students) {
            int msTotal = s.getMath() + s.getScience();
            System.out.println(s.getName() + ": " + msTotal);
        }

        // 5. Display total, percentage, and rank
        Arrays.sort(students, (s1, s2) ->
            Double.compare(s2.getPercentage(), s1.getPercentage()));

        System.out.println("\nRank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.printf("Rank %d: Roll No: %d, Name: %s, Total: %d, Percentage: %.2f%%\n",
                rank++, s.getRollNo(), s.getName(), s.getTotal(), s.getPercentage());
        }
    }
}

/*All Students (by Roll No):
Roll No: 1, Name: Karunakar
...

Highest Percentage: Sita (93.0%)
Topper in Math: Sita (95 marks)

Sorted by Math + Science Total:
Sita: 189
...

Rank List:
Rank 1: Roll No: 4, Name: Sita, Total: 279, Percentage: 93.00%
...
 */
