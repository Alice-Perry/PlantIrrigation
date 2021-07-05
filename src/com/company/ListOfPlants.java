package com.company;
import java.util.ArrayList;

public class ListOfPlants {
    ArrayList<Plant> arrayListOfPlants = new ArrayList<Plant>();

    public void setArrayListOfPlants(ArrayList<Plant> arrayListOfPlants) {
        this.arrayListOfPlants = arrayListOfPlants;
    }

    public ArrayList<Plant> getArrayListOfPlants(){
        arrayListOfPlants.add(new Plant("Aloe" , 1, 1));
        arrayListOfPlants.add(new Plant("Amaryllis" , 2, 2));
        arrayListOfPlants.add(new Plant("Azalea" , 3, 3));
        arrayListOfPlants.add(new Plant("Bougainvilles" , 3, 3));
        arrayListOfPlants.add(new Plant("Buxus" , 2, 1));
        arrayListOfPlants.add(new Plant("Orchid" , 1, 2));
        return arrayListOfPlants;
    }

   public String displayArrayListOfPlants(){
        for (int i=0; i<arrayListOfPlants.size(); i++) {
            System.out.println(arrayListOfPlants);
        }return "List of plants in array: " + arrayListOfPlants;
    }
}