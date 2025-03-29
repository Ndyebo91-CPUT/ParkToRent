package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.List;

public interface iBookingRepository  extends iRepository<Booking, Integer>{

    List<Booking>getAll();
}
