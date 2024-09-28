package com.fxsong.demo.crud.base;

import java.util.List;

public interface CrudService<T, ID> {
    T create(T entity);

    T modify(ID id, T entity);

    void remove(ID id);

    T findOne(ID id);

}
