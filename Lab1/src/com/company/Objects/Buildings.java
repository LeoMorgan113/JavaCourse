package com.company.Objects;

public enum Buildings {
    HOSPITAL, POLICE, FIRESTATION, SERVICE, SCHOOL,
    KINDERGARTEN, UNIVERSITY, SHOPS, MARKETS, BANKS,
    MUSEUM, LIBRARY, NONE;

    String Type;

    Buildings(String Type) {
        this.Type = Type;
    }

    Buildings () {
    }

    @Override
    public String toString() {
       return super.toString().replace('_', ' ').toLowerCase();
    }
}
