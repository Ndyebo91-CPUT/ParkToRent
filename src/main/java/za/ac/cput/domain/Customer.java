package za.ac.cput.domain;
/**
 * Cx.java
 * Cx model class
 *
 * author : Rotondwa Rambau
 * studnr : 222342145
 * group : 3I
 */

public class Customer {

    private int customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerUsername;
    private String customerPassword;
    private String customerStatus;
    private Address address;//aggregation
    private ContactDetails contactDetails;//composition

    protected Customer(){

    }
    protected Customer(Builder builder) {
        this.customerId = builder.customerId;
        this.customerFirstName = builder.customerFirstName;
        this.customerLastName = builder.customerLastName;
        this.customerUsername = builder.customerUsername;
        this.customerPassword = builder.customerPassword;
        this.customerStatus = builder.customerStatus;

    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public Address getAddress() {
        return address;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public static class Builder{
        private int customerId;
        private String customerFirstName;
        private String customerLastName;
        private String customerUsername;
        private String customerPassword;
        private String customerStatus;
        private Address address;//aggregation
        private ContactDetails contactDetails;//composition

        public Builder(){}
        public Builder(int customerId, String customerFirstName, String customerLastName, String customerUsername, String customerPassword, String customerStatus , Address address , ContactDetails contactDetails) {
            this.customerId = customerId;
            this.customerFirstName = customerFirstName;
            this.customerLastName = customerLastName;
            this.customerUsername = customerUsername;
            this.customerPassword = customerPassword;
            this.customerStatus = customerStatus;
            this.address = address;
            this.contactDetails = contactDetails;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public void setCustomerFirstName(String customerFirstName) {
            this.customerFirstName = customerFirstName;
        }

        public void setCustomerLastName(String customerLastName) {
            this.customerLastName = customerLastName;
        }

        public void setCustomerUsername(String customerUsername) {
            this.customerUsername = customerUsername;
        }

        public void setCustomerPassword(String customerPassword) {
            this.customerPassword = customerPassword;
        }

        public void setCustomerStatus(String customerStatus) {
            this.customerStatus = customerStatus;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        public void setContactDetails(ContactDetails contactDetails) {
            this.contactDetails = contactDetails;
        }

        public Customer build(){
            return new Customer(this);
        }
    }
}
