public class Eroe extends Creatura{
    private int livello;
    private int AttaccoMagico;
    private Object inventario;
    private int puntiVita;
    private int moneta;

    public Eroe(String name, int livello, int puntiVita, int puntiAttacco, int AttaccoMagico, Object inventario, int moneta) {
        super(name, puntiVita, puntiAttacco);
        this.livello = 1;
        this.AttaccoMagico = AttaccoMagico;
        this.inventario = null;
        this.puntiVita = puntiVita;
        this.moneta = 0;
    }

    public int getLivello() {
        return livello;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public int getAttaccoMagico() {
        return AttaccoMagico;
    }

    public void setAttaccoMagico(int attaccoMagico) {
        AttaccoMagico = attaccoMagico;
    }

    public Object getInventario() {
        return inventario;
    }

    public void setInventario(Object inventario) {
        this.inventario = inventario;
    }

    public void saliLivello() {
        this.livello+=1;
    }

    @Override
    public String toString() {
        return "Eroe{" +
                "livello=" + livello +
                ", AttaccoMagico=" + AttaccoMagico +
                ", inventario=" + inventario +
                '}';
    }
}

