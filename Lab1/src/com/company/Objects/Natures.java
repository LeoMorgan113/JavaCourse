package com.company.Objects;

public enum Natures{
    SEA, RIVER, LAKE, PARK, GARDEN, FOREST;

    String Type;

    Natures(String Type) {
        this.Type = Type;
    }

    Natures(){
    }

    @Override
    public String toString() {
        return super.toString().replace('_', ' ').toLowerCase();
    }
}