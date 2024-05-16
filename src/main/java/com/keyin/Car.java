package com.keyin;

public class Car {
    private String teamName;
    private String driver;
    private String raceClass;
    private boolean active;

    public Car(){
        this.active = true;
    }

    // Getters

    public String getTeamName() {
        return teamName;
    }

    public String getDriver() {
        return driver;
    }

    public String getRaceClass() {
        return raceClass;
    }

    public boolean isActive() {
        return active;
    }

    // Setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setRaceClass(String raceClass) {
        this.raceClass = raceClass;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
