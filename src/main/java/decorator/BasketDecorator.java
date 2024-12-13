package decorator;

public class BasketDecorator extends ItemDecorator {
    private static final double ADDITIONAL_COST = 4.0;

    public BasketDecorator(Item baseItem) {
        super(baseItem);
    }

    @Override
    public String getName() {
        String baseName = super.getItem().getName();
        return String.format("%s with Basket", baseName);
    }

    @Override
    public double getPrice() {
        double basePrice = super.getItem().getPrice();
        return basePrice + ADDITIONAL_COST;
    }
}

