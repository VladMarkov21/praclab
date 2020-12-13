package Logik;

import lombok.Data;
import lombok.Getter;
import lombok.Value;


public class MenuItem {
    private int cost;
    private String name;
    private String description;

    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name+" - "+cost+"руб. "+"- " ;
    }

}
