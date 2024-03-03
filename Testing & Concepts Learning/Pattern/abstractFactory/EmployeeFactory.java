package Pattern.abstractFactory;

public class EmployeeFactory {
    public static Employee getEmployee(AbstractFactoryEmployee employeeFactory) {
        return employeeFactory.createEmployee();
    }
}
