package com.company.Objects;

import javax.naming.Name;

public class Address extends Coordinates{
    public String NameOfStreet;

    public Address(double long1, double lat1, String name){
        super(long1, lat1);
        this.NameOfStreet = name;
    }

    @Override
    public void print(){
        System.out.println("Longitude: " + Longitude + "\n Latitude: " + Latitude);
        System.out.println("Street name: " + this.NameOfStreet + "\n");
    }
}
