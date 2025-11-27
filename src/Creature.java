public class Creature {
    private String name;
    private int puntiVita;
    private int puntiAttacco;

    public Creature(String name, int puntiVita, int puntiAttacco) {
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

    public void subisciDanno(int danno) {
        puntiVita -= danno;
        if (puntiVita < 0 ) {
            puntiVita = 0;
        }
    }

    public void attacco(Mostro mostro) {
        int danno = this.puntiAttacco;
        mostro.subisciDanno(danno);
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", puntiVita=" + puntiVita +
                ", puntiAttacco=" + puntiAttacco +
                '}';
    }
}
