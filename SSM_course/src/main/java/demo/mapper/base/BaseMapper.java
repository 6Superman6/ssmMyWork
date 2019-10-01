package demo.mapper.base;

import java.util.List;

public interface BaseMapper<T> {

    public String insert(T t);

    public String delete(Integer id);

    public String update(T t);

    public T select(Integer id);

    public List<T> findAll();

    public int getCountById(Integer id);

    public T selectByUsername(String username);

}
