package aula05;

import java.util.Scanner;

public class Keyboard {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        while (true){
            System.out.print("Digite algo ou 0 para encerrar: ");
            String input = scanner.nextLine();

            if (input.equals("0")){
                System.out.println("Goodbye");
                break;
            }
            System.out.println(input);
        }

    }

}
