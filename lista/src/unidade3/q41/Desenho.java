package unidade3.q41;

import unidade3.q40.FiguraGeometrica;

public class Desenho {
    FiguraGeometrica figura1;
    FiguraGeometrica figura2;

    public Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
    }

    public void apresenta(){
        figura1.descricao();
        figura2.descricao();
    }

}
