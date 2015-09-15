package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloPlanetTest {
    @Test
    public void canConstructAndGetName() {
        HelloPlanet earth = new HelloPlanet("earth");
        assertEquals("earth", earth.getName());

        HelloPlanet mars = new HelloPlanet("mars");
        assertEquals("mars", mars.getName());
    }
}
