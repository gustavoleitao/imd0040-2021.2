package exer;

import java.util.Date;

public class Vinculos {

    private Date dataInicial;
    private Date dataFinal;
    private String cnpj;

    public Vinculos(Date dataInicial, Date dataFinal, String cnpj) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cnpj = cnpj;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public String getCnpj() {
        return cnpj;
    }
}
