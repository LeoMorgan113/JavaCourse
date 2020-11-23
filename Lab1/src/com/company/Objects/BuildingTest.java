package com.company.Objects;

import org.junit.Test;

public class BuildingTest{

    @Test
    public void getIndex(){
        Building b1 = new Building( 43.67, 50.45, "Shevchenko", 17,
                "School #3", "78401", Buildings.SCHOOL);
        Building b2 = new Building( 54.9913, 53.1661, "Lavandova", 17,
                "Gorodskaya Bol`nista #3", "85301", Buildings.HOSPITAL);

        b1.getIndex();
        b2.getIndex();

    }

    @Test
    public void print(){
        Building b1 = new Building( 43.67, 50.45, "Shevchenko", 17,
                "School #3", "78401", Buildings.SCHOOL);
        Building b2 = new Building( 54.9913, 53.1661, "Lavandova", 17,
                "Gorodskaya Bol`nista #3", "85301", Buildings.HOSPITAL);
        b1.print();
        b2.print();
    }
}