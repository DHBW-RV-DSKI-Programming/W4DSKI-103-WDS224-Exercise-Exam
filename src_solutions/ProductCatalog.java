import java.util.ArrayList;
import java.util.HashMap;

class ProductCatalog {
    private ArrayList<Product> products = new ArrayList<>();
    public HashMap<String, Product> productCache = new HashMap<>(); // 2 Punkte

    void addProduct(Product product) {
        long startTime = System.nanoTime();

//        products.add(product);
        productCache.put(product.getId(), product); // 2 Punkte

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("addProduct of " + product.getName() + " took " + duration + " nanoseconds");
    }

    Product findProductById(String id) {
        long startTime = System.nanoTime();
        Product foundProduct = null;
//        for (Product product : products) {
//            if (product.getId().equals(id)) {
//                foundProduct = product;
//            }
//        }
        foundProduct = productCache.get(id); // 2 Punkte

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("findProductById took " + duration + " nanoseconds");
        return foundProduct;
    }

    // 6 Punkte

}