package com.company.Objects;

import com.company.MapFace;

public abstract class Coordinates implements MapFace{
    public double Longitude;
    public double Latitude;

    public Coordinates(double longitude, double latitude){
        this.Longitude = longitude;
        this.Latitude = latitude;
    }

    public double coord_x(){ return Latitude; }

    public double coord_y(){ return Longitude; }

    @Override
    public void print(){
        System.out.println("Longitude: " + Longitude + "degrees. \nLatitude: " + Latitude + " degrees.");
    }

}
