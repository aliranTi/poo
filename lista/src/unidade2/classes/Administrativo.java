package unidade2.classes;

public class Administrativo extends Assistente {
    private String turno;

    public Administrativo(String nome, double salario, int matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override public double ganhoAnual() {
        return super.ganhoAnual() + (turno.equals("noite") ? 500 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTurno: " + this.turno + "\nGanho Anual: " + this.ganhoAnual();
    }

}
