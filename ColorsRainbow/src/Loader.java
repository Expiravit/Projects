/**
 * Created by avalo on 01.09.2016.
 */
public class Loader {
    public static void main(String[] args) {

        String[] colors = {"red", "orange", "yellow", "green", "cyan", "blue", "purple"};
        /**Распечатка массива в обратном порядке без фактического переворота элеметов*/

        for (int i = colors.length; i > 0; i--) {
            System.out.println(colors[i - 1]);
        }

        System.out.println("----------------------");
        /**Переворот массива и последующая распечатка по порядку*/

        for (int i = 0; i < colors.length / 2; i++) {
            String count = colors[i];
            colors[i] = colors[colors.length - i - 1];
            colors[colors.length - i - 1] = count;
        }

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
