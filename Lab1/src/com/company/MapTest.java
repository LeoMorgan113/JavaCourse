package com.company;

import com.company.Objects.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Before;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MapTest {
    public Map actual;

    @Before
    public void init(){
        actual = new Map(new ArrayList<>(), 500, "Ukraine", "Kramatorsk");
        actual.addObjects(new Nature( 45.564, 56.7, "Pushkina",
                "Park Pushkina", Natures.PARK))
                .addObjects(new Nature( 55.564, 46.11, "Mel`nitskaya",
                        "Polevoi Sad", Natures.GARDEN))
                .addObjects(new Nature( 39.8, 43.88, "Mel`nitskaya",
                        "Donets", Natures.RIVER).setStation( 51.2, 55.2331, "Richkova",
                        "Port 1", 6, 1, new int[] {101}, Stations.RIVERPORT))
                .addObjects(new Building( 46.267, 52.19, "Koshkina", 57,
                        "School #35", "84301", Buildings.SCHOOL))
                .addObjects(new Building( 54.9913, 53.1661, "Lavandova", 17,
                        "Gorodskaya Bol`nista #3", "85301", Buildings.HOSPITAL))
                .addObjects(new Building( 52.913, 50.98, "Lisna", 23,
                        "Gorodskaya Policia", "84401", Buildings.POLICE))
                .addObjects(new Station( 50.12, 54.31, "Polevaya",
                        "Politechnicna", 45, 4, new int[] {125, 345, 22, 654}, Stations.RAILWAYSTATION))
                .addObjects(new Station( 51.2, 55.2331, "Ogina",
                        "Lugova", 5, 2, new int[] {2, 3}, Stations.UNDERGROUND));
    }



    @Test
    public void addObject(){
        Assert.assertNotNull(actual);
    }

    @Test
    public void setMap(){
        actual.setMap();
    }

    @Test
    public void findAll_findByName(){
        Predicate<MapFace> cb = (component -> component.GetName() == "School #35");
        ArrayList<MapFace> expected = actual
                .getObjs()
                .stream()
                .filter(cb)
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<MapFace> test = (ArrayList<MapFace>) actual.findAll(cb);
        Assertions.assertEquals(expected, test);
    }

    @Test
    public void findAll_findByLatitudeAndLongitude(){
        Predicate<MapFace> cb = (component -> component.GetLatitude() < 50 && component.GetLongitude() < 50);
        ArrayList<MapFace> expected = actual
                .getObjs()
                .stream()
                .filter(cb)
                .collect(Collectors.toCollection(ArrayList::new));
        ArrayList<MapFace> test = (ArrayList<MapFace>) actual.findAll(cb);
        Assertions.assertEquals(expected, test);
    }

    @Test
    public void findAll_alwaysFalseCallback() {
        Assertions.assertEquals(0, actual.findAll((component -> false)).size());
    }


}