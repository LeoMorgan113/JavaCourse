package com.company.Objects;

import com.company.MapFace;



public abstract class Coordinates implements MapFace{
    public double Longitude;
    public double Latitude;

    public Coordinates(double longitude, double latitude){
        this.Longitude = longitude;
        this.Latitude = latitude;
    }
    public Coordinates(){
        this.Longitude = 0;
        this.Latitude = 0;
    }
    public void setCoordinate(double lg, double lt)throws CoordinatesException{
        this.Longitude = lg;
        this.Latitude = lt;
        if(Latitude < 0 || Latitude > 180) throw new CoordinatesException("Coordinate is wrong", Latitude);
        if(Longitude < 0 || Longitude > 180) throw new CoordinatesException("Coordinate is wrong", Longitude);

    }

    public double coord_x(){
        return Latitude;
    }

    public double coord_y(){
        return Longitude;
    }


}
