package com.company.Objects;

import com.company.MapFace;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
public class Nature implements MapFace{
    public String NameOfNature;
    Address adr;
    Station st;

    private Natures Type;

    public Nature(double long1, double lat1, String name,
                  String nameOfNature, Natures type){
        adr = new Address(long1, lat1, name);
        this.NameOfNature = nameOfNature;
        this.Type = type;

    }
    public Station setStation(double long1, double lat1, String name, String nameSt,
                              int addrNum, int n, int[] transp, Stations type){
        st = new Station(long1, lat1, name, nameSt, addrNum, n, transp, type);
        return st;
    }

<<<<<<< HEAD

=======
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
    public Nature(String StName) throws CoordinatesException{
        adr = new Address();
        this.NameOfNature = "nameOfNature";
        this.Type = Natures.NONE;
        st = new Station(StName);
    }

<<<<<<< HEAD

    public String GetSt(){
        return st.GetName();
=======
    public String GetSt(){
        return st.GetStationName();
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
    }
    public String SetSt(String stn){
        return st.SetStationName(stn);
    }

    @Override
<<<<<<< HEAD
    public double GetLongitude(){
        return adr.coord_y();
    }

    @Override
    public double GetLatitude(){
        return adr.coord_x();
    }

    @Override
    public String GetName(){
        return this.NameOfNature;
    }


    @Override
=======
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
    public void print(){
        adr.print();
        StringBuffer strN = new StringBuffer();
        strN.append("Nature type: " )
                .append(this.Type)
                .append('\n')
                .append("Name of place: ")
                .append(this.NameOfNature)
                .append("\n\n");
        System.out.println(strN);
        if(st!=null){
            st.print();
        }
    }
}
