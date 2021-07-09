package com.example.Isolation_Server.Models;
//POGO object for locationdata
public class Location {
    private double latitude;
    private double longitude;

//Getters
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
//Setters
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    @Override
    public String toString() {
        return "Location{" +  " Latitude=" + latitude + ", longitude=" + longitude + '}';
    }



}
