abstract class Animal implements Comparable<Animal> {

    private double weight; 

    @Override
    public int compareTo(Animal obj) {
        //return (int) Math.round(obj.weight - this.weight);
        if (this.weight > obj.weight)
            return -1;
        else if (this.weight < obj.weight)
            return +1;
        else
            return 0;
    }


    abstract String getSound();

    public void voice() {
        System.out.println(getSound() + String.format("%.2f", getWeight()));
    }

    public double getWeight() {
        return this.weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}
