package Practice;
/**
 * learn
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Check
 */
class Check extends Test {
    public Check() {
        super(5);
        System.out.println("Check");
    }
}

/**
 * Test
 */
class Test<abc>  extends Thread{

    abc a;

    public Test(abc a) {
        this.a = a;
    }


    public Test() {
        //TODO Auto-generated constructor stub
    }
}

public class Learn extends Check {



    // private static final List<Integer> Arrays = null;

    public Learn() {
        System.out.println("learn");
    }

    public static void main(String[] args) throws InterruptedException {
        // Learn t = new Learn();
        Scanner sc = new Scanner(System.in);
        
        

        Test t  = new Test(123);
        // System.out.println(t.a.getClass().getName());

        
        // ArrayList
        // Collections.sort()

        StringBuilder sb = new StringBuilder("My Name is Ankit Savani"); // total length is  23
        // sb.append(sc.nextLine());
        // sb.delete(5, 10);
        sb.insert(2, "Hello");
        // System.out.println(sb.toString());
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        hm.put(1, 2);
        Vector<Integer> v = new Vector<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(1);
        // System.out.println(al.indexOf(1));
        // HashSet<Integer> hs = new HashSet<>();

        // System.out.println(Math.log(1000)/Math.log(10));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer<Integer> con = ;

        list.forEach(numbers -> System.out.println(numbers));
        Stream
    }
}
