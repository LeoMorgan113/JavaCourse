package com.company.Objects;


import com.company.Objects.Buildings;
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
        public String getIndex(){ return "Address index: " + this.Index;}
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
    public boolean equals(Object obj) {
        if (obj == this) {
            System.out.print("ksksk");
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            System.out.print("ksksk");
            return false;
        }

        Building B = (Building) obj;
        return this.adr == B.adr
                && (this.AddressNum == B.AddressNum)
                || (this.Type != null && this.Type == B.Type) && (this.Index == B.Index)
                || (this.NameOfBuilding != null && this.NameOfBuilding.equals(B.NameOfBuilding));
    }

    @Override
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
