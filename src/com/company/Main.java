package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        //MoistMeter moistMeter = new MoistMeter();

        PlantFactory factory = new PlantFactory();
        Plant plant = factory.createNewPlant();
        ListOfPlants listOfPlants = new ListOfPlants();
        listOfPlants.getArrayListOfPlants();
        listOfPlants.displayArrayListOfPlants();
        //WaterGiver watergiver = new WaterGiver(plant);
        //watergiver.waterGiverTimer();


        System.out.println(plant.displayPlantDetails());
    }

}
