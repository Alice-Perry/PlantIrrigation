// boolean soilMoistureSensor = true; // is the sensor working?
// boolean soilMoistureSensorInput = true; //is the soil moist? (true=moist, false=dry)
// boolean weatherIsSunny = true; // true=sunny, false=cloudy
// while(soilMoisterSensor= true && soilMoistureSensorInput = true)
//    giveWater=false;

public class Main {
    public static void main(String[] args) {      
       
        Greenhouse greenhouse = new Greenhouse();
        greenhouse.GiveWater();
    }
}