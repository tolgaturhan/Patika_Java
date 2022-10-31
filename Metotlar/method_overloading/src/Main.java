public class Main {
    static void print (){
        System.out.println("Parametresiz metot.");
    }
    static void print (int n1){
        System.out.println(n1 + " int değerini ekrana basan parametreli metot.");
    }

    static void print (double n1){
        System.out.println(n1 + " double değerini ekrana basan parametreli metot.");
    }

    static int print (int a, int b){
        int result = a+b;
        return result;
    }

    static int print (int a, int b, int c){
        int result = a+b+c;
        return result;
    }

    public static void main(String[] args) {

        print();

        print(4);

        print(4.15);

        System.out.println(print(2 ,3) + " a+b değerini ekrana basan metot.");

        System.out.println(print(4, 5, 6) + " a+b+c değerini ekrana basan metot.");



    }
}
