package za.ac.cput.repository;
/**

 * author : Ndyebo Qole
 * studnr : 210018615
 * group : 3I
 */
import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.List;

public interface iBookingRepository  extends iRepository<Booking, Integer>{

    List<Booking>getAll();
}
