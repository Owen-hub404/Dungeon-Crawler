public class Elfo extends Eroe{

    public Elfo(String name) {
        super(name, 1, 90, 15, 10, null, 0);
    }

    @Override
    public String toString() {
        return "Elfo: " + super.toString();
    }
}
