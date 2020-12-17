package test.com.company.Objects;

import com.company.Objects.Building;
import com.company.Objects.Buildings;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class BuildingIT {

    @Test
    public void GetIndexTest(){
        Building b1 = new Building( 43.67, 50.45, "Shevchenko", 17,
                "School #3", "78401", Buildings.SCHOOL);
        Building b2 = new Building( 54.9913, 53.1661, "Lavandova", 17,
                "Gorodskaya Bol`nista #3", "85301", Buildings.HOSPITAL);

        b1.getIndex();
        b2.getIndex();

    }

    @Test
    public void PrintInfoTest() {
        Building b1 = new Building(43.67, 50.45, "Shevchenko", 17,
                "School #3", "78401", Buildings.SCHOOL);
        Building b2 = new Building(54.9913, 53.1661, "Lavandova", 17,
                "Gorodskaya Bol`nista #3", "85301", Buildings.HOSPITAL);
        b1.print();
        b2.print();
    }
}
