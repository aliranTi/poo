package unidade1.classes;

public class NumComplexo {
    int real;
    int imaginario;

    public NumComplexo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumComplexo(int real){
        this.real = real;
        this.imaginario = 0;
    }

    public NumComplexo(){
        this.real = 0;
        this.imaginario = 0;
    }

    @Override
    public String toString(){
        return this.real + " + " + this.imaginario + "i";
    }
}
