package com.hw.bpit;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {
    @Test
    public void should_return_a_token_when_park_given_parking_lot() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        Token token = parkingLot.park(car);
        Assert.assertNotNull(token);
    }

    @Test
    public void should_return_a_car_when_pick_given_a_token() {
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        Token token = parkingLot.park(car);

        Car pickedCar = parkingLot.pick(token);
        Assert.assertEquals(car, pickedCar);
    }
}
