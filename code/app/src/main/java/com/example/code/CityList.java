package com.example.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * This is a class that keeps track of a list of city objects.
 */
public class CityList {

    /**
     * This is the list that stores all City objects.
     */
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist.
     *
     * @param city
     * This is a candidate city to add.
     * @throws IllegalArgumentException if the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException("City already exists in the list.");
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities.
     *
     * @return
     * Return the sorted list.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list); // Works now because City implements Comparable<City>
        return list;
    }
}
