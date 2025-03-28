package za.ac.cput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Address add = new Address.AddressBuilder("22 Joe Slovo Street", "8553").build();
        System.out.println("Address built using Builder:");
        System.out.println(add);

        Address add2 = new Address.AddressBuilder().setStreetAdress(" tyfubjuiy").setPostalAddress("7154364").build();
        System.out.println("Address built using Builder:");
        System.out.println(add2);

        Address address = AddressFactory.createAddress("123 Main St", "Cityville");
        System.out.println("Address built using factory:");
        System.out.println(address);

        Address address2 = AddressFactory.createAddress();
        System.out.println("Address built using factory:");
        System.out.println(address2);
    }
}