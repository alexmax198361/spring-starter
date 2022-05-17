package org.dmdev.repository;

public interface CrudRepository<T, V> {

    T findById(V id);

    void delete(V id);

}
