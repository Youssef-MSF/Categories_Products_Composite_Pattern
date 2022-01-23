import application.Category;
import application.Product;

public class Main {
    public static void main(String[] args) {

        Product removableProduct = new Product("remProduct1");

        Category category3 = new Category("category3");
        category3.addComponent(new Product("product3"));

        Category category2 = new Category("category2");
        category02.addComponent(category3);

        Category category1 = new Category("category1");
        category1.addComponents(new Product("product1"), new Category("category1"), category2);

        category3.deleteChild(removableProduct);

        category1.show("");
    }
}
