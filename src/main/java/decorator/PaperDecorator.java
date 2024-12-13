package decorator;

public class PaperDecorator extends ItemDecorator {
    private static final double WRAP_COST = 4.0;

    public PaperDecorator(Item wrappedItem) {
        super(wrappedItem);
    }

    @Override
    public String getName() {
        String itemName = super.getItem().getName();
        return String.format("%s, Wrapped in Paper", itemName);
    }

    @Override
    public double getPrice() {
        double basePrice = super.getItem().getPrice();
        return basePrice + WRAP_COST;
    }
}
