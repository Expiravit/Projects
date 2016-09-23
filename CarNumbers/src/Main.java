import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, String> catalog = new TreeMap<>();
        while (true) {
            System.out.println("Please, enter number of the car: ");
            String data = reader.readLine().trim();

            if (data.equals("LIST")) {
                for (String number : catalog.keySet()) {
                    System.out.println(number + " - " + catalog.get(number));
                }
                continue;
            }

            String name = catalog.get(data);
            if (name == null) {
                System.out.println("Number not found. Please enter name: ");
                name = reader.readLine().trim();
                catalog.put(data, name);
            } else System.out.println(data + " - " + catalog.get(data));
        }
    }
}
