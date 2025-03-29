package za.ac.cput.repository;

import za.ac.cput.domain.Car;

import java.util.List;

public interface iCarRepository extends iRepository<Car ,Integer> {
    List<Car> getAll();
}
