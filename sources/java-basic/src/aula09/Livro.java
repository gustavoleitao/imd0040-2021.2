package aula09;

public abstract class Livro {

    abstract public boolean validar();

    abstract public void editar();

    public void salvar(){
        if (validar()){
            System.out.println("salvando...");
        }else{
            System.out.println("Não foi possível salvar!");
        }
    }

}
