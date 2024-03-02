import java.util.List;
import java.util.stream.Collectors;

class streamapi{
    public static void main(String[] args) {
        
        List<Integer> of = List.of(10, 17, 27, 25, 39, 40, 46, 23);
        System.out.println(of);

        List<Integer> collect = of.stream().filter(i -> i>25).collect(Collectors.toList());
        System.out.println(collect);
    }   
    
}