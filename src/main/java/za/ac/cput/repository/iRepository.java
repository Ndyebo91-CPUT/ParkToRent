package za.ac.cput.repository;

/**
 * Booking.java
 * Booking model class
 *
 * @author : Ndyebo Qole
 * @studnr : 210018615
 * @group : 3I
 * @Java version: "21.0.3" 2024-04-16 LTS
 */


public interface iRepository<T , ID>{
        boolean create(T t);
        T read(ID id);
        T update(T t);
        boolean delete(ID id);

    }
