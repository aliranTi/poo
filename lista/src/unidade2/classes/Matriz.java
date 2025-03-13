package unidade2.classes;

public class Matriz {
    private float matriz[][];

    public Matriz(float n11, float n12, float n21, float n22){
        matriz = new float[2][2];
        matriz[0][0] = n11;
        matriz[0][1] = n12;
        matriz[1][0] = n21;
        matriz[1][1] = n22;
    }

    public float det(){
        return (this.matriz[0][0] * this.matriz[1][1]) - (this.matriz[0][1] * this.matriz[1][0]);
    }

    public String toString(){
        return this.matriz[0][0] + " " + this.matriz[0][1] + "\n" + this.matriz[1][0] + " " + this.matriz[1][1] + "\n";
    }
}
