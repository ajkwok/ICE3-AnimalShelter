public class Animals

// fields
   private String name;
   private double cost;
   privat String price;
   private String[][] animals = new String[3][10]; 
   
//constructor-no args
   public Animals()
   {
      cost = 0.0;
      price = "$ " + cost;
   }
   
//constructor with args,
   public Animals(String name, String type, double cost, int index)
   {
      this.cost = cost;
      price = "$ " + cost;
      animals[0][index] = name;
      animals[1][index] = type;
      animals[2][index] = price;
   }
   
//method to set name; use loop to set all ten names
   public void setName(String name, int index)
   {
      animals[0][index] = name;
   }
   
//method to set animal species; use loop to set; include user validation to limit types;
   public void setType(String species, int index)
   {
      animals[1][index] = species;
   }
   
//method to set cost; use loop to set
   public void setCost(double cost, int index)
   {
      this.cost = cost;
      price = "$ " + cost;
      animals[2][index] = price;
   }
   
//method to display animals, types, and cost
   public static void displayAnimals()
   {
      for (int index = 0; index < 10; index++)
      {
         if (animals[0][index].equals(""))
         {
            System.out.println("There is no animal at this index.");
         }
         else
            System.out.println(animals[0][index] + " is a(n) " + animals[1][index] + " and costs " + animals[2][index] + ".");
      }
   }
   
//method to display one animal at specific index; is it needed? might remove later
   public static void displaySpecificAnimal(int index)
   {
      System.out.println(animals[0][index] + " is a(n) " + animals[1][index]
                        + " and costs " + animals[2][index] + ".");
   }
   
//method to check if there is a specific type of animal in the shelter and if so give names and cost
   public static void searchBySpecies(String species)
   {
      
      for (int index = 0; index < 10; index++)
      {
         int speciesCounter = 0;
         if (animals[1][i].equalsIgnoreCase(species))
         {
            System.out.println((index + 1) + ". " + animals[0][index] + " is a(n) " + animals[1][index] + " and costs " 
                               + animals[2][index] + ".");
            speciesCounter++;
         }
         if (speciesCounter == 0)
         {
            System.out.println("Sorry, this shelter does not have any animals of that type.");
         }
      }
   }
   public static String checkSpecies(int index)
   {
      return animals[1][index];
   }
}
