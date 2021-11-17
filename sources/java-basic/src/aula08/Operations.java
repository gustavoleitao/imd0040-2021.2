package aula08;

public class Operations {

    public void operate(double op0, int ...op1){
        System.out.println("operando sobre double e varargs");
    }

    public int operate(double op){
        System.out.println("Operando sobre double");
        return 10;
    }

    public void operate(int op){
        System.out.println("operando sobre inteiro");
    }

    public void operate(int ...op){
        System.out.println(op.length);

        for (int i = 0; i < op.length ; i++){
            System.out.println(op[i]);
        }

    }

    public void operate(){
        System.out.println("sem parâmetros...");
    }

    public void operate(String op){
        System.out.println("operando sobre String");
    }

    public static void main(String ...args) {
        var op = new Operations();
        op.operate(10d, 0);
    }


}
