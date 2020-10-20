package com.company.Objects;


import com.company.MapFace;

public class Building implements MapFace{
    public String NameOfBuilding;
    public int AddressNum;
    Address adr;

    public static class IndexOfBuilding{
        public String Index;

        public IndexOfBuilding(){ this.Index = "Index"; }
        public IndexOfBuilding(String indx){ this.Index = indx; }
        public void SetIndex(String indx){ this.Index = indx; }
        public void print(){ System.out.println("Address index: " + this.Index);}
    }

    public enum Buildings{
        HOSPITAL, POLICE, FIRESTATION, SERVICE, SCHOOL,
        KINDERGARTEN, UNIVERSITY, SHOPS, MARKETS, BANKS,
        MUSEUM, LIBRARY;
        @Override
        public String toString() {
            return super.toString().replace('_', ' ').toLowerCase();
        }
    }
    private Buildings Type;
    private IndexOfBuilding Index = new IndexOfBuilding();
    public Building(double long1, double lat1, String name, int addrNum,
                    String nameBuild, String indx, Buildings type){
        adr = new Address(long1, lat1, name);
        this.NameOfBuilding = nameBuild;
        this.AddressNum = addrNum;
        Index.SetIndex(indx);
        this.Type = type;
    }

    @Override
    public void print(){
        adr.print();
        System.out.println("Address number: " + this.AddressNum);
        Index.print();
        System.out.println("Building type: " + this.Type);
        System.out.println("Name of building: " + this.NameOfBuilding);
    }
}
