import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by avalo on 03.09.2016.
 */
public class Loader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> numbersAircrafts = new ArrayList<>();
        final byte sizeParking = 5;

        while (true) {
            String number = br.readLine().trim();
            if (number.equals("exitAll")) {
                for (int i = 0; numbersAircrafts.size() != 0; i++) {
                    System.out.println(numbersAircrafts.remove(0));
                }
            }
            else if (number.equals("exitLast")) {
                if (numbersAircrafts.size()> 0)
                System.out.println(numbersAircrafts.remove(0));
                else System.out.println("Parking is empty.");
            }
            else if (numbersAircrafts.size() < sizeParking)
                numbersAircrafts.add(0, number);

            else System.out.println("Sorry, parking is full. Please wait.");
        }
    }
}
