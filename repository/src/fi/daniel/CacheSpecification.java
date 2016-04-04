package fi.daniel;

import java.util.List;

public interface CacheSpecification<T> extends Specification{
    T getItem();
    List<T> getItems();
}
