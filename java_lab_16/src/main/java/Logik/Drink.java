package Logik;

public final class Drink extends MenuItem {
    private DrinkTypeEnum type;

    public Drink( int cost, String name, String description,DrinkTypeEnum type){
        super(cost,name,description);
        this.type=type;

    }
}
