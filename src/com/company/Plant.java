package com.company;

import java.time.LocalDateTime;

public class Plant {
    private String plantType;
    private int moistureLevel;
    private int specialNeeds;
    private LocalDateTime lastTimePlantWasWatered = LocalDateTime.now();

   public Plant (String plantType, int moistureLevel, int specialNeeds) {
        this.plantType = plantType;
        this.moistureLevel = moistureLevel;
        this.specialNeeds = specialNeeds;
    }

    public String getPlantType() {
        return plantType;
    }

    public int getMoistureLevel(){
        return moistureLevel;
    }

    public int getSpecialNeeds() {
        return specialNeeds;
    }

    public LocalDateTime getLastTimePlantWasWatered() {
        return lastTimePlantWasWatered;
    }

    public String moistureLevelToString (int moistureLevel) {
        switch (moistureLevel) {
            case 1:
                return "This plant prefers very dry soil";
            case 2:
                return "This plant prefers dry soil";
            case 3:
                return "This plant prefers medium wet soil";
            case 4:
                return "This plant prefers wet soil";
            case 5:
                return "This plant prefers very wet soil";
            default:
                return "That moisture level does not exist";
        }
    }

    public String specialNeedsToString(int specialNeeds) {
        switch (specialNeeds) {
            case 1:
                return "Give more frequent small amounts of water";
            case 2:
                return "Allow soil to dry out in between watering";
            case 3:
                return "Give less frequent one amount of water";
            default:
                return "That number does not exist";
        }
    }

    public void setLastTimePlantWasWatered(LocalDateTime lastTimePlantWasWatered) {
        this.lastTimePlantWasWatered = lastTimePlantWasWatered;
    }
}