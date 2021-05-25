public class Plant 
{
    public String plantName;
    public int moistureLevel;
    public int specialNeeds;

    public int moistureLevel (int moistureLevelNumber)
    {
        switch (moistureLevelNumber)
        {
            case 1:
                System.out.println("This plant prefers very dry soil");
                return 1;
            case 2:
                System.out.println("This plant prefers dry soil");
                return 2;
            case 3:
                System.out.println("This plant prefers medium wet soil");
                return 3;
            case 4:
                System.out.println("This plant prefers wet soil");
                return 4;
            case 5:
                System.out.println("This plant prefers very wet soil");
                return 5;
            default:
                System.out.println("That moisture level does not exist.");
                System.exit(0);
                return 0;
        }
    }

       public int specialNeeds(int specialNeedsNumber)
    {
        switch (specialNeedsNumber)
        {
            case 1:
                System.out.println("Give more frequent small amounts of water.");
                return 1; 
            case 2:
                System.out.println("Allow soil to dry out in between watering");
                return 2;
            case 3:
                System.out.println("Give less frequent one amount of water.");
                return 3;
            default:
                System.out.println("That number does not exist.");
                System.exit(0);
                return 0;
        }
    }

    public void setNewMoistureLevel(int moisturelevel)
    {
        this.moistureLevel = moistureLevel(moisturelevel);
    }

    public void setNewSpecialNeeds(int newSpecialNeeds)
    {
        this.specialNeeds = specialNeeds(newSpecialNeeds);
    }
}