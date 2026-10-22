import java.util.Scanner;


public class HolidayBudgetstudent {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the java holiday planner.");
 
        System.out.print("Enter your budget \n");
        double budget = scanner.nextDouble();
        scanner.nextLine();


        double cost = 0;
        int gifts = 0;
        Boolean more = true;


        while (more) {
            System.out.println("Enter the gift name");
            String gift = scanner.nextLine();
          if (gifts >= 1){
            scanner.nextLine();
          }
            System.out.println("Enter the gift price");
            double price = scanner.nextDouble();
       
            if (price > 0) {
                cost = cost + price;
                gifts++;


                System.out.println("Added " + gift + " to the list. ");


                if (cost > budget) {
                    System.out.println("You have exceeded your budget");
                }


            }
   
            System.out.print("Would you like to add more? (true/false): ");
            more = scanner.nextBoolean();
        }


        double remainder = budget - cost;
      
        System.out.println("Finalized List");
      if (gifts > 1){
        
        System.out.println("There are " + gifts + " gifts. ");
      }else{
        System.out.println("There is 1 gift. ");
      }
        System.out.println("Your budget was $" + budget);
        System.out.print("You spent $" + cost);
        System.out.println(", leaving you with $" + remainder + " left.");


        if (budget > cost) {
            System.out.print("You stayed within budget and ");
        } else if (cost > budget ){
            System.out.print("You spent over the budget, though");
        } else {
          System.out.print("You spent the exact amount in the budget and ");
        }


        if (gifts >= 7) {
            System.out.println("you managed to get a LOT of gifts.");
        } else if (gifts >= 3) {
            System.out.println("you got a few gifts.");
        } else {
            System.out.println("you made sure your gift was special.");
        }
scanner.close();
    }
}




