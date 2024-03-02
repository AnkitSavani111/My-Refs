package Pattern.singleton;

public class Jalebi {
    public static void main(String[] args) {
        Samosa samosa = Samosa.getInstance();
        samosa.setPrice(20);
        Samosa samosa2 = Samosa.getInstance();
        samosa2.setPrice(30);

        System.out.println(samosa.getPrice());
        System.out.println(samosa2.getPrice());
    }
}
