package za.ac.cput.repository;

import za.ac.cput.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements iCarRepository {
    private static iCarRepository repository = null;
    private List<Car> carList;

    private CarRepository(){
        carList= new ArrayList<Car>();
    }

    public static iCarRepository getInstance() {
        if(repository==null){
            repository= new CarRepository();

        }
        return repository;
    }
    @Override
    public List<Car> getAll() {
        return carList;
    }

    @Override
    public boolean create(Car car) {

        return carList.add(car);
    }

    @Override
    public Car read(Integer carId) {
        for(Car car:carList){
            if(car.getCarId()==carId){
                return car;
            }
        }
        return null;
    }

    @Override
    public Car update(Car car) {
        for(int i =0 ;i<carList.size();i++){
            Car cars = carList.get(i);
            if(cars.getCarId()==car.getCarId()){
                carList.set(i,car);
                return car;
            }
        }

        return null;
    }

    @Override
    public boolean delete(Integer carId) {
        Car car = read(carId);
        if(car!=null){
            carList.remove(car);
            return true;
        }

        return false;
    }
}
