package aula06;

public class Referencia {

    private double ultimoSorteio;

    public void sortear(){
        ultimoSorteio = Math.random();
    }

    public void print(){
        System.out.println(ultimoSorteio);
    }

}
