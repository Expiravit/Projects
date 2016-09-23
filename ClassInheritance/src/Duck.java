class Duck extends Flying {
    Duck() {
        setWeight(200 + 600 * Math.random());
    }
    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    void sleep() {

    }

    @Override
    protected String getSound() {
        return "Кря-кря ";
    }

}
