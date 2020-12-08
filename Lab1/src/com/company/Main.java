package com.company;

import com.company.Objects.*;
import java.util.ArrayList;

import com.company.Objects.Buildings;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        Map FirstMap = new Map(new ArrayList<>(), 500, "Ukraine", "Kramatorsk");
        FirstMap.addObjects(new Nature( 45.564, 56.7, "Pushkina",
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
        FirstMap.setMap();
        Station s1 = new Station( 45.2, 53.1, "Kram",
                "Tsvetochnaya", 13, 2, new int[] {55, 8}, Stations.RAILWAYSTATION);
        Station s2 = new Station( 45.2, 53.1, "Kram",
                "Tsvetochnaya", 13, 2, new int[] {55, 8}, Stations.RAILWAYSTATION);
        System.out.print("Result of equals: ");
        System.out.println(s1.equals(s2));

        Building b1 = new Building( 43.67, 50.45, "Shevchenko", 17,
                "School #3", "78401", Buildings.SCHOOL);
        Building b2 = new Building( 43.67, 50.45, "Shevchenko", 17,
                "School #3", "78401", Buildings.SCHOOL);
        System.out.print("Result of override equals: ");
        System.out.println(b1.equals(b2));


        System.out.println("\n\nAll buildings on Map: " + FirstMap.findAll(component -> component instanceof Building));
        System.out.println("\nThe futher object: " +
                FirstMap.getObjs()
                        .stream()
                        .reduce(FirstMap.getObjs().stream().findFirst().get(),
                                (component, different) -> component.GetLatitude() > different.GetLatitude()
                                        && component.GetLongitude() > different.GetLongitude()
                                        ? component : different ));

        System.out.println("\nAverage Longitude: " +
                FirstMap
                        .getObjs()
                        .stream()
                        .mapToDouble(comp -> comp.GetLongitude())
                        .average()
                        .getAsDouble()
        );

        System.out.println("Average Latitude: " +
                FirstMap
                        .getObjs()
                        .stream()
                        .mapToDouble(comp -> comp.GetLatitude())
                        .average()
                        .getAsDouble()
        );

        java.util.Map<Object, List<MapFace>> mappedComponents =
                FirstMap.getObjs()
                .stream()
                .collect(Collectors.groupingBy(component -> component.GetLongitude() > 50
                        && component.GetLatitude() > 50 ? "further" : "closer"));
        System.out.println("\nMapped objects on Map: ");
        System.out.println(mappedComponents);


    }
}
