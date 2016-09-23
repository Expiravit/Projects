/**
 * Created by avalo on 15.09.2016.
 */
class Sparrow extends Flying {
    public Sparrow() {
        setWeight(20 + 50 * Math.random());
    }

    public void eat() {
        super.eat();
    }

    public void fly() {
        super.fly();
    }

    @Override
    void sleep() {

    }

    @Override
    protected String getSound() {
        return "Чирик-чирик ";
    }
}
