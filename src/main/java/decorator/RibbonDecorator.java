package decorator;

public class RibbonDecorator extends ItemDecorator {
    private static final double EXTRA_COST = 4.0;

    public RibbonDecorator(Item decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public String getName() {
        return String.format("%s with Ribbon", super.getItem().getName());
    }

    @Override
    public double getPrice() {
        double originalPrice = super.getItem().getPrice();
        return originalPrice + EXTRA_COST;
    }
}
