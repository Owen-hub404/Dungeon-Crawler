public class Eroi extends Creature{
    private int livello;
    private int AttaccoMagico;

    public Eroi(String name, int livello, int puntiVita, int puntiAttacco, int AttaccoMagico) {
        super(name, puntiVita, puntiAttacco);
        this.livello = 1;
        this.AttaccoMagico = AttaccoMagico;
    }

    public int getLivello() { return livello; }

    public void setLivello(int livello) { this.livello = livello; }

    public int getAttaccoMagico() { return AttaccoMagico; }

    public void setAttaccoMagico(int attaccoMagico) { AttaccoMagico = attaccoMagico; }

    public void aumentaLivello() { this.livello+=1; }


    @Override
    public String toString() {
        return "Eroi{" +
                "livello=" + livello +
                ", AttaccoMagico=" + AttaccoMagico +
                '}';
    }
}

