package assignment;

import java.util.*;
import java.util.stream.Collectors;

/*
Question 45:
Group StudentInfo objects by department using Map<String, List<StudentInfo>>.
Use Java 8 Streams and Collectors.groupingBy().
*/

class StudentInfo {
    private int id;
    private String name;
    private String department;

    public StudentInfo(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " - " + name + " (" + department + ")";
    }
}

public class Question45 {
    public static void main(String[] args) {
        List<StudentInfo> students = new ArrayList<>();

        // Sample data
        students.add(new StudentInfo(1, "Ravi", "CSE"));
        students.add(new StudentInfo(2, "Lakshmi", "CSE"));
        students.add(new StudentInfo(3, "Kiran", "ECE"));
        students.add(new StudentInfo(4, "Meena", "EEE"));
        students.add(new StudentInfo(5, "Sai", "ECE"));

        // Group by department
        Map<String, List<StudentInfo>> grouped = students.stream()
                .collect(Collectors.groupingBy(StudentInfo::getDepartment));

        // Print grouped output
        System.out.println("📚 Students Grouped by Department:");
        for (Map.Entry<String, List<StudentInfo>> entry : grouped.entrySet()) {
            System.out.println("\nDepartment: " + entry.getKey());
            for (StudentInfo s : entry.getValue()) {
                System.out.println("  ➤ " + s.getName());
            }
        }
    }
}

/*
📚 Students Grouped by Department:

Department: CSE
  ➤ Ravi
  ➤ Lakshmi

Department: ECE
  ➤ Kiran
  ➤ Sai

Department: EEE
  ➤ Meena
*/