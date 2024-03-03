package Pattern.abstractFactory;

public class AndroidDevFactory extends AbstractFactoryEmployee{

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
    
}
