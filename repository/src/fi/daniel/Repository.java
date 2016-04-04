package fi.daniel;

import java.util.List;

public interface Repository<T> {
    void add(T item);
    void add(Iterable<T> iterable);
    void update(T item);
    void remove(T item);
    void remove(Specification specification);
    List<T> query(Specification specification);

}
