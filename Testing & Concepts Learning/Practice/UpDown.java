package Practice;
class A{
    void show1(){
        System.out.println("A");
    }
}

class B extends A{
    void show2(){
        System.out.println("B");
    }
}

class C extends A{
    void show3(){
        System.out.println("C");
    }
}


public class UpDown{
    public static void main(String[] args) {
        char c = 1;
        char c1 = 2;
        int i = c + c1;
        // System.out.println(i);
        while (i > 0) {
            System.out.println("hello");
            i--;
        }
        // if(false) System.out.println("hello");
    }
}