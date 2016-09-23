class Mollusca extends Invertebrates {
    public Mollusca() {
        setWeight(12 + 30 * Math.random());
    }

    @Override
    public boolean isCrawl() {
        return true;
    }

    @Override
    String getSound() {
        return "Во славу Сатаны! "; //честно, без понятия какие звуки они могут издавать =)
    }

}
