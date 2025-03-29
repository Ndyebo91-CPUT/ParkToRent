
package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.ContactDetails;
import za.ac.cput.domain.CarOwner;
import za.ac.cput.domain.Renter;

public class CustomerFac {

    // Factory for creating a CarOwner
    public static CarOwner createCarOwner(int customerId, String customerFirstName, String customerLastName,
                                          String customerUsername, String customerPassword, String customerStatus,
                                          String email, String phoneNumber, String altPhoneNumber,
                                          String streetAddress, String postalAddress, double totalEarnings) {

        ContactDetails contactDetails = new ContactDetails.Builder()
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setAltPhoneNumber(altPhoneNumber)
                .build();

        Address address = new Address.Builder()
                .setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .build();

        return new CarOwner.Builder(customerId, customerFirstName, customerLastName, customerUsername, customerPassword, customerStatus ,address ,contactDetails)
                .setTotalEarnings(totalEarnings)
                .build();
    }

    // Factory for creating a Renter
    public static Renter createRenter(int customerId, String customerFirstName, String customerLastName,
                                      String customerUsername, String customerPassword, String customerStatus,
                                      String email, String phoneNumber, String altPhoneNumber,
                                      String streetAddress, String postalAddress) {

        ContactDetails contactDetails = new ContactDetails.Builder()
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .setAltPhoneNumber(altPhoneNumber)
                .build();

        Address address = new Address.Builder()
                .setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .build();

        return new Renter.RenterBuilder(customerId, customerFirstName, customerLastName, customerUsername, customerPassword, customerStatus,address,contactDetails)
                .build();
    }
}
