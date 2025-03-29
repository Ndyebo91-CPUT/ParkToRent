package za.ac.cput.factory;

import za.ac.cput.domain.Car;

public class CarFac {

    public static Car createCar(int carId, String carBrand, String carModel, String carCategory, double rentalPricePerKm, String imageURL, String status) {

        return new Car.CarBuilder(carId, carBrand, carModel, carCategory, rentalPricePerKm, imageURL, status)
                .setCarId(carId)
                .setCarBrand(carBrand)
                .setCarModel(carModel)
                .setCarCategory(carCategory)
                .setRentalPricePerKm(rentalPricePerKm)
                .setImageURL(imageURL)
                .setStatus(status)
                .build();
    }
}
