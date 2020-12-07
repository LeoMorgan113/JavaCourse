package com.company.Objects;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NatureTest {
    @Test
    public void setObject(){
        Nature n1 = new Nature( 39.8, 43.88, "Mel`nitskaya",
                "Donets", Natures.RIVER);
        Station actual = n1.setStation( 51.2, 55.2331, "Richkova",
                "Port 1", 6, 1, new int[] {101}, Stations.RIVERPORT);
        Assert.assertNotNull(actual);
    }

    @Test
    public void print() {
        Nature n2 = new Nature( 45.564, 56.7, "Pushkina",
                "Park Pushkina", Natures.PARK);
        n2.print();
    }

    @Test
    public void SetStationNameTest() throws CoordinatesException {
        String StN = "Севастопольска площа";
        Station S1 = mock(Station.class);
        when(S1.SetStationName(StN)).thenReturn(StN);
        Nature N1 = new Nature(S1.SetStationName(StN));
        assertEquals(N1.SetSt(StN), StN);
        verify(S1).SetStationName(StN);
    }

}