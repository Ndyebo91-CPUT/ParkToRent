package za.ac.cput.factory;


import za.ac.cput.domain.Airport;

public class AirportFac {

    public static Airport createAirport(int airportId, String airportName) {

        return new Airport.Builder(airportId, airportName)
                .setAirportId(airportId)
                .setAirportName(airportName)
                .build();
    }
}
