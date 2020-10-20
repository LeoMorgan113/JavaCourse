package com.company.Objects;

import com.company.MapFace;

public class Station implements MapFace {
    public String NameOfStation;
    public int AddressNumSt;
    public int[] transport;
    public int N;
    Address adr;

    public enum Stations{
        RIVERPORT, BUSSTOP, RAILWAYSTATION, UNDERGROUND;
        @Override
        public String toString() {
            return super.toString().replace('_', ' ').toLowerCase();
        }
    }
    private Stations StType;

    public Station(double long1, double lat1, String name, String nameSt,
                   int addrNum, int n, int[] transp, Stations type){
        adr = new Address(long1, lat1, name);
        this.NameOfStation = nameSt;
        this.AddressNumSt = addrNum;
        this.StType = type;
        this.N = n;
        this.transport = new int[this.N];
        for (int i = 0; i < this.N; i++){
            this.transport[i] = transp[i];
        }

    }

    @Override
    public void print(){
        adr.print();
        System.out.println("Address number: " + this.AddressNumSt);
        System.out.println("Station type: " + this.StType);
        System.out.println("Station name: " + this.NameOfStation);
        for (int i = 0; i < this.N; i++){
            System.out.println("Transport(number): " + this.transport[i]);
        }
        System.out.println("\n");
    }

}
