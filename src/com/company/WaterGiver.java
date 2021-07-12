package com.company;
import java.util.Timer;
import java.util.TimerTask;

public class WaterGiver {

    //private MoistLevelDecreaser moistLevelDecreaser = new MoistLevelDecreaser();
    private int amountOfWaterToGive;
       private boolean turnWaterOn = false;
    //private int measuredMoistInPercent = getMeasuredMoistInPercent();
    //private int decreaser = moistLevelDecreaser.decreaseMoistLevel();
    //private int minimum =  getMoistLevelForWatering();

    public int getAmountOfWaterToGive(Plant plant, AmountOfWaterCalculator calculator) {
       return amountOfWaterToGive = calculator.getAmountOfWaterToGive(plant);
    }

    // fake moist level measured by the moist meter. Gives a random moist level between min and max.
//    public int getMeasuredMoistInPercent() {
//        int min = 5;
//        int max = 95;
//        return measuredMoistInPercent = (int)(Math.random()*(max-min+1)+min);
//    }

//    public void waterGiverTimer() {
//        Timer timer = new Timer();
//        TimerTask task = new TimerTask() {
//        public void run() {
//            //FrequencyCalculator frequencyCalculator = frequencyCalculator.getAmountOfWaterToGive();
//            if (decreaser > minimum) {
//                System.out.println("The moist percentage of your plant soil is " + decreaser + "%.");
//            } else {
//                System.out.println("The plant will now be watered.");
//                System.out.println("Next watering moment wil be in " + amountOfWaterToGive + " hours.");
//                timer.cancel();
//            }
//            decreaser--;
//            }
//        };
//        timer.scheduleAtFixedRate(task, 0, 1000);
//    }

    public boolean turnWaterOn() {
        if (amountOfWaterToGive <= minimum) {
            turnWaterOn = true;
        }
        else{
            turnWaterOn = false;
        }
        return turnWaterOn;
    }

    //public int getWaterRefill(){

    //}
}
