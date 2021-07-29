package com.hw.bpit;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Token, Car> tokenMap = new HashMap<>();

    public Token park(Car car) {
        Token token = new Token();
        tokenMap.put(token, car);
        return token;
    }

    public Car pick(Token token) {
        return tokenMap.remove(token);
    }
}
