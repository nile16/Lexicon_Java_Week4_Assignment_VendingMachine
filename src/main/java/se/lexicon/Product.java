package se.lexicon;

public abstract class Product {

    protected String name;
    protected int price, kcal;

    protected Product(String name, int price, int kcal) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }

    public String examine() {
        return this.name + ", Price: " + this.price + ", Kcal: " + this.kcal;
    }

    public abstract String use();
}
