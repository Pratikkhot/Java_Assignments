
public class Apple extends Fruit {

    public Apple(String color, double weight) {
        super("Apple", color, weight);
    }

    @Override
    public String taste() {
        return "Sweet and sour";
    }
}
