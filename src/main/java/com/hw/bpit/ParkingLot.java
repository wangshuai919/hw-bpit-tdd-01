package com.hw.bpit;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private final Map<Token, Car> tokenMap = new HashMap<>();
    private final int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public Token park(Car car) {
        if (tokenMap.size() >= capacity) {
            throw new SpaceFullException();
        }
        Token token = new Token();
        tokenMap.put(token, car);
        return token;
    }

    public Car pick(Token token) {
        return tokenMap.remove(token);
    }
}
