package com.company.Objects;


public class Address extends Coordinates{
    public String NameOfStreet;

    public Address(double long1, double lat1, String name){
        super();
        try{
            setCoordinate(long1, lat1);
        }
        catch(CoordinatesException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCoordinate());
        }finally {
            System.out.println("OK");
        }

        this.NameOfStreet = name;
    }
    public Address() throws CoordinatesException {
        super();
        setCoordinate(0,0);
        this.NameOfStreet = "Adr";
    }

    public void SetCoordinates(double long1, double lat1){
        try{
            setCoordinate(long1, lat1);
        }
        catch(CoordinatesException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getCoordinate());
        }finally {
            System.out.println("OK");
        }

    }
    @Override
    public double GetLongitude(){
        return coord_y();
    }

    @Override
    public double GetLatitude(){
        return coord_x();
    }

    @Override
    public String GetName(){
        return this.NameOfStreet;
    }

    @Override
    public void print(){
        String l1 = String.valueOf(Longitude);
        String l2 = String.valueOf(Latitude);

        String[] longitude = l1.split("\\.");
        String[] latitude = l2.split("\\.");

        StringBuffer strA = new StringBuffer();
        strA.append("Longitude: ");
        for(String s : longitude){
            strA.append(s);
            strA.append('`');
        }
        strA.append('`')
                .append("\nLatitude: ");
        for(String d : latitude){
            strA.append(d);
            strA.append('`');
        }
        strA.append('`')
                .append('\n')
                .append("Street name: ")
                .append(this.NameOfStreet);
        System.out.println(strA);
    }

}
