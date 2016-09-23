/**
 * Created by avalo on 18.09.2016.
 */
public abstract class Furniture {

private int legs = 4;

    public void stand(){

    }

    abstract public boolean isMobile();

    abstract public void material();
    //геттер
    public int getLegs (){
        return this.legs;
    }
    //сеттер
    public void setLegs(int numberOfLegs) {
        this.legs = numberOfLegs;
    }




}
