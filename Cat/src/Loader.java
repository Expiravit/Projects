
public class Loader {
    public static void main(String[] args) {


        Cat vaska = new Cat();
        Cat darkness = new Cat();

        System.out.println(vaska.getWeight());
        System.out.println(darkness.getWeight());

        darkness.setClone(vaska);

        System.out.println(vaska.getWeight());
        System.out.println(darkness.getWeight());
    }

}