import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vítej uživasteli!");
        System.out.println("Dej mi frázi a já ti odpovím!");
        System.out.println("Anglicky PLS");

        while (true) {

            Scanner sc = new Scanner(System.in);
            String vlozeno = sc.next();
            vlozeno = vlozeno.toLowerCase();
            String[] veta = vlozeno.split(" ");

            boolean funguje = false;

            for (int i = 0; i < veta.length; i++) {
                switch (veta[i]) {
                    case "time":
                        for (int y = 0; y < veta.length; y++) {
                            switch (veta[y]) {
                                case "now":
                                    funguje = true;
                                    break;
                                case "london":
                                    funguje = true;
                                    break;
                                case "belarus":
                                    funguje = true;
                                    break;
                            }
                        }
                        break;
                    case "weather":
                        for (int y = 0; y < veta.length; y++) {
                            switch (veta[y]) {
                                case "today":
                                    funguje = true;
                                    break;
                                case "tommorow":
                                    funguje = true;
                                    break;
                                case "weekend":
                                    funguje = true;
                                    break;
                            }
                        }
                        break;
                    case "system":for (int y = 0; y < veta.length; y++) {
                        switch (veta[y]) {
                            case "operating":
                                funguje = true;
                                break;
                            case "goverment":
                                funguje = true;
                                break;
                            case "network":
                                funguje = true;
                                break;
                        }
                    }
                        break;
                }
            if (funguje == false){
                System.out.println("error 404 gun not found");
            }
            }
        }
    }
}
