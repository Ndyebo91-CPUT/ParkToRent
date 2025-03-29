package za.ac.cput.repository;





import za.ac.cput.domain.Airport;

import java.util.ArrayList;
import java.util.List;

public interface iAirportRepository extends iRepository<Airport,Integer> {
    List<Airport> getAll();
}
