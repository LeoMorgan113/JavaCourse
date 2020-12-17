package com.company.Objects;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NatureTest {

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