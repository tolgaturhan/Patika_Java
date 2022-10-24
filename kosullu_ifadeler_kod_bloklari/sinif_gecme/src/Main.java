import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;

        System.out.print("Matematik Notunuzu Girin: ");
        matematik = grade.nextInt();
        if (matematik > 100 || matematik < 0)
            matematik = 0;

        System.out.print("Fizik Notunuzu Girin: ");
        fizik = grade.nextInt();
        if (fizik > 100 || fizik < 0)
            fizik = 0;

        System.out.print("Türkçe Notunuzu Girin: ");
        turkce = grade.nextInt();
        if (turkce > 100 || turkce < 0)
            turkce = 0;

        System.out.print("Kimya Notunuzu Girin: ");
        kimya = grade.nextInt();
        if (kimya > 100 || kimya < 0)
            kimya = 0;

        System.out.print("Müzik Notunuzu Girin: ");
        muzik = grade.nextInt();
        if (muzik > 100 || muzik < 0)
            muzik = 0;

        int ort = (matematik + fizik + turkce + kimya + muzik)/6;
        System.out.println("Ortalamanız: " + ort);

        if (ort >= 55){
            System.out.println("Sınıfı Geçtiniz...");
        } else {
            System.out.println("Sınıfta Kaldınız...");
        }
    }
}
