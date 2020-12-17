package com.company.Objects;


import com.company.MapFace;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
public class Building implements MapFace{
    public String NameOfBuilding;
    public int AddressNum;
    Address adr;

    public static class IndexOfBuilding{
        public String Index;

        public IndexOfBuilding(){ this.Index = "Index"; }
        public IndexOfBuilding(String indx){ this.Index = indx; }
        public String SetIndex(String indx){ this.Index = indx; return this.Index;}
        public String Get(){ return this.Index; }
        public String getIndex(){ return "Address index: " + this.Index;}
    }


    private Buildings Type;
    private IndexOfBuilding Index = new IndexOfBuilding();

    public Building(String idx) throws CoordinatesException {
        adr = new Address();
        this.NameOfBuilding = "nameBuild";
        this.AddressNum = 0;
        Index.SetIndex(idx);
        this.Type = Buildings.NONE;
<<<<<<< HEAD
=======

>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
    }
    public Building(double long1, double lat1, String name, int addrNum,
                    String nameBuild, String indx, Buildings type){
        adr = new Address(long1, lat1, name);
        this.NameOfBuilding = nameBuild;
        this.AddressNum = addrNum;
        Index.SetIndex(indx);
        this.Type = type;
    }

    public String SetName(String nameBuild){
        this.NameOfBuilding = nameBuild;
        return this.NameOfBuilding;
    }
<<<<<<< HEAD

=======
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
    public String getIdx(){ return Index.Get(); }
    public void getIndex(){
        System.out.println(Index.getIndex());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Building B = (Building) obj;
        return this.adr == B.adr
                && (this.AddressNum == B.AddressNum)
                || (this.Type != null && this.Type == B.Type) && (this.Index == B.Index)
                || (this.NameOfBuilding != null && this.NameOfBuilding.equals(B.NameOfBuilding));
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
        return this.NameOfBuilding;
    }

    @Override
=======
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8
    public void print(){
        adr.print();
        StringBuffer strB = new StringBuffer();
        strB.append("Address number: ")
                .append(this.AddressNum)
                .append('\n')
                .append(Index.getIndex())
                .append('\n')
                .append("Building type: ")
                .append(this.Type)
                .append('\n')
                .append("Name of building: ")
                .append(this.NameOfBuilding)
                .append('\n');
        System.out.println(strB);
    }

}
