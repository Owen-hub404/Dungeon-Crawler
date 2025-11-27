public class Creatura {
    private String name;
    private int puntiVita;
    private int puntiAttacco;

    public Creatura(String name, int puntiVita, int puntiAttacco) {
        this.name = name;
        this.puntiVita = puntiVita;
        this.puntiAttacco = puntiAttacco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public void attacca(Creatura nemico) {
        nemico.subisciDanno(puntiAttacco);
    }

    public void subisciDanno(int danno) {
        puntiVita -= danno;
        if (puntiVita < 0) puntiVita = 0;
    }

    public boolean isVivo() {
        return puntiVita > 0;
    }

    @Override
    public String toString() {
        return "Creatura{" +
                "name='" + name + '\'' +
                ", puntiVita=" + puntiVita +
                ", puntiAttacco=" + puntiAttacco +
                '}';
    }
}
