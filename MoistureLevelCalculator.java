public class MoistureLevelCalculator
{
    double multiplier;
    int amountOfWaterToGive;
    int hoursBeforeWateringAgain;

    public WaterNeeds moistureLevelCalculator(Plant plant){
        switch (plant.moistureLevel)
        {
            case 1:
                amountOfWaterToGive = 1;
                multiplier = 10;
            
            case 2:
                amountOfWaterToGive = 5;
                multiplier = 5;

            case 3:
                amountOfWaterToGive = 25;
                multiplier = 4;

            case 4:
                amountOfWaterToGive = 50;
                multiplier = 3;

            case 5:
                amountOfWaterToGive = 150;
                multiplier = 2.3;

            default:
        }


        hoursBeforeWateringAgain = GetHoursBeforeWatering(plant.specialNeeds);
        if (hoursBeforeWateringAgain > 48) {
            amountOfWaterToGive *= multiplier;
        }
        
        return new WaterNeeds(amountOfWaterToGive, hoursBeforeWateringAgain);
    }
}