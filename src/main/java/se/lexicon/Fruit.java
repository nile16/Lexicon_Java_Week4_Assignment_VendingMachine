package se.lexicon;

public class Fruit extends Product{

    public Fruit(String name, int price) {
        super(name, price);
    }

    @Override
    public String use() {
        return "The " + super.name.toLowerCase() + " is eaten";
    }
}
