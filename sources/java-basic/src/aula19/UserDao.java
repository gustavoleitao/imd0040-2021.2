package aula19;

public class UserDao<T extends Dao<Double>> {

    void salvar(T input){
        input.save(10d);
    }

}
