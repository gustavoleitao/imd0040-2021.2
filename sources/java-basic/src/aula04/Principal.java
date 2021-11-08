
public class Principal {

    public static void main(String[] args) {

        // Comentário

        /*
            Comentário para
             várias linhas
        */

        // Tipo primitivos
        long varLong = Long.MAX_VALUE;
        int varInt = Integer.MAX_VALUE;
        short varShort = Short.MAX_VALUE;
        byte varByte = Byte.MAX_VALUE;
        char varChar = '%';
        float varFloat = Float.MAX_VALUE;
        double varDouble = Double.MAX_VALUE;

        // Operadores Matemáticos

        var soma = 10 + 39;
        var subtracao = 78 -76;
        var multiplicacao = 8 * 7;
        var divisao = 3 / 6;
        var resto = 9 % 2;

        // Operadores de comparação

        var r1 = 20 > 4; // maior que
        var r2 = 20 < 4; // menor que
        var r3 = 20 >= 4; // maior ou igual que
        var r4 = 20 <= 4; // menor ou igual que
        var r5 = 20 == 4; //igual
        var r6 = 20 != 4; //Diferente

        // Operadores Lógicos

        var r7 = (20 > 4) && (67 < 8); // AND lógico
        var r8 = (20 > 4) || (67 <8); // OR lógico

        // Operadores bit a bit

        var r9 = 0b1010 & 0b1; // And Bit a bit
        var r10 = 0b1010 | 0b1; // OR bit a bit
        var r11 = 0b1010 ^ 0b1; // XOR bit a bit

        // Condicional

        var leitura = 2;

        if (leitura > 10){
            System.out.println("Maior que 10");
        }else if (leitura < 5){
            System.out.println("Menor que 5");
        }else{
            System.out.println("Nenhuma condição foi satisfeita.");
        }

        if (leitura == 11) {
            System.out.println("Igual a 10");
        }

        // Switch

        switch (leitura){
            case 0:
                System.out.println("Igual a zero");
                break;
            case 2:
            case 3:
                System.out.println("Igual a 2 ou 3");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // Switch moderno =)

        switch (leitura){
            case 0,1 -> {
                System.out.println("Igual a zero ou 1");
            }
            case 2 -> System.out.println("Igual a 2");
            case 3 -> System.out.println("Igual a 3");
            default -> System.out.println("opção inválida!");
        }

    }

}