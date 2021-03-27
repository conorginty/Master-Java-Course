package Section_12_JavaCollections.SortedCollections;

import java.util.Map;

public class Main {

    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem currentItem = new StockItem("Xylophone", 0.86, 100);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Cake", 1.10, 7);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Cake", 1.10, 7);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Car", 12.50, 2);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Chair", 62.00, 10);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Cup", 0.50, 200);
        stockList.addStock(currentItem);
        // Adding extra Cups (and at a different price)
        currentItem = new StockItem("Cup", 0.45, 1); // THIS CHANGES THE ORIGINAL PRICE FROM 0.5 -> 0.45???
        stockList.addStock(currentItem);

        currentItem = new StockItem("Door", 72.95, 4);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Juice", 2.50, 36);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Phone", 96.99, 35);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Towel", 2.40, 80);
        stockList.addStock(currentItem);

        currentItem = new StockItem("Vase", 8.76, 40);
        stockList.addStock(currentItem);

        System.out.println(stockList);
        System.out.println("====================");

//        for (String s: stockList.Items().keySet()) {
//            System.out.println(s);
//        }

        // === Selling Stock ===
        Basket timsBasket = new Basket("Tim's Basket");
        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        // Should get an error this time (as there were only 2 cars in stock)
        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        // Should fail (Spanners don't exist)
        sellItem(timsBasket, "Spanner", 1000);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Juice", 3);
        sellItem(timsBasket, "Cup", 20);
        sellItem(timsBasket, "Xylophone", 1);
        sellItem(timsBasket, "Door", 2);
        System.out.println(timsBasket);

        System.out.println("-------------");
        System.out.println(stockList);

        System.out.println("================");

        // Trying to insert a product that doesn't exist via Items() - N.B. - Unmodifiable map, so will fail!
//        currentItem = new StockItem("Pen", 1.12);
//        stockList.Items().put(currentItem.getName(), currentItem); // ERROR: Exception in thread "main" java.lang.UnsupportedOperationException

        // 2 Ways to adjust the stock...
        stockList.Items().get("Car").adjustStockQuantity(2000);
        stockList.get("Car").adjustStockQuantity(-500);
        System.out.println(stockList); // We should have 1500 cars
        // N.B. - So although we couldn't add new stock items (due to unmodifiable map), we COULD modify existing items
        // N.B. - It is the Collection itself (i.e. map) that is unmodifiable, NOT the elements contained within it
        System.out.println("===============");

        for (Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs: " + price.getValue());
        }
    }
    public static int sellItem(Basket basket, String item, int quantity) {
        // Retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("Sorry, we don't sell: " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity; // To show how many were sold
        }
        return 0; // There wasn't sufficient stock to sell
    }
}
