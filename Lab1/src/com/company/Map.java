package com.company;

import java.util.Collection;
import java.util.Iterator;

public class Map {
    private final Collection<MapFace> Objs;
    private final long Scale;
    private final String Country;
    private final String City;

    public Map(Collection<MapFace> m, long scale,
               String country, String city){
        this.Objs = m;
        this.Scale = scale;
        this.Country = country;
        this.City = city;
    }

    public Map addObjects(MapFace obj){
        this.Objs.add(obj);
        return this;
    }

    public void setMap(){
        System.out.println("Country: " + this.Country);
        System.out.println("City: " + this.City);
        System.out.println("Scale: " + this.Scale);
        for (Iterator<MapFace> it = Objs.iterator(); it.hasNext(); ) {
            MapFace cmp = it.next();
            cmp.print();
        }
    }
}
