class Ostrich extends NotFlying {
    public Ostrich() {
        setWeight(100 + 300 * Math.random());
    }

    public void run() {
        super.run();
    }

    public void eat() {
        super.drink();
    }

    @Override
    void sleep() {

    }

    @Override
    protected String getSound() {
        return "Кви-кви ";
    }

}
