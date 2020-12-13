package firstNom;

public final class Drink {
    private int prize;
    private String name;
    private String text;

    public Drink(String name, String text) {
        this.name = name;
        this.text = text;
        this.prize=0;
    }

    public int getPrize() {
        return prize;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public Drink(int prize, String name, String text) {
        this.prize = prize;
        this.name = name;
        this.text = text;
    }
}
