package Section_12_JavaCollections.SortedCollections;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantity;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
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
        return quantity;
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
        return this.name + " : price " + this.price;
    }
}
