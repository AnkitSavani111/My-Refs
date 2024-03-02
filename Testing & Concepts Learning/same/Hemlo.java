package same;

class oldhemlo{
    public void print() {
        System.out.println("old Hemlo");
    }

}


public class Hemlo {
    public int i = 10;

    public void print() {
        System.out.println("Hemlo");
    }

    public static void main(String[] args) {
        // Hemlo h = new Hemlo(){
        //     public void print() {
        //         System.out.println("new Hemlo");
        //     }
        // };
        // Integer i = 10;
        // String s = "5";
        // System.out.println((Integer.bitCount(1000)));
        // h.print();
        oldhemlo oh = new oldhemlo(){
            public void print() {
                System.out.println("new Hemlo");
            }
        };

        oh.print();

        
    }


}

