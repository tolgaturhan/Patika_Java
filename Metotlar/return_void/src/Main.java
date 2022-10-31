public class Main {
    static int sum (int a,int b){
        int result = a+b;
        System.out.println(result);
        return result;
    }

    static void sum2 (int a, int b){
        int result = a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {

        int total = sum(3,4) + sum(2,7);    // IMPORTANT: Methods start within the ***Main*** method
        System.out.println(total);                      // Therefore, it prints the result of 7 first "sout(result)",
                                                        // then the result of 9 "sout(result)",
                                                        // and finally the result of 16 "sout(total)"

        sum2(4, 5); // The void method does not return any value, so it can only be printed from within the sum2 method.
        // "int test = sum2 (5, 7);" // cannot be assigned to a test value because this operation does not contain any results.

    }
}
