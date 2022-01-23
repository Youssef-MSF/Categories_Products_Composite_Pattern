package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Category implements Component{

    private String title;
    private List<Component> components;

    public Category(String title) {
        this.title = title;
    }

    public void addComponent(Component component) {
        if(this.components == null){
            this.components = new ArrayList<>();
        }
        this.components.add(component);
    }

    public void addComponents(Component ... components) {
        if(this.components == null){
            this.components = new ArrayList<>();
        }
        this.components.addAll(Arrays.asList(components));
    }

    @Override
    public void show(String decalage) {
        System.out.println(decalage + this.title);
        if(components != null)
            for(Component component : components){
                component.show(decalage + "\t");
            }
    }

    public void deleteChild(Component child) {
        components.removeIf(component -> component == child);
    }
}
