package decorator;

public abstract class ItemDecorator extends Item {
    private Item item;

    protected ItemDecorator(Item item) {
        super(item.getName(), item.getPrice());
        this.item = item;
    }

    protected Item getItem() {
        return item;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();
}