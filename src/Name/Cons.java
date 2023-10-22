package Name;

public class Cons {
    public Cons(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    private String name;
    private String price;

    @Override
    public String toString() {
        return String.format("%s, %d", name, price);
    }
}
