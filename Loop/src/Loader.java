/**
 * Created by avalo on 02.08.2016.
 */
public class Loader {
    public static void main(String[] args) {

        /*
        *Цшикл DO WHILE отличается от цикла WHILE тем, что вначале выполняется итерация/заданное действие/тело цикал, а только потом проверка условия.
        *Преимущество такого цикла в том, что он будет выполнен в любом случае хотя бы один раз.
        */

        int i = 200000;
        do {
            System.out.println("Number: " + i);
            i++;
        }
        while (i < 210001);
    }
}
