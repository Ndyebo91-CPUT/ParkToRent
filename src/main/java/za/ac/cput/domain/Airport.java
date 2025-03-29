package za.ac.cput.domain;



public class Airport {
    private int airportId;
    private String airportName;

    public Airport() {
    }

    private Airport(Builder builder) {
        this.airportId = builder.airportId;
        this.airportName= builder.airportName;
    }

    public int getAirportId() {
        return airportId;
    }

    public String getAirportName() {
        return airportName;
    }

    public static class Builder {
        private int airportId;
        private String airportName;

        public Builder() {
        }

        public Builder(int airportId, String airportName) {
            this.airportId = airportId;
            this.airportName = airportName;
        }


        public Builder setAirportId(int airportId) {
            this.airportId = airportId;
            return this;
        }

        public Builder setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public Airport build(){
            return new Airport(this );
        }
    }
}

