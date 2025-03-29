package za.ac.cput.domain;

/**
 * Booking.java
 * Booking model class
 *
 * @author : Ndyebo Qole
 * @studnr : 210018615
 * @group : 3I
 * @Java version: "21.0.3" 2024-04-16 LTS
 */

public class Booking {

    private int bookingId;
    private String startDate;
    private String endDate;
    private double totalDurationHours;
    private double insuranceDeposit;
    private double totalRentalCost;
    private String status;

    public Booking(){

    }
    private Booking(Booking.Builder builder) {
        this.bookingId = builder.bookingId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.totalDurationHours = builder.totalDurationHours;
        this.insuranceDeposit = builder.insuranceDeposit;
        this.totalRentalCost = builder.totalRentalCost;
        this.status = builder.status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getTotalDurationHours() {
        return totalDurationHours;
    }

    public double getInsuranceDeposit() {
        return insuranceDeposit;
    }

    public double getTotalRentalCost() {
        return totalRentalCost;
    }

    public String getStatus() {
        return status;
    }


    public static class Builder {

        private int bookingId;
        private String startDate;
        private String endDate;
        private double totalDurationHours;
        private double insuranceDeposit;
        private double totalRentalCost;
        private String status;

        public  Builder(){

        }

        public Builder(int bookingId, String startDate, String endDate, double totalDurationHours, double insuranceDeposit, double totalRentalCost, String status) {
            this.bookingId = bookingId;
            this.startDate = startDate;
            this.endDate = endDate;
            this.totalDurationHours = totalDurationHours;
            this.insuranceDeposit = insuranceDeposit;
            this.totalRentalCost = totalRentalCost;
            this.status = status;
        }

        public Builder setBookingId(int bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setTotalDurationHours(double totalDurationHours) {
            this.totalDurationHours = totalDurationHours;
            return this;
        }

        public Builder setInsuranceDeposit(double insuranceDeposit) {
            this.insuranceDeposit = insuranceDeposit;
            return this;
        }

        public Builder setTotalRentalCost(double totalRentalCost) {
            this.totalRentalCost = totalRentalCost;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }

    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", totalDurationHours=" + totalDurationHours +
                ", insuranceDeposit=" + insuranceDeposit +
                ", totalRentalCost=" + totalRentalCost +
                ", status='" + status + '\'' +
                '}';
    }
}
