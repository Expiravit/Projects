class Frog extends Vertebrata {

    public Frog() {
        setWeight(5 + 100 * Math.random());
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    protected String getSound() {
        return "Ква-ква ";
    }

}
