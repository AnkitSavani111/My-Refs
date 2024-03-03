package Pattern.abstractFactory;

public class Client {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new WebDevFactory());
        employee.work();

        Employee employee2 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        employee2.work();
    }
}
