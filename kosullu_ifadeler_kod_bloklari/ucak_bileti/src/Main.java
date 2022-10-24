import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ticket = new Scanner(System.in);
        int km, way, age;
        double perKm = 0.1, ageDsc = 0, wayDsc = 0, price, total;

        System.out.print("Please Enter The Distance In Km (One-Way): ");
        km = ticket.nextInt();
        price = km * perKm;

        if (km < 1) {
            System.out.println("KM must be a positive Integer...");
        } else {
            System.out.print("Please Enter Passenger's Age: ");
            age = ticket.nextInt();
            if (age < 1) {
                System.out.println("Age must be a positive Integer...");
            } else {
                System.out.print("Please Select 1 for One-Way, 2 for Round-Trip: ");
                way = ticket.nextInt();
                if (way == 2 || way == 1) {
                    if (way == 1) {
                        wayDsc = 0;
                    }
                    if (way == 2) {
                        price = price * 2;
                        wayDsc = price * 0.2;
                    }
                    if (age < 12) {
                        ageDsc = price * 0.5;
                    }
                    if (age >= 12 && age <= 24) {
                        ageDsc = price * 0.1;
                    }
                    if (age > 65) {
                        ageDsc = price * 0.3;
                    }

                    System.out.println("Price is being calculated, please wait...");
                    total = price - wayDsc - ageDsc;
                    System.out.println("Price: " + price);
                    System.out.println("Age Discount: " + ageDsc);
                    System.out.println("Direction Discount: " + wayDsc);
                    System.out.println("Total Price: " + total);
                } else {
                    System.out.println("Can Be Select Only 1 or 2...");
                }
            }
        }
    }
}