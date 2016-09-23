
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(text);

        String number[] = text.split("\\s*,\\s*");

        System.out.println(Integer.parseInt(number[0].replaceAll("[^0-9]+",""))+
                Integer.parseInt(number[1].replaceAll("[^0-9]+",""))+
                Integer.parseInt(number[2].replaceAll("[^0-9]+","")));

    }

}