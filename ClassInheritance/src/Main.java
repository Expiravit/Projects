import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        addAnimals(animals);
        Collections.sort(animals);
        for (Animal animal : animals) {
            animal.voice();
        }

    }

    private static void addAnimals(ArrayList<Animal> animals) {
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Frog());
        animals.add(new Mollusca());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Frog());
        animals.add(new Mollusca());
        animals.add(new Sparrow());
        animals.add(new Ostrich());
        animals.add(new Duck());
        animals.add(new Hen());
        animals.add(new Frog());
        animals.add(new Mollusca());
    }
}
