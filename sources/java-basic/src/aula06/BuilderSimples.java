package aula06;

public class BuilderSimples {

    private String nome;
    private int ano;

    private BuilderSimples(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public static BuilderSimples comNomeeIdade(String nome, int idade){
        return new BuilderSimples(nome, idade);
    }

    public void print(){
        System.out.println("Meu nome é: "+ nome + " nasci no ano de " + ano);
    }

}
