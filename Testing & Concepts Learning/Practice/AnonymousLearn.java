package Practice;
import java.io.Serializable;

@FunctionalInterface
interface Anonymous {
    void show();

    // void abc();
    default void display() {
        System.out.println("In Anonymous Interface Display Method");
    }
}

class TestAnonymous implements Anonymous, Serializable {
    public void show() {
        System.out.println("In Show Method of TestAnonymous Class");
    }

    public void display() {
        System.out.println("Display Method of TestAnonymous Class");
    }
}

/**
 * AnonymousLearn
 */
public class AnonymousLearn {

    public static void main(String[] args) {
        Anonymous a = () -> {
            System.out.println("In Show Method of Anonymous Class");
        };
        a.show();
    }
}