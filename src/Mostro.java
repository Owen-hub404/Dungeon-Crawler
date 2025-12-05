public class Mostro extends Creatura{
    private Object bottino;

    public Mostro(String name, int puntiVita, int puntiAttacco, Object bottino) {
        super(name, puntiVita, puntiAttacco);
        this.bottino = bottino;
    }

    public Object getBottino() {
        return bottino;
    }

    public void setBottino(Object bottino) {
        this.bottino = bottino;
    }

    public static int dropMonetina() {
        return (int) (Math.random() * 10) + 1;
    }

    @Override
    public String toString() {
        return "Mostro{" +
                "bottino=" + bottino +
                '}';
    }
}
