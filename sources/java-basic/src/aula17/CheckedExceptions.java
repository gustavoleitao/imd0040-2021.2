package aula17;

import java.io.IOException;
import java.nio.file.*;

public class CheckedExceptions {

    public static void main(String[] args) throws IOException {
        CheckedExceptions checked = new CheckedExceptions();
        try {
            checked.doSomething();
        }catch (UncheckedEx ex){
            System.out.println("Saiu a mensagem vermelha");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }


    public void doSomething() {
        double value = Math.random();
        if (value > 0.5){
            System.out.println("tudo certo");
        }else{
            throw new UncheckedEx("Sorteado um número menor ou igual que 0.5: " + value);
        }
    }

    public void readFile() throws IOException {
        Path path = Paths.get("/algo/que/nao/existe.txt");
        Files.readAllBytes(path);
        System.out.println("Tudo certo ao ler o arquivo");
    }

    public void delete(){
        Path path = Paths.get("/algo/que/nao/existe.txt");
        try {
            Files.delete(path);
            System.out.println("Tudo certo!");
        } catch (NoSuchFileException | DirectoryNotEmptyException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Alguma falha ocorreu ao realizar a operacão");
        }
    }

}
