package com.company;

public class Plant {
    private String plantType;
    private int moistureLevel;
    private int specialNeeds;

    private int amountOfWaterToGive;
    private int hoursBeforeWateringAgain;
    //private int measuredMoistInPercent;
    //private int moistLevelForWatering;



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

//        public int getMoistLevelForWatering() {
//        switch (moistureLevel) {
//            case 1 -> {
//                moistLevelForWatering = 5;
//            }
//            case 2 -> {
//                moistLevelForWatering = 25;
//            }
//            case 3 -> {
//                moistLevelForWatering = 50;
//            }
//            case 4 -> {
//                moistLevelForWatering = 65;
//            }
//            case 5 -> {
//                moistLevelForWatering = 85;
//            }
//            default -> moistLevelForWatering = 45;
//        }
//        return moistLevelForWatering;
//    }

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
                //"Percentage of moist in your plant soil is " + measuredMoistInPercent + ".\n" +
                "Your plant will be watered every " + hoursBeforeWateringAgain + " hours." +
                "The water container needs a refill in "  + "hours."
                ;
    }

    public void setMoistureLevel(int moistureLevel) {
        this.moistureLevel = moistureLevel;
    }

    public void setSpecialNeeds(int specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

       /*public void setNewMoistureLevel(int moistureLevel) {
        this.moistureLevel = moistureLevel(newMoisturelevel);
    }

    public void setNewSpecialNeeds(int newSpecialNeeds) {
        this.specialNeeds = specialNeeds(newSpecialNeeds);
    }*/
}