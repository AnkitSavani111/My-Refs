package Pattern.factory;

/**
 * EmployeeFactory
 */
public class EmployeeFactory {

    public static Employee getEmployee(String type) {
        if (type.trim().equalsIgnoreCase("Web")) {
            return new WebDeveloper();
        } else if (type.trim().equalsIgnoreCase("Android")) {
            return new AndroidDeveloper();
        } else {
            return null;
        }
    }

}