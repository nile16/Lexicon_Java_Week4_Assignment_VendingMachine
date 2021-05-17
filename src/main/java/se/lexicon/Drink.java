package se.lexicon;

public class Drink extends Product{

    public Drink(String name, int price, int kcal) {
        super(name, price, kcal);
    }

    @Override
    public String use() {
        return "The " + super.name.toLowerCase() + " is drunken";
    }
}
