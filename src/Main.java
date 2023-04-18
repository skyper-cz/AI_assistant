//import org.json.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Vítej uživasteli!");
        System.out.println("Dej mi frázi a já ti odpovím!");
        System.out.println("Anglicky PLS");

        while (true) {

            Scanner sc = new Scanner(System.in);
            String vlozeno = sc.nextLine();
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
                                    String ipAddress = InetAddress.getLocalHost().getHostAddress(); // Get the IP address of the local machine
                                    String apiUrl = "https://api.ipgeolocation.io/weather?apiKey=<YOUR_API_KEY>&ip=" + ipAddress; // Replace <YOUR_API_KEY> with your actual API key
                                    URL url = new URL(apiUrl);
                                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                                    connection.setRequestMethod("GET");
                                    connection.setRequestProperty("Content-Type", "application/json");

                                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                                    String inputLine;
                                    StringBuffer response = new StringBuffer();

                                    while ((inputLine = in.readLine()) != null) {
                                        response.append(inputLine);
                                    }
                                    in.close();

                                    //JSONObject json = new JSONObject(response.toString());
                                    //JSONObject current = json.getJSONObject("current");

                                    odpoved = "Today weather is: " + "terrible";
                                    break;
                                case "tommorow":
                                    funguje = true;
                                    odpoved = "Tommorow weather is terrible as it is today";
                                    break;
                                case "weekend":
                                    funguje = true;
                                    odpoved = "You thing it will change?";
                                    break;
                            }
                        }
                        break;
                    case "system":
                        for (int y = 0; y < veta.length; y++) {
                            switch (veta[y]) {
                                case "operating":
                                    funguje = true;
                                    String osName = System.getProperty("os.name").toLowerCase();
                                    odpoved = "Operating system is: " + osName;
                                    break;
                                case "goverment":
                                    funguje = true;
                                    odpoved = "Goverment is defacto totalian as puppet of US";
                                    break;
                                case "network":
                                    funguje = true;
                                    odpoved = "Network system is called Internet.";
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
                        }
                        break;
                }
            }
            if (!funguje) {
                System.out.println("error 404 gun not found");
            }
            else {
                System.out.println(odpoved);
            }
        }
    }
}
