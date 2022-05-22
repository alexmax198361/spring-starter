package org.dmdev.repository;

import java.util.Optional;

public interface CrudRepository<T, V> {

    Optional<T> findById(V id);

    void delete(V id);

    String getBeanName();

}
