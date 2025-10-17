package com.example.code;
/**
 * This is a class that defines a City.
 * A City object has a city name and a province name.
 */
public class City implements Comparable<City> {

    /**
     * The name of the city.
     */
    private String city;

    /**
     * The name of the province.
     */
    private String province;

    /**
     * This constructs a City object.
     *
     * @param city The name of the city.
     * @param province The name of the province.
     */
    public City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the name of the city.
     *
     * @return The city name.
     */
    public String getCityName() {
        return this.city;
    }

    /**
     * This returns the name of the province.
     *
     * @return The province name.
     */
    public String getProvinceName() {
        return this.province;
    }

    /**
     * Determines whether two City objects are equal.
     * Two cities are considered equal if both their city and province names match.
     *
     * @param obj The object to compare with.
     * @return true if both cities are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        City cityObj = (City) obj;
        return this.city.equals(cityObj.city) && this.province.equals(cityObj.province);
    }

    /**
     * Generates a hash code for this City.
     * Ensures consistent hashing for use in collections.
     *
     * @return The hash code of this city.
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }

    /**
     * This method defines how cities are compared for sorting.
     * It compares city names lexicographically (alphabetical order).
     *
     * @param other The city to compare with.
     * @return a negative integer, zero, or a positive integer as this city's name
     *         is less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }
}