import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String[] args) throws IOException {


        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        int amountBox = Integer.parseInt(bReader.readLine());
        int countBox = 1;
        int countContainer = 1;
        int countTruck = 1;


        while (true) { //машины
            if (countBox > amountBox) {
                break;
            }
            System.out.println("Грузовик " + countTruck + ":");

            for (int i = 0; i < 12; i++) { //контейнеры
                if (countBox > amountBox) {
                    break;
                }
                System.out.println("Контейнер " + countContainer + ":");

                for (int j = 0; j < 27; j++) { //ящики

                    System.out.println("Ящик " + countBox);
                    countBox++;
                    if (countBox > amountBox) {
                        break;
                    }

                }
                countContainer++;
            }
            countTruck++;
        }

        System.out.println("\nВсего портебовалось:\n" +
                (countTruck - 1) + " грузовик(ов/а)\n" +
                (countContainer - 1) + " контейнер(ов/а)");
    }
}
