/**
 * Created by avalo on 12.09.2016.
 */
public class Timer {
    private static double timer;

    static void setTimer(){ //установка таймера
        timer = System.nanoTime();
    }

    static double getTimer(){ //остановить таймер и получить кол-во мс
        return timer = (System.nanoTime() - timer)/1000000;
    }

    static String printTime(double time){ //остановить таймер и получить строку с мс
        return " (" + time + " ms)";
    }
}
