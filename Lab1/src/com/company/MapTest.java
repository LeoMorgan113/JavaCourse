package com.company;

import com.company.Objects.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    @Test
    public void addObject(){
        Map FirstMap = new Map(new ArrayList<>(), 500, "Ukraine", "Kramatorsk");
        Map actual = FirstMap.addObjects(new Nature( 45.564, 56.7, "Pushkina",
                "Park Pushkina", Natures.PARK))
                .addObjects(new Nature( 39.8, 43.88, "Mel`nitskaya",
                        "Donets", Natures.RIVER).setStation( 51.2, 55.2331, "Richkova",
                        "Port 1", 6, 1, new int[] {101}, Stations.RIVERPORT))
                .addObjects(new Building( 46.267, 52.19, "Koshkina", 57,
                        "School #35", "84301", Buildings.SCHOOL))
                .addObjects(new Building( 54.9913, 53.1661, "Lavandova", 17,
                        "Gorodskaya Bol`nista #3", "85301", Buildings.HOSPITAL))
                .addObjects(new Station( 50.12, 54.31, "Polevaya", "Politechnicna",
                        45, 4, new int[] {125, 345, 22, 654}, Stations.RAILWAYSTATION));
        Assert.assertNotNull(actual);
    }

    @Test
    public void setMap(){
        Map FirstMap = new Map(new ArrayList<>(), 500, "Ukraine", "Kramatorsk");
        Map actual = FirstMap.addObjects(new Nature( 45.564, 56.7, "Pushkina",
                "Park Pushkina", Natures.PARK))
                .addObjects(new Nature( 39.8, 43.88, "Mel`nitskaya",
                        "Donets", Natures.RIVER).setStation( 51.2, 55.2331, "Richkova",
                        "Port 1", 6, 1, new int[] {101}, Stations.RIVERPORT))
                .addObjects(new Building( 46.267, 52.19, "Koshkina", 57,
                        "School #35", "84301", Buildings.SCHOOL))
                .addObjects(new Building( 54.9913, 53.1661, "Lavandova", 17,
                        "Gorodskaya Bol`nista #3", "85301", Buildings.HOSPITAL))
                .addObjects(new Station( 50.12, 54.31, "Polevaya", "Politechnicna",
                        45, 4, new int[] {125, 345, 22, 654}, Stations.RAILWAYSTATION));

        actual.setMap();
    }

}