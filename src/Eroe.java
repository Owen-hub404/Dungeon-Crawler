public class Eroe extends Creatura{
    private int livello;
    private int AttaccoMagico;
    private Object inventario;

    public Eroe(String name, int livello, int puntiVita, int puntiAttacco, int AttaccoMagico, Object inventario) {
        super(name, puntiVita, puntiAttacco);
        this.livello = 1;
        this.AttaccoMagico = AttaccoMagico;
        this.inventario = null;
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

    @Override
    public String toString() {
        return "Eroe{" +
                "livello=" + livello +
                ", AttaccoMagico=" + AttaccoMagico +
                ", inventario=" + inventario +
                '}';
    }
}

