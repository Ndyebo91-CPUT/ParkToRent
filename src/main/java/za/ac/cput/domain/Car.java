package za.ac.cput.domain;
/*
  Author : Natasha Njili
  221785345

 */
public class Car {
    private int carId;
    private String carBrand;
    private String carModel;
    private String carCategory;
    private double rentalPricePerKm;
    private String imageURL;
    private String status;

    private Car(){

    }
    private  Car(CarBuilder builder) {
        this.carId= builder.carId;
        this.carBrand = builder.carBrand;
        this.carModel = builder.carModel;
        this.carCategory = builder.carCategory;
        this.rentalPricePerKm = builder.rentalPricePerKm;
        this.imageURL = builder.imageURL;
        this.status = builder.status;


    }

    public int getCarId() {
        return carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public double getRentalPricePerKm() {
        return rentalPricePerKm;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getStatus() {
        return status;
    }
    public static class CarBuilder {
        private int carId;
        private String carBrand;
        private String carModel;
        private String carCategory;
        private double rentalPricePerKm;
        private String imageURL;
        private String status;

        public CarBuilder(){

        }
        public CarBuilder(int carId, String carBrand, String carModel, String carCategory, double rentalPricePerKm, String imageURL, String status) {
            this.carId = carId;
            this.carBrand = carBrand;
            this.carModel = carModel;
            this.carCategory = carCategory;
            this.rentalPricePerKm = rentalPricePerKm;
            this.imageURL = imageURL;
            this.status = status;
        }

        public CarBuilder setCarId(int carId) {
            this.carId = carId;
            return this;
        }

        public CarBuilder setCarBrand(String carBrand) {
            this.carBrand = carBrand;
            return this;
        }

        public CarBuilder setCarModel(String carModel) {
            this.carModel = carModel;
            return this;
        }

        public CarBuilder setCarCategory(String carCategory) {
            this.carCategory = carCategory;return this;

        }

        public CarBuilder setRentalPricePerKm(double rentalPricePerKm) {
            this.rentalPricePerKm = rentalPricePerKm;
            return this;
        }

        public  CarBuilder setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }

        public CarBuilder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carCategory='" + carCategory + '\'' +
                ", rentalPricePerKm=" + rentalPricePerKm +
                ", imageURL='" + imageURL + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
