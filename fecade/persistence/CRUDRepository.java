package fecade.persistence;

import java.util.List;

public interface CRUDRepository<T,k> {
    void save(T c);
    void deleteById(k id);
    List<T> getAll();
    boolean update(T c);

}
