import java.util.HashSet;

public class ProductManagerApp2 {

    public static void main(String[] args) {
        // Aufgabe 1 bis 3
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(new Product("1", "Apple"));
        catalog.addProduct(new Product("2", "Banana"));
        catalog.addProduct(new Product("3", "Cherry"));
        catalog.addProduct(new Product("4", "Kiwi"));
        catalog.addProduct(new Product("5", "Orange"));
        catalog.addProduct(new Product("6", "Peach"));
        catalog.addProduct(new Product("7", "Pineapple"));
        catalog.addProduct(new Product("8", "Strawberry"));
        catalog.addProduct(new Product("9", "Watermelon"));
        catalog.addProduct(new Product("10", "Grape"));
        catalog.addProduct(new Product("11", "Mango"));
        catalog.addProduct(new Product("12", "Papaya"));
        catalog.addProduct(new Product("13", "Pear"));
        catalog.addProduct(new Product("14", "Plum"));
        catalog.addProduct(new Product("15", "Raspberry"));
        catalog.addProduct(new Product("16", "Blueberry"));
        catalog.addProduct(new Product("17", "Blackberry"));
        catalog.addProduct(new Product("18", "Cranberry"));
        catalog.addProduct(new Product("19", "Gooseberry"));
        catalog.addProduct(new Product("20", "Lemon"));
        catalog.findProductById("1");

        // Aufgabe 4
        System.out.println(catalog.productCache.size());
        catalog.addProduct(new Product("20", "Lemon"));
        catalog.addProduct(new Product("21", "Lemon"));
        System.out.println(catalog.productCache.size());
        HashSet<String> productNames = new HashSet<>();
        for (Product product : catalog.productCache.values()) { // 2 Punkte
            productNames.add(product.getName()); // 2 Punkte
        }
        System.out.println(productNames.size());
    }

    // 4 Punkte

}
