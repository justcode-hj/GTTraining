package Abstraction;

public class Employee extends Person{
    private int EmpId;

    public Employee(String EmployeeName, String Gen, int EmployeeID) {

        super(EmployeeName, Gen);

        this.EmpId = EmployeeID;

    }

    public void Office() {

        if (EmpId == 0) {

            System.out.println("Employee Logged Out");

        } else {

            System.out.println("Employee Logged In");

        }

    }

    public static void main(String args[]) {

        Person employee = new Employee("Pavithra", "Female", 1094826);

        employee.Office();

        employee.changeName("Pavithra Tripathy");

        System.out.println(employee.toString());

    }

    @Override

    public void work() {

// TODO Auto-generated method stub

    }

}
