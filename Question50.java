package assignment;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question50 {
    public static void main(String[] args) {
        List<EmployeeStreamData> employees = Arrays.asList(
            new EmployeeStreamData(101, "Ravi", "HR", 50000),
            new EmployeeStreamData(102, "Priya", "IT", 60000),
            new EmployeeStreamData(103, "Arun", "HR", 55000),
            new EmployeeStreamData(104, "Kavya", "IT", 70000),
            new EmployeeStreamData(105, "Divya", "Sales", 45000)
        );

        // Q1
        employees.stream().map(EmployeeStreamData::getName).forEach(System.out::println);

        // Q2
        employees.stream().filter(e -> e.getSalary() > 55000).forEach(System.out::println);

        // Q3
        long hrCount = employees.stream().filter(e -> e.getDepartment().equals("HR")).count();
        System.out.println("HR count: " + hrCount);

        // Q4
        employees.stream().sorted(Comparator.comparingDouble(EmployeeStreamData::getSalary).reversed())
                .forEach(System.out::println);

        // Q5
        employees.stream().max(Comparator.comparingDouble(EmployeeStreamData::getSalary))
                .ifPresent(System.out::println);

        // Q6
        double avg = employees.stream().mapToDouble(EmployeeStreamData::getSalary).average().orElse(0);
        System.out.println("Average Salary: " + avg);

        // Q7
        List<String> names = employees.stream().map(EmployeeStreamData::getName).collect(Collectors.toList());
        System.out.println(names);

        // Q8
        Map<String, List<EmployeeStreamData>> grouped = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStreamData::getDepartment));
        System.out.println(grouped);

        // Q9
        Map<String, Double> totalSalByDept = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStreamData::getDepartment,
                        Collectors.summingDouble(EmployeeStreamData::getSalary)));
        System.out.println(totalSalByDept);

        // Q10
        employees.stream().filter(e -> e.getDepartment().equals("IT"))
                .sorted(Comparator.comparingDouble(EmployeeStreamData::getSalary))
                .map(EmployeeStreamData::getName).forEach(System.out::println);

        // Q11
        boolean hasLowSalary = employees.stream().anyMatch(e -> e.getSalary() < 40000);
        System.out.println("Any salary < 40000? " + hasLowSalary);

        // Q12
        String csvNames = employees.stream().map(EmployeeStreamData::getName)
                .collect(Collectors.joining(", "));
        System.out.println(csvNames);

        // Q13
        List<EmployeeStreamData> top2 = employees.stream()
                .sorted(Comparator.comparingDouble(EmployeeStreamData::getSalary).reversed())
                .limit(2).collect(Collectors.toList());
        System.out.println(top2);

        // Q14
        employees.stream().skip(2).forEach(System.out::println);

        // Q15
        employees.stream().limit(3).map(EmployeeStreamData::getName).forEach(System.out::println);

        // Q16
        employees.stream().filter(e -> e.getDepartment().equals("HR"))
                .min(Comparator.comparingDouble(EmployeeStreamData::getSalary))
                .ifPresent(System.out::println);

        // Q17
        Map<Boolean, List<EmployeeStreamData>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 55000));
        System.out.println(partitioned);

        // Q18
        Map<String, Double> avgSalByDept = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStreamData::getDepartment,
                        Collectors.averagingDouble(EmployeeStreamData::getSalary)));
        System.out.println(avgSalByDept);

        // Q19
        employees.stream()
                .sorted(Comparator.comparing(EmployeeStreamData::getName)
                        .thenComparing(EmployeeStreamData::getSalary))
                .forEach(System.out::println);

        // Q20
        Map<Integer, String> idToName = employees.stream()
                .collect(Collectors.toMap(EmployeeStreamData::getId, EmployeeStreamData::getName));
        System.out.println(idToName);

        // Challenge 1
        employees.stream()
                .filter(e -> e.getName().startsWith("D") && e.getName().endsWith("a"))
                .forEach(System.out::println);

        // Challenge 2
        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(EmployeeStreamData::getDepartment, Collectors.counting()));
        deptCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(System.out::println);

        // Challenge 3
        employees.stream().map(EmployeeStreamData::getSalary).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .ifPresent(s -> System.out.println("Second Highest: " + s));
    }
}


/*

Ravi
Priya
Arun
Kavya
Divya
102 - Priya - IT - ₹60000.0
104 - Kavya - IT - ₹70000.0
HR count: 2
104 - Kavya - IT - ₹70000.0
102 - Priya - IT - ₹60000.0
103 - Arun - HR - ₹55000.0
101 - Ravi - HR - ₹50000.0
105 - Divya - Sales - ₹45000.0
104 - Kavya - IT - ₹70000.0
Average Salary: 56000.0
[Ravi, Priya, Arun, Kavya, Divya]
{Sales=[105 - Divya - Sales - ₹45000.0], HR=[101 - Ravi - HR - ₹50000.0, 103 - Arun - HR - ₹55000.0], IT=[102 - Priya - IT - ₹60000.0, 104 - Kavya - IT - ₹70000.0]}
{Sales=45000.0, HR=105000.0, IT=130000.0}
Priya
Kavya
Any salary < 40000? false
Ravi, Priya, Arun, Kavya, Divya
[104 - Kavya - IT - ₹70000.0, 102 - Priya - IT - ₹60000.0]
103 - Arun - HR - ₹55000.0
104 - Kavya - IT - ₹70000.0
105 - Divya - Sales - ₹45000.0
Ravi
Priya
Arun
101 - Ravi - HR - ₹50000.0
{false=[101 - Ravi - HR - ₹50000.0, 103 - Arun - HR - ₹55000.0, 105 - Divya - Sales - ₹45000.0], true=[102 - Priya - IT - ₹60000.0, 104 - Kavya - IT - ₹70000.0]}
{Sales=45000.0, HR=52500.0, IT=65000.0}
103 - Arun - HR - ₹55000.0
105 - Divya - Sales - ₹45000.0
104 - Kavya - IT - ₹70000.0
102 - Priya - IT - ₹60000.0
101 - Ravi - HR - ₹50000.0
{101=Ravi, 102=Priya, 103=Arun, 104=Kavya, 105=Divya}
105 - Divya - Sales - ₹45000.0
HR=2
IT=2
Second Highest: 60000.0

*/