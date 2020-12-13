package Logik;

import lombok.Data;


public class Adress {
    private String cityName;
    private int zipCode;
    private String streetNaame;
    private int apartamentNumber;

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetNaame() {
        return streetNaame;
    }

    public int getApartamentNumber() {
        return apartamentNumber;
    }
}
