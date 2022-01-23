package application;

public class Product implements Component{

    private String title;

    public Product(String title){
        this.title = title;
    }

    @Override
    public void show(String decalage) {
        System.out.println(decalage + this.title);
    }
}
