package com.company.Objects;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class BuildingTest{
    @Test
    public void SetNameTest() throws CoordinatesException {
        Building b1 = Mockito.spy(new Building());
        String n1 = "Цум";
        when(b1.SetName(n1)).thenReturn(n1);
        assertEquals(n1, b1.SetName(n1));
        verify(b1).SetName(n1);
    }


}