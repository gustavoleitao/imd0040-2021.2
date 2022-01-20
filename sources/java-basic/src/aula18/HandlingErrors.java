package aula18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class HandlingErrors {

    public static void main(String[] args) {
        HandlingErrors erros = new HandlingErrors();
        erros.processaArquivo();
    }

    void processaArquivo(){
        try{
            List<Integer> data =  readFromFile("./imd0040-2021.2/sources/java-basic/src/aula18/input.txt");
            data.forEach(System.out::println);
        }catch (IOException e){
            System.out.println("Infelizmente não foi possível processar o arquivo. Verifique o caminho e tente de novo.");
        }
    }

    List<Integer> readFromFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        List<String> data = Files.readAllLines(path);
        return data.stream().map(Integer::parseInt).collect(Collectors.toList());
    }

}
