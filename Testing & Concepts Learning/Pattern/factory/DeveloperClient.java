package Pattern.factory;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Web");
        employee.work();

        Employee employee2 = EmployeeFactory.getEmployee("Android");
        employee2.work();
    }
}
