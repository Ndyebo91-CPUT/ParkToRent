package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.List;

/**
 * Booking.java
 * Booking model class
 *
 * @author : Ndyebo Qole
 * @studnr : 210018615
 * @group : 3I
 * @Java version: "21.0.3" 2024-04-16 LTS
 */


public interface  iBookingRepository  extends iRepository<Booking, Integer> {

List<Booking> getAll();

}
