package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.List;

/**iRepository.java
 iRepository Model Class
 @Author: Ndyebo Qole 210018615
 @Student Number: 210018615
 **/

public interface  iBookingRepository  extends iRepository< Booking, Integer> {


    List<Booking> findAll();

}
