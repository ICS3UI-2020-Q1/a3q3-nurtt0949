import java.util.Scanner;

/**
 *This program tells the user its letter grade in numbers
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    //ask user for letter grade
     System.out.println("Please enter letter grade (A,B,C,D,F)" );
     String letter = input.nextLine();
    //determine the letter grade in numbers
      switch(letter){
       case "A" : 
       System.out.println("This is between 80% and 100%");
       break;
       case "B" :
       System.out.println("This is between 70% and 79%");
       break; 
       case "C" :
       System.out.println("This is between 60% and 69%");
       break; 
       case "D" :
       System.out.println("This is between 50% and 59%");
       break; 
       case "F" :
       System.out.println("This is between 0% and 49%");
      }
      }
      }
