import java.util.ArrayList;

class ProductCatalog {
    private ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        long startTime = System.nanoTime();

        products.add(product);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("addProduct of " + product.getName() + " took " + duration + " nanoseconds");
    }

    Product findProductById(String id) {
        long startTime = System.nanoTime();
        Product foundProduct = null;

        for (Product product : products) {
            if (product.getId().equals(id)) {
                foundProduct = product;
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("findProductById took " + duration + " nanoseconds");
        return foundProduct;
    }

}