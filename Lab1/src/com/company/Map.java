package com.company;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
=======
import java.util.Collection;
import java.util.Iterator;
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8

public class Map {
    protected final Collection<MapFace> Objs;
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
<<<<<<< HEAD
    public Collection<MapFace> findAll(Predicate<? super MapFace> obj) {
        Collection<MapFace> components = new ArrayList<>();
        for (MapFace comp : this.Objs) {
            if (obj.test(comp))
                components.add(comp);
        }
        return components;
    }



    public Collection<MapFace> getObjs(){
        return this.Objs;
    }
=======
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8

    public void setMap(){
        StringBuffer strM = new StringBuffer();
        strM.append("Country: ")
                .append(this.Country)
                .append('\n')
                .append("City: ")
                .append(this.City)
                .append('\n')
                .append("Scale: ")
                .append(this.Scale)
                .append('\n');
        System.out.println(strM);
        for (Iterator<MapFace> it = Objs.iterator(); it.hasNext(); ) {
            MapFace cmp = it.next();
            cmp.print();
        }
    }
}
