package aula05;

public enum Color {

    RED("#FF0000", "vermelho"),GREEN("#00FF00", "verde"),
    BLUE("#0000FF", "azul"), BLACK("#000000", "preto");

    private String hexCode;
    private String ptValue;

    Color(String hexCode, String ptValue){
        this.hexCode = hexCode;
        this.ptValue = ptValue;
    }

    public String getHexCode(){
        return hexCode;
    }

    public String getPtValue(){
        return ptValue;
    }

}
