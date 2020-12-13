package secondNum;

public class Dish implements Item, Comparable<Item> {
    private int prize;
    private String name;
    private String text;

    public int getPrize() {
        return prize;
    }

    public Dish(String name, String text) {
        this.name = name;
        this.text = text;
        this.prize=0;
    }

    public Dish(int prize, String name, String text) {
        this.prize = prize;
        this.name = name;
        this.text = text;
    }

    public int prize() {
        return this.prize;
    }

    public String name() {
        return this.name;
    }

    public String text() {
        return this.text;
    }

    public int compareTo(Item o) {
        if(this.prize>o.prize()) return 1;
        if(this.prize<o.prize()) return -1;
        if(this.prize==o.prize()) return  0;
        return 0;
    }
}
