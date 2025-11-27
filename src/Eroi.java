public class Eroi {
    private String name;
    private int livello;
    private int puntiVita;
    private int puntiAttacco;
    private int AttaccoMagico;


    // Guarriero
    public Eroi(String name, int livello, int puntiVita, int puntiAttacco) {
        this.name = name;
        this.livello = 1;
        this.puntiAttacco = puntiAttacco;
        this.AttaccoMagico = 0;
    }

    //Mago/Elfo
    public Eroi(String name, int livello, int puntiVita, int puntiAttacco, int AttaccoMagico) {
        this.name = name;
        this.livello = 1;
        this.puntiAttacco = puntiAttacco;
        this.AttaccoMagico = AttaccoMagico;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getLivello() { return livello; }

    public void setLivello(int livello) { this.livello = livello; }

    public int getPuntiVita() { return puntiVita; }

    public void setPuntiVita(int puntiVita) { this.puntiVita = puntiVita; }

    public int getPuntiAttacco() { return puntiAttacco; }

    public void setPuntiAttacco(int puntiAttacco) { this.puntiAttacco = puntiAttacco; }

    public int getAttaccoMagico() { return AttaccoMagico; }

    public void setAttaccoMagico(int attaccoMagico) { AttaccoMagico = attaccoMagico; }

    public void aumentaLivello() { this.livello+=1; }

    @Override
    public String toString() {
        return "Eroi{" +
                "name='" + name + '\'' +
                ", livello=" + livello +
                ", puntiVita=" + puntiVita +
                ", puntiAttacco=" + puntiAttacco +
                ", AttaccoMagico=" + AttaccoMagico +
                '}';
    }
}
