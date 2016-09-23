class Hen extends NotFlying {
    public Hen() {
        setWeight(80 + 300 * Math.random());
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eat() {
        //какой-то код
        super.drink(); // допустимо ли такое?
    }

    @Override
    void sleep() {

    }

    @Override
    protected String getSound() {
        return "Пок-пок ";
    }
}

