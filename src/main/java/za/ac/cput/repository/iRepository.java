package za.ac.cput.repository;

/**iRepository.java
iRepository Model Class
@Author: Ndyebo Qole 210018615
@Student Number: 210018615
 **/
public interface iRepository <T , ID>{
    boolean create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
