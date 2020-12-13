package prak5;

public class rec13 {
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            System.out.println(n);
            int m = in.nextInt();
            if (m > 0) {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}
