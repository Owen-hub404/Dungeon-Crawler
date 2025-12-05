public class Mago extends Eroe{
    public Mago (String name){
        super(name, 1, 70, 5, 30, null, 0);
    }

    public void lanciaIncantesimo(Creatura mostro) {
        mostro.subisciDanno(getAttaccoMagico());
    }

    @Override
    public String toString() {
        return "Mago: " + super.toString();
    }
}
