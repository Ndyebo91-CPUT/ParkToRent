package za.ac.cput.domain;

public class Renter extends Customer {
    protected Renter(){

    }
    private  Renter(Builder builder) {
        super(builder);
    }

    public static class RenterBuilder extends Customer.Builder {
        public RenterBuilder(){}
        public RenterBuilder(int customerId, String customerFirstName, String customerLastName, String customerUsername, String customerPassword, String customerStatus ,Address address,ContactDetails contactDetails) {
            super(customerId, customerFirstName, customerLastName, customerUsername, customerPassword, customerStatus ,address,contactDetails);
        }
        @Override
        public Renter build() {
            return new Renter(this);
        }

    }

}
