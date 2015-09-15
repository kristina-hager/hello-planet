package com.example;

/**
 * HelloPlanet - a class modeling a planet
 * in the most hello world type way
 */
public class HelloPlanet {

    private String name;

    /**
     * Creates a HelloPlanet object
     *
     * @param name      the name of the new planet
     */
    public HelloPlanet(String name) {
        this.name = name;
    }

    /**
     * Returns the name for the HelloPlanet object
     *
     * @return      the name of the planet
     */
    public String getName() {
        return name;
    }
}
