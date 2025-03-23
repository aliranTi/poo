package unidade3.q40;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio, float x, float y) {
        super(x, y);   
        this.raio = raio;
    }

    @Override
    public void descricao() {
        System.out.println("Coordenadas do centro do círculo:");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Circulo de raio " + raio);
    }
    
}
