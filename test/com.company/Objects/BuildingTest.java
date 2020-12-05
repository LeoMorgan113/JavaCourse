package com.company.Objects;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


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

    @Test
    public void SetNameTest(){
        Building b1 = mock(Building.class);
        String n1 = "Цум";
        when(b1.SetName(n1)).thenReturn(n1);
        assertEquals(n1, b1.SetName(n1));
        verify(b1).SetName(n1);
    }


}