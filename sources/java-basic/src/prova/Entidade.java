package prova;

public abstract class Entidade {

    private long id;

    public Entidade(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
