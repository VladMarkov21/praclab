package secondNum;

public final class Drink implements Item {
    private int size;
    private String name;
    private String text;

    public int getSize() {
        return size;
    }

    public Drink(String name, String text) {
        this.name = name;
        this.text = text;
        this.size=0;
    }

    public Drink(int size, String name, String text) {
        this.size = size;
        this.name = name;
        this.text = text;
    }

    public int prize() {
        return this.size;
    }

    public String name() {
        return this.name;
    }

    public String text() {
        return this.text;
    }
}
