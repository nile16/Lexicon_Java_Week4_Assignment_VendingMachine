package se.lexicon;

public class Fruit extends Product{

    public Fruit(String name, int price, int kcal) {
        super(name, price, kcal);
    }

    @Override
    public String use() {
        return "The " + super.name.toLowerCase() + " is eaten";
    }
}
