package com.company;
import java.util.ArrayList;

public class ListOfPlants {
    ArrayList<Plant> listOfPlants = new ArrayList<Plant>();

    public ListOfPlants() {
        listOfPlants.add(new Plant("Aloe" , 1, 1));
        listOfPlants.add(new Plant("Amaryllis" , 2, 2));
        listOfPlants.add(new Plant("Azalea" , 3, 3));
        listOfPlants.add(new Plant("Bougainvilles" , 3, 3));
        listOfPlants.add(new Plant("Buxus" , 2, 1));
        listOfPlants.add(new Plant("Orchid" , 1, 2));
    }

    public void setListOfPlants(ArrayList<Plant> listOfPlants) {
        this.listOfPlants = listOfPlants;
    }

    public ArrayList<Plant> getListOfPlants() {
        return listOfPlants;
    }

    public Plant findPlant(String plantType) {
        for (Plant plant : listOfPlants) {
            if (plant.getPlantType().equals(plantType)) {
                return plant;
            }
        }
        return null;
    }

   /*public String displayArrayListOfPlants() {
        String output = "";
        for (int i=0; i<arrayListOfPlants.size(); i++) {
            output = output + "List of plants in array: " + arrayListOfPlants.get(i);
        }
        System.out.println(output);
       return "arrayListOfPlants BLA BLA";
    }
    */
}
