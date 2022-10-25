public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++){
            if (i ==5){
                System.out.println("i'nin değeri 5'tir");
                break;
            }
            System.out.println(i);
        }
        System.out.println("--------------------");
        for (int b = 1; b <=10; b++){
            if (b ==5){
                continue;
            }
            System.out.println(b);
        }
    }
}