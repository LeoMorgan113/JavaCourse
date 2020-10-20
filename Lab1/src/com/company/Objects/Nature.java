package com.company.Objects;

import com.company.MapFace;

public class Nature implements MapFace{
    public String NameOfNature;
    Address adr;

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
        adr = new Address(long1, lat1, name);
        this.NameOfNature = nameOfNatur;
        this.Type = type;
    }

    @Override
    public void print(){
        adr.print();
        System.out.println("Nature type: " + this.Type);
        System.out.println("Name of place: " + this.NameOfNature + "\n");
    }
}
