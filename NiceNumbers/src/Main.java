import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static ArrayList<String> numbersList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time;
        boolean print;
        generationList();
        ArrayList<String> numbersListSorting = new ArrayList<>(numbersList); //создаем копию коллекции для отдельного,отсортированного списка
        Collections.sort(numbersListSorting);
        HashSet<String> hashList = new HashSet<>(numbersList);
        TreeSet<String> treeList = new TreeSet<>(numbersList);
        System.out.println("exit - выход из программы.");
        
        while (true) {
            System.out.println("Пожалуйста, введите номер автомобиля для проверки:");
            String data = reader.readLine().toLowerCase().trim();
            if (data.equals("exit")) {
                break;
            }
            /**Последовательный поиск*/
            System.out.println("Последовательный поиск в ArrayList------");
            Timer.setTimer();
            print = numbersList.contains(data);
            time = Timer.getTimer();
            System.out.print(print);
            System.out.println(Timer.printTime(time));
            /**Бинарный поиск*/
            System.out.println("Бинарный поиск в ArrayList------");
            Timer.setTimer();
            boolean b = Collections.binarySearch(numbersListSorting, data) >= 0;
            time = Timer.getTimer();
            System.out.println(b + Timer.printTime(time));
            /**Поиск в HashSet*/
            System.out.println("Последовательный поиск в HashMap-------");
            Timer.setTimer();
            print = hashList.contains(data);
            time = Timer.getTimer();
            System.out.print(print);
            System.out.println(Timer.printTime(time));
            /**Поиск в TreeSet*/
            System.out.println("Последовательный поиск в TreeSet------");
            Timer.setTimer();
            print = treeList.contains(data);
            time = Timer.getTimer();
            System.out.print(print);
            System.out.println(Timer.printTime(time));

        }

    }

    private static void generationList() {
        Pattern pattern = Pattern.compile("[0]{3}|[1]{3}|[2]{3}|[3]{3}|[4]{3}|[5]{3}|[6]{3}|[7]{3}|[8]{3}|[9]{3}");
        Matcher matcher = pattern.matcher("");
        String[] series = {"а", "в", "е", "к", "м", "н", "о", "р", "с", "т", "у", "х"};
        String count;
        System.out.println("Начата генерация номеров. Пожалуйста подождите...");
        long timer = System.currentTimeMillis();
        for (int r = 0; r < 12; r++) {
            for (int k = 0; k < 12; k++) {
                for (int t = 0; t < 12; t++) {
                    for (int j = 0; j < 199; j++) {
                        for (int i = 1; i <= 9; i++) {
                            count = series[r] + (i * 111) + series[k] + series[t] + String.format("%02d", j);
                            matcher = pattern.matcher(count);
                            if (matcher.find()) {
                                numbersList.add(count);
                            }
                        }
                    }
                }
            }
        }
        timer = System.currentTimeMillis() - timer;
        System.out.println("Генерация завершена за " + timer + " ms. Колличество номеров в базе составляет: " + numbersList.size());
    }

}
