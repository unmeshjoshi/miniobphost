package com.miniobp.host.party.service.application;

public class PartyAddressDTO {
    String streetName;
    String city;
    String state;
    String country;

    public PartyAddressDTO(String streetName, String city, String state, String country) {
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}
