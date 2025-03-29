package za.ac.cput.domain;
/**
 * Cx.java
 * Cx model class
 *
 * @author : Rotondwa Rambau
 * studnr : 222342145
 * group : 3I
 */
public class Address {
    private String streetAddress;
    private String postalAddress;

    public Address() {

    }

    public Address(String streetAddress, String postalAddress) {
        this.streetAddress = streetAddress;
        this.postalAddress = postalAddress;
    }

    private Address(Builder builder) {
        this.streetAddress = builder.streetAddress;
        this.postalAddress = builder.postalAddress;

    }


    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }
    public static class Builder{

        private String postalAddress;
        private String streetAddress;

        public Builder(){

        }

        public Builder(String streetAddress, String postalAddress) {
            this.streetAddress = streetAddress;
            this.postalAddress = postalAddress;
        }

        public Builder  setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        public Builder setPostalAddress(String postalAddress) {
            this.postalAddress = postalAddress;
            return this;
        }

        public Address build(){
            return new Address(this);
        }
    }
}
