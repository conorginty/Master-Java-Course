package Section_12_JavaCollections.SortedCollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> map;

    public Basket(String name) {
        this.name = name;
//        this.map = new HashMap<>(); // Unordered AND Unsorted
        this.map = new LinkedHashMap<>(); // ORDERED!!
//        this.map = new TreeMap<>(); // SORTED!!!
    }

    public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            // Checking to see whether that specific StockItem is in their Basket already
            int inBasket = map.getOrDefault(item, 0);
            map.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(map);
    }

    @Override
    public String toString() {
        String str = "Shopping basket " + name + " contains " + map.size() + (map.size()==1 ? " item" : " items") + "\n";
        double totalCost = 0d;
        for (Map.Entry<StockItem, Integer> item: map.entrySet()) {
            str += item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue(); // price * quantity
        }
        return str + "Total cost = " + totalCost;
    }
}
