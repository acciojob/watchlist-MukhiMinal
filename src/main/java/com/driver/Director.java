package com.driver;

public class Director {
    private String name;
    private int durationInMin;
    private double imdbRating;

    public Director(){

    }

    public Director(String name, int durationInMin, double imdbRating) {
        this.name = name;
        this.durationInMin = durationInMin;
        this.imdbRating = imdbRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMin() {
        return durationInMin;
    }

    public void setDurationInMin(int durationInMin) {
        this.durationInMin = durationInMin;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }
}
