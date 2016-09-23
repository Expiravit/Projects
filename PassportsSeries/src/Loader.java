import java.util.Calendar;

public class Loader {
    public static void main(String[] args) {

        final int firstYear = 1997;
        int lastYear = Calendar.getInstance().get(Calendar.YEAR);
        int arraysLength = lastYear - firstYear; //переменная для определения длины массива в зависимости от года запуска программы

        String[] regions = {"03", "40", "45"};
        String[][] seriesOfRegions = new String[arraysLength + 1][regions.length];

        System.out.println("Series passports: Krasnodar Territory, Sank-Petersburg, Moscow: ");

        for (int j = 0; j < regions.length; j++) {
            for (int i = 0; i <= arraysLength; i++) {
                int count = (firstYear + i) % 100;
                seriesOfRegions[i][j] = regions[j] + String.format("%02d", count);
                System.out.println(seriesOfRegions[i][j]);
            }
            System.out.println();
        }
    }
}
