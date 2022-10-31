public class Main {
    static void ex1(int a, int b) {
        a = 25;
        b = 24;
        System.out.println(a + " - " + b);
    }

    static void ex2(int a, int b) {
        a = 15;
        b = 14;
        System.out.println(a + " - " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        // a separate "a" & "b" value can be defined in each method
        ex1(a, b);

        ex2(a, b);

        System.out.println(a + " - " + b);

    }
}
