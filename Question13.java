/* 13. Create a class called Worker. Write classes DailyWorker and SalariedWorker that inherit from
Worker. Every worker has a name and a salaryrate. Write method Pay (int hours) to compute 
the week pay of every worker.  A Daily worker is paid on the basis of the number of days 
she/he works. The salaried worker gets paid the wage for 40 hours a week no matter what the
actual hours are.  Test this program to calculate the pay of workers. 
*/package assignment;

// Base class
class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public void pay(int hours) {
        System.out.println("Worker: " + name + ", Pay: ₹" + (salaryRate * hours));
    }
}

// Subclass: DailyWorker
class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Paid based on actual hours
    @Override
    public void pay(int hours) {
        double amount = hours * salaryRate;
        System.out.println("Daily Worker: " + name + ", Pay: ₹" + amount);
    }
}

// Subclass: SalariedWorker
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    // Always paid for 40 hours
    @Override
    public void pay(int hours) {
        double amount = 40 * salaryRate;
        System.out.println("Salaried Worker: " + name + ", Pay (fixed): ₹" + amount);
    }
}

// Main class
public class Question13 {
    public static void main(String[] args) {
        // Create DailyWorker and SalariedWorker objects
        DailyWorker dw = new DailyWorker("Ravi", 500);
        SalariedWorker sw = new SalariedWorker("Neha", 600);

        // Calculate pay
        dw.pay(6);  // Ravi worked 6 hours
        sw.pay(6);  // Neha worked 6 hours, but gets fixed for 40 hours
    }
}

/*Daily Worker: Ravi, Pay: ₹3000.0
Salaried Worker: Neha, Pay (fixed): ₹24000.0
 */
