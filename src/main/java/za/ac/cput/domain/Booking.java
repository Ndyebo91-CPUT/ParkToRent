package za.ac.cput.domain;

public class Booking {

    private int bookingId;
    private String startDate;
    private String endDate;
    private double totalDurationHours;
    private double insuranceDeposit;
    private double totalRentalCost;
    private String status;

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

        public Builder(int bookingId, String startDate, String endDate, double totalDurationHours, double insuranceDeposit, double totalRentalCost, String status) {
            this.bookingId = bookingId;
            this.startDate = startDate;
            this.endDate = endDate;
            this.totalDurationHours = totalDurationHours;
            this.insuranceDeposit = insuranceDeposit;
            this.totalRentalCost = totalRentalCost;
            this.status = status;
        }

        public void setBookingId(int bookingId) {
            this.bookingId = bookingId;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public void setTotalDurationHours(double totalDurationHours) {
            this.totalDurationHours = totalDurationHours;
        }

        public void setInsuranceDeposit(double insuranceDeposit) {
            this.insuranceDeposit = insuranceDeposit;
        }

        public void setTotalRentalCost(double totalRentalCost) {
            this.totalRentalCost = totalRentalCost;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Booking build() {
            return new Booking(this);
        }

    }

}
