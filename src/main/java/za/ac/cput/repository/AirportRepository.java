package za.ac.cput.repository;


import za.ac.cput.domain.Airport;

import java.util.ArrayList;
import java.util.List;

public class AirportRepository implements iAirportRepository{
    private static iAirportRepository repository= null;
    private List<Airport> airportList;

    private AirportRepository(){
        airportList = new ArrayList<Airport>();
    }

    public static iAirportRepository getInstance(){
        if ( repository == null){
            repository = new AirportRepository();
        }
        return repository;
    }

    @Override
    public List<Airport> getAll() {
        return airportList;
    }

    @Override
    public boolean create(Airport airport) {
        return airportList.add(airport);
    }

    @Override
    public Airport read(Integer airportId) {
        for(Airport airport:airportList){
            if(airport.getAirportId()==airportId){
                return  airport;
            }
        }
        return null;
    }

    @Override
    public Airport update(Airport airport) {
        for(int i=0 ;i<airportList.size();i++){
            Airport airport1 = airportList.get(i);
            if(airport1.getAirportId()==airport.getAirportId()){
                airportList.set(i,airport);
                return  airport;
            }
        }
        return null;
    }

    @Override
    public boolean delete(Integer airportId) {
        Airport airport= read(airportId);
        if(airport!=null){
            airportList.remove(airport);
            return true;
        }
        return false;
    }
}
