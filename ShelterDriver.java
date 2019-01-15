import java.util.Scanner;

public class ShelterDriver
{
   private Animals animals;
   private Customer customer;
   private Volunteer volunteer;
   private Shelter shelter;

   
   public static void main(String[] args)
   {
   
//create objects
      animals = new Animals();
      volunteer = new Volunteer();
      customer = new Customer();
      shelter = new Shelter();
      
//create scanner      
      Scanner kb = new Scanner(System.in);
      
//Volunteer login      
      boolean recognized = false;
      String volunteerName;
      while (!recognized)
      {
         System.out.print("Please enter volunteer name (Enter 000 to exit): ");
         volunteerName = kb.nextLine();
         recognized = volunteer.checkName(volunteerName);                            //no volunteer class yet
         if (volunteerName.equals("000"))
         {
            System.exit(0);
         }
         if (!recognized)
         {
            System.out.print("I'm sorry, that name is not recognized. ");
         }
      }
      
//new or old customer, create new customer account/profile/history???      
      recognized = false;
      boolean done = false;
      String customerName;
      int newOrReturning;
      System.out.print("New customer(1) or returning customer(2)? ");
      newOrReturning = kb.nextInt();
      while (!done)
      {
         switch(newOrReturning)
         {
            case(1):
            {
               System.out.print("Welcome, please enter your name. ");
               customerName = kb.nextLine();
               customer.newAccount(customerName);                                      //haven't made a customer class either
               done = true;
               break;
            }
            case(2):
            {
               System.out.print("Please enter customer name (Enter 000 to exit): ");
               while (!recognized)
               {
                   customerName = kb.nextLine();
                   recognized = customer.checkName(customerName);
                   if (customerName.equals("000"))
                  {
                     System.exit(0);
                  }
                  if (!recognized)
                  {
                     System.out.print("I'm sorry, that name is not recognized. Please try again. ");
                  }
               }
               if (recognized)
               {
                  done = true;
               }
               break;
            }
            default:
            {
               System.out.print("Please enter a (1) if you are a new customer or a (2) if you are a returning customer: ");
               newOrReturning = kb.nextInt();
            }
         }
      }
      System.out.print("Welcome, what would you like to do?%n"
                       + "(1-browse, 2-search by type, 3-adopt an animal, 4-done)");
      int action = kb.nextInt();
      while(action != 4)
      {
         switch (action)
         {
            case (1):
            {
                System.out.println("These are the animals we currently have: ");
                Animals.displayAnimals();
                System.out.print("What would you like to do?%n"
                       + "(1-browse, 2-search by type, 3-adopt an animal, 4-done)");
                int action = kb.nextInt();
                break;
            }
            case (2):
            {
                System.out.print("What kind of animal are you looking for? ");
                String species = kb.nextLine();
                Animals.searchBySpecies(species);
                System.out.print("What would you like to do?%n"
                       + "(1-browse, 2-search by type, 3-adopt an animal, 4-done)");
                int action = kb.nextInt();
                break;
            }
            case (3):
            {
               int index;
               System.out.print("Enter the number of the animal you would like to adopt: ");
               index = kb.nextInt();
               shelter.adoptPet(index - 1);
               System.out.print("What would you like to do?%n"
                       + "(1-browse, 2-search by type, 3-adopt an animal, 4-done)");
                int action = kb.nextInt();
               break;
            }
            default:
            {
                System.out.print("What would you like to do?(1-browse, 2-search by type, 3-adopt an animal, 4-done) ");
                action = kb.nextInt();
            }
         }
      }
      System.out.println("Thank you for coming. Have a nice day.");
   }
}
