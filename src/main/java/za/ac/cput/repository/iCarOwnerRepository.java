package za.ac.cput.repository;

import za.ac.cput.domain.CarOwner;

import java.util.List;

public interface iCarOwnerRepository extends iRepository<CarOwner ,Integer>{
     List<CarOwner> getAll();
}
