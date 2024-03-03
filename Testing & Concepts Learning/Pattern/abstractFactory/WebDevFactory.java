package Pattern.abstractFactory;

public class WebDevFactory extends AbstractFactoryEmployee{

    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
    
}
