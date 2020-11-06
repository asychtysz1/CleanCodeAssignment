import java.util.Scanner;
/**
 * Take's a users input, assigns it to an integer. That integer is then
 * converted into a Roman Numeral.
 *
 * @author Andrew Sychtysz
 * @version 3/29/2019
 */
public class Project4
{
    public static void main (String[]args){                        
        Scanner keyboard = new Scanner(System.in);
        String response;
        System.out.println("Welcome to integer to Roman numeral conversion program");
        System.out.println("------------------------------------------------------");        
        do {
            System.out.print("Please enter an integer in the range 1-3999 (both inclusive): ");
            int roman = Integer.parseInt(keyboard.nextLine() );    
                if((roman < 1) || (roman > 3999)) {
                    System.out.println("Sorry, the number is outside the range.");
                }else if((roman >= 1) && (roman <= 3999)) {
                    System.out.println(Conversion.Convert(roman));   
                }   
            System.out.print("Do you want to try again? Press Y for yes or N for no: ");
            response = keyboard.nextLine().toUpperCase();
            System.out.println("");
        } while (response.charAt(0) == 'Y');
        System.out.println("Thank you for using my program. Have a nice day!");
    }
}