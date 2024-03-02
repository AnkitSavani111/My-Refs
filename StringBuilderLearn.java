public class StringBuilderLearn {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("          World");
        int capacity = sb.lastIndexOf("World");
        sb.trimToSize();
        System.out.println(capacity);
        System.out.println(sb);
    }
}
