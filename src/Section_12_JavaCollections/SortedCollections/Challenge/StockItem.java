package Section_12_JavaCollections.SortedCollections.Challenge;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantity;
    private int reserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
        this.reserved = 0;
    }

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity - reserved;
    }

    public void setPrice(double price) {
        if (price > 0d) {
            this.price = price;
        }
    }

    public void adjustStockQuantity(int quantity) {
        int newQuantity = this.quantity + quantity;
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        }
    }

    public int reserveStock(int quantity) {
        if (quantity <= getQuantity()) {
            reserved += quantity;
            return quantity;
        }
        return 0;
    }

    public int unreserveStock(int quantity) {
        if (quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public int finaliseStock(int quantity) {
        if (quantity <= reserved) {
            this.quantity -= quantity;
            reserved -= quantity;
            return quantity;
        }
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem obj) {
        if (this == obj) {
            return 0;
        }

        if (obj != null) {
            return this.name.compareTo(obj.getName());
        }

        // We don't want to compare something that's null, so...
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return name + " : price " + price + ". Reserved: " + reserved;
    }
}
