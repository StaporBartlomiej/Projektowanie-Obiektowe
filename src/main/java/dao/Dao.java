package dao;

import java.util.List;

public interface Dao<T> {

    void add(T t, boolean append);

    void remove(int id);

    void modify(int id, T newData);

    List<T> list();

}
