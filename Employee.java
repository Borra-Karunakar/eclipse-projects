package assignment;

public class Employee {
    private String code;
    private String name;
    private int age;

    public Employee(String code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Employee Code : " + code);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age  : " + age);
    }
}
