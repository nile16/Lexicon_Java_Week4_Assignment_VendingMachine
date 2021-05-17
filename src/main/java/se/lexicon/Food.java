package se.lexicon;

public class Food extends Product{

    public Food(String name, int price, int kcal) {
        super(name, price, kcal);
    }

    @Override
    public String use() {
        return "The " + super.name.toLowerCase() + " is consumed";
    }
}
