package com.fxsong.demo.crud.system;

public interface CrudService<T, ID> {
    T create(T entity);

    T modify(ID id, T entity);

    void remove(ID id);

    T findById(ID id);

}
