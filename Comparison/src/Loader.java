/**
 * Created by avalo on 02.08.2016.
 */
public class Loader {
    public static void main(String[] args) {

        int vasya = 28;
        int masha = 54;
        int igor = 28;

        int minAge, midAge, maxAge;

            //определение максимального возраста
            if (vasya > masha && vasya > igor) {
                maxAge = vasya;
            } else if (masha > vasya && masha > igor) {
                maxAge = masha;
            } else maxAge = igor;

            //определение минимального возраста
            if (vasya < masha && vasya < igor) {
                minAge = vasya;
            } else if (masha < vasya && masha < igor) {
                minAge = masha;
            } else minAge = igor;

            //определение среднего возраста
            if (minAge < vasya && vasya < maxAge) {
                midAge = vasya;
            } else if (minAge < masha && masha < maxAge) {
                midAge = masha;
            } else midAge = igor;

        if (vasya != masha && vasya != igor && masha != igor) {
            System.out.println("Minimum Age = " + minAge);
            System.out.println("Middle Age = " + midAge);
            System.out.println("Maximum Age = " + maxAge);
        }
        else {
            System.out.println("There is a match age!");
            System.out.println("Minimum Age = " + minAge);
            System.out.println("Maximum Age = " + maxAge);
        }

    }
}
