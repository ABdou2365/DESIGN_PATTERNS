package com.abdellah.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        String tab = tab();
        System.out.println(tab + "Folder =>" + name);
        for (Component component : components) {
            component.print();
        }

    }

    public Component addChild(Component component) {
        components.add(component);
        component.level = this.level + 1;
        return component;
    }

    public Component getChild(String name) {
        for (Component component : components) {
            if (component.name == name) {
                return component;
            }
        }
        return null;
    }
}
