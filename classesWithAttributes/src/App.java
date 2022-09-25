public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "laptop", "asus laptop", 3000, 2, "mavi");

        /*
         * product.setName("Laptop");
         * product.setId(1);
         * product.setDescription("asus");
         * product.setPrice(5000);
         * product.setStockAmount(3);
         */

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
