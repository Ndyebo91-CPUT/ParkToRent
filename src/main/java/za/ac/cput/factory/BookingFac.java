package za.ac.cput.factory;
/**

 * author : Ndyebo Qole
 * studnr : 210018615
 * group : 3I
 */
import za.ac.cput.domain.Booking;

public class BookingFac {

    public static Booking createBooking(int bookingId, String startDate,
                                        String endDate, double totalDurationHours,
                                        double insuranceDeposit, double totalRentalCost,
                                        String status) {

        return new Booking.Builder()
                .setBookingId(bookingId)
                .setStartDate(startDate)
                .setEndDate(endDate)
                .setTotalDurationHours(totalDurationHours)
                .setInsuranceDeposit(insuranceDeposit)
                .setTotalRentalCost(totalRentalCost)
                .setStatus(status)
                .build();
    }
}


