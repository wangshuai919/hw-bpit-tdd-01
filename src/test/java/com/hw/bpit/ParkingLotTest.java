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
}
