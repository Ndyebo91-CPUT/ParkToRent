package za.ac.cput.domain;

/**
 * Cx.java
 * Cx model class
 *
 * @author : Rotondwa Rambau
 * studnr : 222342145
 * group : 3I
 */

public class ContactDetails {
    private String email;
    private String phoneNumber;
    private String altPhoneNumber;

    private ContactDetails(Builder builder) {
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.altPhoneNumber = builder.altPhoneNumber;
    }

    public ContactDetails() { // No-argument constructor
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAltPhoneNumber() {
        return altPhoneNumber;
    }

    public static class Builder {
        private String email;
        private String phoneNumber;
        private String altPhoneNumber;

        public Builder() { // No-argument constructor
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAltPhoneNumber(String altPhoneNumber) {
            this.altPhoneNumber = altPhoneNumber;
            return this;
        }

        public ContactDetails build() {
            return new ContactDetails(this);
        }
    }
}