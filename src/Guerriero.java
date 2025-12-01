public class Guerriero extends Eroe{
    public Guerriero(String name) {
        super(name, 1, 120, 20, 0, null);
    }

    public void attaccoPotente(Creatura mostro) {
        mostro.subisciDanno(getPuntiAttacco() * 2);
    }

    @Override
    public String toString() {
        return "Guerriero: " + super.toString();
    }
}
