package unidade3.q40;

public abstract class FiguraGeometrica {
    protected float x, y;
    
    public FiguraGeometrica(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public abstract void descricao();
}
