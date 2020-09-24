package com.company.Objects;

public class Nature extends Address{
    public String NameOfNature;

    public enum Natures{
        SEA, RIVER, LAKE, PARK, GARDEN, FOREST;
        @Override
        public String toString() {
            return super.toString().replace('_', ' ').toLowerCase();
        }
    }
    private Natures Type;

    public Nature(double long1, double lat1, String name,
                  String nameOfNatur, Natures type){
        super(long1, lat1, name);
        this.NameOfNature = nameOfNatur;
        this.Type = type;
    }

    @Override
    public void print(){
        System.out.println("Longitude: " + Longitude + "\nLatitude: " + Latitude);
        System.out.println("Street name: " + this.NameOfStreet);
        System.out.println("Nature type: " + this.Type);
        System.out.println("Name of place: " + this.NameOfNature + "\n");
    }
}
