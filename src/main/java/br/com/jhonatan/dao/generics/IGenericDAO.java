package br.com.jhonatan.dao.generics;
import java.util.Collection;

import br.com.jhonatan.domain.Persistente;

public interface IGenericDAO <T extends Persistente>{
    public Boolean cadastrar(T entity);
    public void excluir(Long valor);
    public void alterar(T entity);
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
}
