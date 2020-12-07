package com.company.Objects;

import com.company.MapFace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Station implements MapFace {
    public String NameOfStation;
    public int AddressNumSt;
    public Integer[] transport;
    public int N;
    Address adr;
    List<Integer> tr_list;


    final private Stations StType;

    public Station(double long1, double lat1, String name, String nameSt,
                   int addrNum, int n, int[] transp, Stations type){
        adr = new Address(long1, lat1, name);
        this.NameOfStation = nameSt;
        this.AddressNumSt = addrNum;
        this.StType = type;
        this.N = n;
        this.transport = new Integer[this.N];
        for(int i = 0; i < this.N; i++){
            this.transport[i] = transp[i];
        }
        tr_list = Arrays.asList(transport);
    }


    public Station(String nameSt) throws CoordinatesException {
        adr = new Address();
        this.NameOfStation = nameSt;
        this.AddressNumSt = 0;
        this.StType = Stations.NONE;
        this.N = 0;
    }

    public List<Integer> GetTransport() {
        return tr_list;
    }

    public int GetTr(){
        return transport[0];
    }

    public String SetStationName(String nameSt){
        this.NameOfStation = nameSt;
        return this.NameOfStation;
    }

    public Stations getStType(){
        return StType;
    }

    

    @Override
    public double GetLongitude(){
        return adr.coord_y();
    }

    @Override
    public double GetLatitude(){
        return adr.coord_x();
    }

    @Override
    public String GetName(){
        return this.NameOfStation;
    }

    @Override
    public void print(){
        adr.print();
        StringBuffer strS = new StringBuffer();
        StType.show_enum();
        strS.append("\nStation name: ")
                .append(this.NameOfStation)
                .append('\n')
                .append("Address number: ")
                .append(this.AddressNumSt)
                .append('\n');
        for (int i = 0; i < this.N; i++){
            strS.append("Transport(number): ")
                    .append(this.transport[i])
                    .append('\n');
        }
        System.out.println(strS);
    }


}
