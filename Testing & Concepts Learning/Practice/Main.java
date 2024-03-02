package Practice;
class OuterClass {
    public void myMethod() {
        // Create an object of the inner class
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        // Call a method on the inner class
        innerClass.myInnerMethod();
        class InnerOfMyMethod {
            
        }
    }

    // Inner class
    public class InnerClass {
        public void myInnerMethod() {
            System.out.println("This is my inner class method");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.myMethod();
    }
}