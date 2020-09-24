package com.company;

import com.company.Objects.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Map FirstMap = new Map(new ArrayList<>(), 500, "Ukraine", "Kramatorsk");
        FirstMap.addObjects(new Nature( 45.564, 56.7, "Pushkina",
                "Park Pushkina", Nature.Natures.PARK))
                .addObjects(new Nature( 55.564, 46.11, "Mel`nitskaya",
                        "Polevoi Sad", Nature.Natures.GARDEN))
                .addObjects(new Building( 46.267, 52.19, "Koshkina", 57,
                        "School #35", "84301", Building.Buildings.SCHOOL))
                .addObjects(new Building( 54.9913, 53.1661, "Lavandova", 17,
                        "Gorobskaya Bol`nista #3", "85301", Building.Buildings.HOSPITAL))
                .addObjects(new Building( 52.913, 50.98, "Lisna", 23,
                        "Gorodskaya Policia", "84401", Building.Buildings.POLICE))
                .addObjects(new Station( 50.12, 54.31, "Polevaya",
                        "Politechnicna", 45, 4, new int[] {125, 345, 22, 654}, Station.Stations.RAILWAYSTATION))
                .addObjects(new Station( 51.2, 55.2331, "Ogina",
                        "Lugova", 5, 2, new int[] {2, 3}, Station.Stations.UNDERGROUND));
        FirstMap.setMap();
    }
}
