public class Shelter
{
   private Animals animals = new Animals();
   private Customers customers = new Customers();
   private Volunteers volunteers = new Volunteers();
   private int counter = 0;
   
//cost of animals.
   private double costDog = 270.0;
   private double costFish = 70.0;
   private double costCat = 210.0;
   private double costBird = 30.0;
   private double costReptile = 170;
 
 //set name, type, and cost of animals
   public void nameAnimals()
   {
      animals.setName("Star", counter++);
      animals.setName("Fido", counter++);
      animals.setName("Jelly", counter++);
      animals.setName("RedBeard", counter++);
      animals.setName("Lulu", counter++);
      animals.setName("Spike", counter++);
      animals.setName("Sir Cumference", coun250ter++);
      animals.setName("Mr.Fluffles", counter++);
      animals.setName("Ace", counter++);
      animals.setName("Lady", counter++);
   }  
   public void typeOfAnimals()
   {
      animals.setType("fish", counter++);
      animals.setType("dog", counter++);
      animals.setType("fish", counter++);
      animals.setType("bird", counter++);
      animals.setType("bird", counter++);
      animals.setType("cat", counter++);
      animals.setType("dog", counter++);
      animals.setType("reptile", counter++);
      animals.setType("cat", counter++);
      animals.setType("reptile", counter++);
   } 
   public void costOfAnimals()
   {      
      for(int index = 0; index < 10; index++)
      {
         if (animals.checkSpecies().equalsIgnoreCase("fish"))
         {
            animals.setCost(costFish, index);
         }
         else if (animals.checkSpecies().equalsIgnoreCase("dog"))
         {
            animals.setCost(costDog, index);
         }
         else if (animals.checkSpecies().equalsIgnoreCase("cat"))
         {
            animals.setCost(costCat, index);
         }
         else if (animals.checkSpecies().equalsIgnoreCase("bird"))
         {
            animals.setCost(costBird, index);
         }
         else if (animals.checkSpecies().equalsIgnoreCase("reptile"))
         {
            animals.setCost(costReptile, index);
         }
      }
   }
   
//adopt an animal
   public void adoptPet(int index)
   {
      System.out.println(animals.
      animals.setName("", index);
      animals.setType("", index);
      animals.setCost(0.0, index);
   }
   
//make database of customers
   
//make database of volunteers

}
