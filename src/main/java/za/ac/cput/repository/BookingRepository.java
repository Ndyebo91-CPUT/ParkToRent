package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.ArrayList;
import java.util.List;

/**
 * BookingRepository.java
 * BookingRepository Model Class
 *
 * @Author: Ndyebo Qole 210018615
 * @Student Number: 210018615
 **/
public class BookingRepository implements iBookingRepository {
    private static iBookingRepository repository= null;
    private List<Booking> bookingList;

    private BookingRepository(){
        bookingList= new ArrayList<Booking>();
    }

    public static iBookingRepository getInstance(){
        if(repository == null){
            repository = new BookingRepository();
        }
        return repository;
    }


    @Override
    public List<Booking> getAll() {
        return bookingList;
    }

    @Override
    public boolean create(Booking booking) {
        return bookingList.add(booking);
    }

    @Override
    public Booking read(Integer bookingId) {
        for(Booking book : bookingList){
            if(book.getBookingId()== bookingId){
                return book;
            }
        }


        return null;
    }

    @Override
    public Booking update(Booking booking) {
        for(int i = 0 ;i<bookingList.size();i++){
            Booking book = bookingList.get(i);
            if(book.getBookingId()==booking.getBookingId()){
                bookingList.set(i,booking);
                return  booking;
            }
        }

        return null;
    }

    @Override
    public boolean delete(Integer bookingId) {
        Booking book = read(bookingId);
        if(book!= null){
            bookingList.remove(book);
            return true;
        }

        return false;
    }
}
