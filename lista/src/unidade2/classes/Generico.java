package unidade2.classes;

public class Generico<T>{
    T obj1;
    T obj2;
    T obj3;

    public Generico(T obj1, T obj2, T obj3){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void ehIgual(){
        if(obj1.equals(obj2) && obj2.equals(obj3)){
            System.out.println("Os objetos são iguais");
        }else{
            System.out.println("Os objetos são diferentes");
        }
    }

    public void imprime(){
        System.out.println("Objeto 1: " + obj1);
        System.out.println("Objeto 2: " + obj2);
        System.out.println("Objeto 3: " + obj3);
    }
}
