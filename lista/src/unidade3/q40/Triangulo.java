package unidade3.q40;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, float x, float y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void descricao() {
        System.out.println("Coordenadas do centro do Triangulo:");
        System.out.println("x = " + x + " y = " + y);
        System.out.println("Triangulo de base " + base + " e altura " + altura);
    }
    
}
