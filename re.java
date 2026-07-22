public class re {

    static int getSalary(String person) {
        if (person.equals("Owner")) {
            return 100000;
        } else if (person.equals("Manager")) {
            return 60000;
        } else {
            return 30000;
        }
    }

    public static void main(String[] args) {

        System.out.println("Owner Salary: " + getSalary("Owner"));
        System.out.println("Manager Salary: " + getSalary("Manager"));
        System.out.println("Employee Salary: " + getSalary("Employee"));
    }
}