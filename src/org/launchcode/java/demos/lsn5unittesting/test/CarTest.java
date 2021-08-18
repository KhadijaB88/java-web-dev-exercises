package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {
    Car test_car;


//    @Test
//    public void emptyTest(){
//        assertEquals(10,10,.001);
//    }


    @Before
   public void setUpCarObject(){
       test_car = new Car("Toyota", "Prius", 10, 50);
   }


    @Test
    public void testGasTankLevelSetOnConstructor(){
        test_car = new Car("Toyota ", "Prius",10, 50);

    }

    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void testGasTankAfterDriving(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testGasTankAfterExceedingTankRange(){
        test_car.drive(10000);
        assertEquals(0,test_car.getGasTankLevel(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(5);
        Assert.fail("Too much gas");
    }

}
