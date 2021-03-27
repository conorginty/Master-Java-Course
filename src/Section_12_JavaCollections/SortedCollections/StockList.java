package Section_12_JavaCollections.SortedCollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    // Will hold all the StockItem instances in a Map
    private final Map<String, StockItem> map;

    public StockList() {
//        this.map = new HashMap<>(); // Unordered AND Unsorted
        this.map = new LinkedHashMap<>(); // ORDERED!!
//        this.map = new TreeMap<>(); // SORTED!!!
    }

    // add new stock to the inventory (map field), and we're updating them if there was already a StockItem with that name
    public int addStock(StockItem item) {
        if (item != null) {
            // Get the item if it already exists in the map, OR use the item that we've passed into the method
            // Check if we already have quantities of this item (i.e. was this already in the map).
            StockItem inStock = map.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity by the quantity that was passsed to this
            // method via the item argument that was passed in.
            if (inStock != item) {
                // So, if the items are not the same (i.e. it already existed in the map prior to the call of addStock),
                // then we are actually going to pass the value of whatever was already in the map into our current
                // item, so that we have the quantity both that existed prior to the call of this method, and also
                // the quantity that has been passed via the StockItem object
                item.adjustStockQuantity(inStock.getQuantity());
            }
            // However, either way, we're going to get an add entry written to our map, and if it already exists
            // automatically the .put() method will overwrite what's there, otherwise it'll just add it like it
            // normally would
            map.put(item.getName(), item);
            return item.getQuantity();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = map.getOrDefault(item, null);

        if ((inStock != null) && (inStock.getQuantity() >= quantity) && quantity > 0) {
            // Then make an adjustment (i.e. deduct from stock)
            inStock.adjustStockQuantity( - quantity);
            return quantity;
        }
        return 0; // Nothing was taken out of stock
    }

    public StockItem get(String key) {
        return map.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(map);
    }

    public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for (Map.Entry<String, StockItem> item: map.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    @Override
    public String toString() {
        String str = "\n===Stock List===\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item: map.entrySet()) {
            StockItem currentItem = item.getValue();
            double itemValue = currentItem.getPrice() * currentItem.getQuantity();

            str += currentItem + ". There are " + currentItem.getQuantity() + " in stock. Value of items = " + String.format("%.2f", itemValue) + "\n";
            totalCost += itemValue;
        }
        str += "Total stock value = " + String.format("%.2f", totalCost);
        return str;
        // N.B. - Something this long would NOT be done in practice, as print statements tend to be used for
        // Debugging Purposes.
    }
}
