public class Main {
    public static void main(String[] args) {
        int i = 1, k, left =100, right=1000;

        while (i <= 5) {
            System.out.println(i);
            k = 1;
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println("");
            i++;
        }

        while (++left < --right);

        System.out.println(left);
    }
}
