package aula08;

public class Oficina {

    public Veiculo proximo() {
        int code = (int) (Math.random() * 1000);
        if (code % 2 == 0) {
            return new Automovel();
        } else {
            return new Bicicleta();
        }
    }

    public void manter(Veiculo v) {
        v.checklist();
        v.adjust();
        v.cleanup();
    }

    public static void main(String[] args) {
        Oficina o = new Oficina();
        for (int i=0; i<4; ++i) {
            Veiculo v = o.proximo();
            o.manter(v);
        }
    }



}
