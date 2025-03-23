package unidade3.q40;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado, float x, float y) {
        super(x,y);
        this.lado = lado;
    }

    @Override
    public void descricao() {
        System.out.println("Cordenadas do centro do quadrado:");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Quadrado de lado " + lado);
    }                                                   

}
