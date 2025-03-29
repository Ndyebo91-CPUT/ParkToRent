package za.ac.cput.repository;

import za.ac.cput.domain.CarOwner;

import java.util.ArrayList;
import java.util.List;

public class
CarOwnerRepository implements iCarOwnerRepository{
    private static iCarOwnerRepository repository= null;
    private List<CarOwner> carOwnersList;
    private CarOwnerRepository(){
        carOwnersList = new ArrayList<CarOwner>();
    }
    public static iCarOwnerRepository getInstace(){
        if(repository== null){
            repository = new CarOwnerRepository();
        }
        return repository;
    }
    @Override
    public List<CarOwner> getAll() {
        return carOwnersList;
    }

    @Override
    public boolean create(CarOwner carOwner) {
        return carOwnersList.add(carOwner);
    }

    @Override
    public CarOwner read(Integer carOwnerId) {
        for(CarOwner carOwner : carOwnersList){
            if(carOwner.getCustomerId()== carOwnerId){
                return carOwner;
            }
        }
        return null;
    }

    @Override
    public CarOwner update(CarOwner carOwner) {
        for(int i =0 ;i <carOwnersList.size();i++){
            CarOwner cOwn= carOwnersList.get(i);
            if(cOwn.getCustomerId()==carOwner.getCustomerId()){
                carOwnersList.set(i,carOwner);
                return carOwner;
            }
        }


        return null;
    }

    @Override
    public boolean delete(Integer carOwnerId) {
        CarOwner carOwner = read(carOwnerId);
        if(carOwner!= null){
            carOwnersList.remove(carOwner);
            return true;
        }
        return false;
    }
}
