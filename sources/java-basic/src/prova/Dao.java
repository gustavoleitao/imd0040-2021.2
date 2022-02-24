package prova;

import java.util.List;

public interface Dao<T extends Entidade> {

    boolean salvar(T input) throws DaoException;

    boolean atualizar(T input) throws DaoException;

    boolean removerPorId(long id) throws DaoException;

    List<T> buscarTodos() throws DaoException;

    T bucarPorId(long id) throws DaoException;

}
