package br.com.jhonatan.dao.generics;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.jhonatan.domain.Persistente;
import br.com.jhonatan.reflections.anotacao.cadastro.anotacao.TipoChave;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {

    protected Map<Class, Map<Long, T>> map;

    public GenericDAO() {
        if (this.map == null) {
            this.map = new HashMap<>();
        }
    }

    public abstract void atualizarDados(T entity, T entityCadastrado);


    public abstract Class<T> getTipoClasse();

    public Long getChave(T entity){

        Field[] fields = entity.getClass().getDeclaredFields();
        for (Field field: fields){
            if(field.isAnnotationPresent(TipoChave.class)){
                TipoChave tipoChave = field.getAnnotation(TipoChave.class);
                String nomeMetodo = tipoChave.value();
                try {
                    Method method = entity.getClass().getMethod(nomeMetodo);
                    Long value = (Long) method.invoke(entity);
                    return value;
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return null;
    }


    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Long chave = getChave(entity);
        if (this.map.containsKey(chave)) {
            return false;
        }
        mapaInterno.put(chave, entity);
        return true;
    }


    @Override
    public void excluir(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);

        if (objetoCadastrado != null) {
            mapaInterno.remove(valor, objetoCadastrado);
        }

    }

    @Override
    public void alterar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Long chave = getChave(entity);
        T objetoCadastrado = mapaInterno.get(chave);
        if (objetoCadastrado != null) {
            atualizarDados(entity, objetoCadastrado);
        }


    }

    @Override
    public T consultar(Long valor) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        return mapaInterno.values();
    }
}
