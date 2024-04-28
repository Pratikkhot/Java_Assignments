
public class Orange extends Fruit {

    public Orange(String color, double weight) {
        super("Orange", color, weight);
    }

    @Override
    public String taste() {
        return "Sour";
    }
}
