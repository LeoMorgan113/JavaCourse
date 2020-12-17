package test.com.company.Objects;

import com.company.Objects.*;
import org.junit.Assert;
import org.junit.Test;

<<<<<<< HEAD:Lab1/src/test/com.company/Objects/NatureIT.java
import static org.junit.jupiter.api.Assertions.assertEquals;
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8:Lab1/src/com/company/Objects/NatureTest.java
import static org.mockito.Mockito.*;

public class NatureIT {
    @Test
    public void SetObjectTest(){
        Nature n1 = new Nature( 39.8, 43.88, "Mel`nitskaya",
                "Donets", Natures.RIVER);
        Station actual = n1.setStation( 51.2, 55.2331, "Richkova",
                "Port 1", 6, 1, new int[] {101}, Stations.RIVERPORT);
        Assert.assertNotNull(actual);
    }

    @Test
    public void PrintTest() {
        Nature n2 = new Nature( 45.564, 56.7, "Pushkina",
                "Park Pushkina", Natures.PARK);
        n2.print();
    }
<<<<<<< HEAD:Lab1/src/test/com.company/Objects/NatureIT.java
}
=======

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
>>>>>>> 00b2abe0148e4ee7443d249765b80e64ff9369f8:Lab1/src/com/company/Objects/NatureTest.java
