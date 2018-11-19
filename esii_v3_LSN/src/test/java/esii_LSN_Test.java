import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class esii_LSN_Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getBicycleTest_01() throws UserDoesNotExists, UserAlreadyExists {
        BikeRentalSystem bike = new BikeRentalSystem(50);
        bike.registerUser(1, "Luis", 1);
        assertEquals(-1, bike.getBicycle(50,1,50));
    }
}