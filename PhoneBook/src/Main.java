import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> catalog = new HashMap<>(); //номер -ключ, имя -данные
        String data;

        while (true) {
            System.out.println("Please, enter number or name: ");
            data = reader.readLine().trim();

            if (data.equals("LIST")) {

                List<String> list = new ArrayList<>();

                for (String key : catalog.keySet()) {
                    list.add(catalog.get(key) + " - " + key);
                }
                Collections.sort(list);
                for (String s : list) {
                    System.out.println(s);
                }
                continue;
            }

            if (isName(data)) {
                ArrayList<String> numberList = new ArrayList<>(); //коллекция найденных номеров для заданного имени

                for (String s : catalog.keySet()) {
                    if (catalog.get(s).equals(data)) {
                        numberList.add(catalog.get(s));
                    }
                }

                if (numberList.size() > 0) {
                    for (String s : numberList) {
                        System.out.println("Telephone number: " + s + "\nName: " + data);
                    }
                } else {
                    System.out.println("Number not found. Please, enter number: ");
                    String number = reader.readLine().trim();
                    if (isNumber(number)) {
                        if (catalog.get(number)== null) {
                            catalog.put(number, data);
                        }else {
                            System.out.println("Number already registered!");
                        }

                    } else {
                        System.out.println("Not correct entered the data. Please, again.");
                    }
                }

            } else if (isNumber(data)) {
                String name = catalog.get(data);
                if (name == null) {
                    System.out.println("Name not found. Please, enter name: ");
                    name = reader.readLine();
                    if (isName(name)) {
                        catalog.put(data, name);
                    } else {
                        System.out.println("Not correct entered the data. Please, again.");
                    }
                } else
                    System.out.println("Telephone number: " + data + "\nName: " + name);

            } else {
                System.out.println("Not correct entered the data. Please, again.");
            }
        }
    }

    static boolean isName(String data) {
        return data.matches("[\\D]+");
    }

    static boolean isNumber(String data) {
        return data.matches("[\\d]+");
    }
}

