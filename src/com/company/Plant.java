package com.company;

public class Plant {
    private String plantType;
    private int moistureLevel;
    private int specialNeeds;
    private int measuredMoistInPercent; //= moistMeter.getMeasuredMoistInProcent();

    public Plant (String plantType, int moistureLevel, int specialNeeds) {
        this.plantType = plantType;
        this.moistureLevel = moistureLevel;
        this.specialNeeds = specialNeeds;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setMoistureLevel(int moistureLevel) {
        this.moistureLevel = moistureLevel;
    }

    public int getMoistureLevel(){
        return moistureLevel;
    }

    public void setSpecialNeeds(int specialNeeds) {
        this.specialNeeds = specialNeeds;
    }
    public int getSpecialNeeds() {
        return specialNeeds;
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

    public String displayPlantDetails() {
        return
                "\nPLANT\n" +
                "Name: " + plantType + ".\n" +
                "Moisture level: " + moistureLevelToString(moistureLevel) +".\n" +
                "Special needs: " + specialNeedsToString(specialNeeds) + ".\n" +
                "Moist level of the soil in percent: " + measuredMoistInPercent + ".\n"
        ;

    }
    /*public void setNewMoistureLevel(int moistureLevel) {
        this.moistureLevel = moistureLevel(newMoisturelevel);
    }

    public void setNewSpecialNeeds(int newSpecialNeeds) {
        this.specialNeeds = specialNeeds(newSpecialNeeds);
    }*/
}