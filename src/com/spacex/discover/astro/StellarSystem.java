package com.spacex.discover.astro;

import java.util.Set;
import java.util.TreeSet;

public class StellarSystem {

    public String name;
    public Set<Planet> planets= new TreeSet<>();

    public StellarSystem (String name) {
        this.name = name;
    }

}
