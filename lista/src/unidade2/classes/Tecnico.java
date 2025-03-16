package unidade2.classes;

public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial){
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual(){
        return super.ganhoAnual() + this.bonusSalarial;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBônus Salarial: " + this.bonusSalarial + "\nGanho Anual: " + this.ganhoAnual();
    }

    
}
