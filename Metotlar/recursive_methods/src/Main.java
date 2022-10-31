public class Main {
    static int f (int n){
        if (n == 1){
            System.out.print("Test => ");
            return 1;
        }
        int result = f(n-1) + n;
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        f(4);
        // f(4) = f(3) + 4
        // f(3) = f(2) + 3
        // f(2) = f(1) + 1
        // f(1) = 1

    }
}
