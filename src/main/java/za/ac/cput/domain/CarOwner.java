package za.ac.cput.domain;
/**
 * Cx.java
 * Cx model class
 *
 * author : Rotondwa Rambau
 * studnr : 222342145
 * group : 3I
 */

public class CarOwner extends Customer {
    private double totalEarnings;

    public CarOwner(Builder builder) {
        super(builder);
        this.totalEarnings = builder.totalEarnings;
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }

    public static class Builder extends Customer.Builder{
        private double totalEarnings;
        public Builder(int customerId, String customerFirstName, String customerLastName, String customerUsername, String customerPassword, String customerStatus ,Address address , ContactDetails contactDetails){
            super(customerId, customerFirstName, customerLastName, customerUsername, customerPassword, customerStatus , address , contactDetails);

        }

        public Builder setTotalEarnings(double totalEarnings) {
            this.totalEarnings = totalEarnings;
            return this;
        }
        @Override
        public CarOwner build(){
            return new CarOwner(this);
        }
    }

}


