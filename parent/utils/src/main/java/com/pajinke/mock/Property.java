package com.pajinke.mock;

/**
 * Created by Leo on 16/4/14.
 */
public class Property {
    public String name;

    public String value;

    public Property() {}

    public Property(String name,String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
