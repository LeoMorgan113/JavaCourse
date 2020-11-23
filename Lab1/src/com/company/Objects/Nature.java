package com.company.Objects;

import com.company.MapFace;

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

    public Nature(String StName) throws CoordinatesException{
        adr = new Address();
        this.NameOfNature = "nameOfNature";
        this.Type = Natures.NONE;
        st = new Station(StName);
    }

    public String GetSt(){
        return st.GetStationName();
    }
    public String SetSt(String stn){
        return st.SetStationName(stn);
    }

    @Override
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
