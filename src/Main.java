import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vítej uživasteli!");
        System.out.println("Dej mi frázi a já ti odpovím!");
        System.out.println("Anglicky PLS");

        Scanner sc = new Scanner(System.in);
        String vlozeno = sc.next();
        String[] veta = vlozeno.split(" ");

    }
}
