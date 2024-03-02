package Pattern.singleton;
/**
 * Samosa
 */
public class Samosa {
    private int price;
    private static Samosa samosa;

    private Samosa() {
    }

    public static Samosa getInstance() {
        if (samosa == null) {

            synchronized(Samosa.class){
                samosa = new Samosa();
            }

        }
        return samosa;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}