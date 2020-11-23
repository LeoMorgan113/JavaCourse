package com.company.Objects;

public enum Stations{
    RIVERPORT("River port"), BUS_STOP("Bus stop"),
    RAILWAYSTATION("Railway station"), UNDERGROUND("Underground"), NONE("None");

    String Type;

    Stations(String Type) {
        this.Type = Type;
    }

    Stations() {
    }
    protected void show_enum(){
        System.out.print("Station type: " + Type);
    }

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}
