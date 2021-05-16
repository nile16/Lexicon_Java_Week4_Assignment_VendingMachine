package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class LexiconVending implements VendingMachine {

    private int deposit;
    private List<Product> products; //Array or List???

    private enum Denominations {
        ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), TWOHUNDRED(200), FIVEHUNDRED(500), THOUSAND(1000);

        private final int denomination;

        Denominations(int denomination) {
            this.denomination = denomination;
        }

        public int getDenomination() {
            return this.denomination;
        }
    }

    public LexiconVending() {
        this.products = new ArrayList<>();
        this.deposit = 0;

        this.products.add(new Fruit("Apple", 12));
    }

    @Override
    public void addCurrency(int amount) {
        for (Denominations d : Denominations.values()) {
            if (d.getDenomination() == amount) {
                this.deposit += amount;
            }
        }
    }

    @Override
    public Product request(int productNumber) {   // Remove product?
        if (products.get(productNumber).price <= deposit) {
            deposit -= products.get(productNumber).price;
            return products.get(productNumber);
        }
        return null;
    }

    @Override
    public int endSession() {
        int change = this.deposit;

        deposit = 0;
        return change;
    }

    @Override
    public String getDescription(int productNumber) {
        return products.get(productNumber).examine();
    }

    @Override
    public int getBalance() {
        return deposit;
    }

    @Override
    public String[] getProducts() {
        String[] productListing = new String[this.products.size()];

        for (int i = 0; i < this.products.size(); i++) {
            productListing[i] = i + ". " + this.products.get(i).examine();
        }
        return productListing;
    }
}
