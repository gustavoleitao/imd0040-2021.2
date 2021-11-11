package aula06;

public class Main {

    public static void main(String[] args) {

        var builder01 = BuilderSimples.comNomeeIdade("Gustavo", 2010);
        var builder02 = BuilderSimples.comNomeeIdade("André", 1994);

        builder01.print();
        builder02.print();

    }

}
