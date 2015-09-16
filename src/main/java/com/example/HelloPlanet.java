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


    /**
     *
     * main - in order to test that jar runs
     */
    public static void main(String [] args) { 
        HelloPlanet earth = new HelloPlanet("earth");
        HelloPlanet mars = new HelloPlanet("mars");

        System.out.println("Created two planets:" + System.lineSeparator());
        System.out.println(earth.getName() + System.lineSeparator());
        System.out.println(mars.getName() + System.lineSeparator());
    }
}
