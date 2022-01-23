import application.Category;
import application.Product;

public class Main {
    public static void main(String[] args) {

        Product removableProduct = new Product("product");

        Category category3 = new Category("category3");
        category3.addComponent(new Product("product03"));

        Category category02 = new Category("category02");
        category02.addComponent(category3);

        Category category1 = new Category("category1");
        category1.addComponents(new Product("product1"), new Category("category01"), category02);

        category3.deleteChild(removableProduct);

        category1.show("");
    }
}
