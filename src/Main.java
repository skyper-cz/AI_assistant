import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
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

            String odpoved = "";

            boolean funguje = false;

            for (int i = 0; i < veta.length; i++) {
                switch (veta[i]) {
                    case "time":
                        for (int y = 0; y < veta.length; y++) {
                            switch (veta[y]) {
                                case "now":
                                    odpoved = "Time now is: " + LocalTime.now();
                                    funguje = true;
                                    break;
                                case "london":
                                    ZoneId londonZoneId = ZoneId.of("Europe/London");
                                    ZonedDateTime londonTime = ZonedDateTime.now(londonZoneId);
                                    String londonTimeString = londonTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                                    odpoved = "Current time in London: " + londonTimeString;
                                    funguje = true;
                                    break;
                                case "belarus":
                                    ZoneId belarusid = ZoneId.of("Europe/London");
                                    ZonedDateTime belarustimezone = ZonedDateTime.now(belarusid);
                                    String belarustime = belarustimezone.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                                    odpoved = "Current time in Belarus: " + belarustime;
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
                    case "system":
                        for (int y = 0; y < veta.length; y++) {
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
                    case "tea":
                        for (int y = 0; y < veta.length; y++) {
                            switch (veta[y]) {
                                case "green":
                                    funguje = true;
                                    break;
                                case "black":
                                    funguje = true;
                                    break;
                                case "fruit":
                                    funguje = true;
                                    break;
                            }
                            break;
                        }
                        if (funguje == false) {
                            System.out.println("error 404 gun not found");
                        }
                        else {
                            System.out.println(odpoved);
                        }
                }
            }
        }
    }
}
