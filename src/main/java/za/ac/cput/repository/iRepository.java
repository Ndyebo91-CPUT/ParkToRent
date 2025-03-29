package za.ac.cput.repository;

public interface iRepository <T , ID>{
    boolean create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
