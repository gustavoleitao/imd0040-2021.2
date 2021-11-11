package aula06;

public class Estatico {

    public static double PI = 3.14;

    void print(){
        System.out.println(PI);
    }

    public static void printPi(){
        System.out.println(PI);
    }

    void alterar(){
        PI = Math.random();
    }

}
