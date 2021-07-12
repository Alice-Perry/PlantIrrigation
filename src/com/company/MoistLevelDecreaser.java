//package com.company;
//
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class MoistLevelDecreaser {
//
//    private int measuredMoistInPercent;
//    private int minimumMoistInPercent;
//
//    public int getMinimumMoistInPercent(Plant plant){
//        return minimumMoistInPercent = plant.getMoistLevelForWatering();
//    }
//
//    public int decreaseMoistLevel(){
//        Timer timer = new Timer();
//        TimerTask task = new TimerTask() {
//
//            public void run() {
//                do {
//                    measuredMoistInPercent--;
//                }
//                while(measuredMoistInPercent >= minimumMoistInPercent);
//                }
//        };
//        return measuredMoistInPercent;
//    }
//}