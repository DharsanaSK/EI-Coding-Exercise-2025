package exp1.structural.composite;
import java.util.*;

public class Menu implements MenuComponent {
    private String name;
    private List<MenuComponent> items;

    public Menu(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void add(MenuComponent item) {
        items.add(item);
    }

    @Override
    public void display(int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println("[Menu] " + name);
        for (MenuComponent item : items) {
            item.display(indent + 1);
        }
    }
}

