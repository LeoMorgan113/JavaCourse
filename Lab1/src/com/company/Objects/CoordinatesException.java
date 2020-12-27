package com.company.Objects;

public class CoordinatesException extends Exception{
    private double coord;
    public double getCoordinate(){ return coord; }
    public CoordinatesException(String message, double num){
        super(message);
        coord = num;
    }
}
