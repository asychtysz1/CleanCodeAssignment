import java.util.Scanner;
import java.util.Arrays;
/**
 * Main menu for the Game of Nim. The user has three choices. Play the game of nim. View the rules for the game of nim. Or exit the program. 
 * (More features to be added)
 *
 * @author Andrew Sychtysz
 * @version 5 11/16/2020
 */
public class Project5
{
    public static void main(String args[])
    {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("──────────────███████──███████----------------------------------------");
        System.out.println("──────────████▓▓▓▓▓▓████░░░░░██---------------------------------------");
        System.out.println("────────██▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██--------------------------------------");
        System.out.println("──────██▓▓▓▓▓▓████████████░░░░██--------------A game of nim.----------");
        System.out.println("────██▓▓▓▓▓▓████████████████░██---------------------------------------");
        System.out.println("────██▓▓████░░░░░░░░░░░░██████----------------------Made--------------");
        System.out.println("──████████░░░░░░██░░██░░██▓▓▓▓██---------------------by---------------");
        System.out.println("──██░░████░░░░░░██░░██░░██▓▓▓▓██--------------Andrew Sychtysz---------");
        System.out.println("██░░░░██████░░░░░░░░░░░░░░██▓▓██--------------------------------------");
        System.out.println("██░░░░░░██░░░░██░░░░░░░░░░██▓▓██--------------------------------------");
        System.out.println("──██░░░░░░░░░███████░░░░██████----------------------------------------");
        System.out.println("────████░░░░░░░███████████▓▓██----------------------------------------");
        System.out.println("──────██████░░░░░░░░░░██▓▓▓▓██----------------------------------------");
        System.out.println("────██▓▓▓▓██████████████▓▓██------------------------------------------");
        System.out.println("──██▓▓▓▓▓▓▓▓████░░░░░░████--------------------------------------------");
        System.out.println("████▓▓▓▓▓▓▓▓██░░░░░░░░░░██--------------------------------------------");
        System.out.println("████▓▓▓▓▓▓▓▓██░░░░░░░░░░██--------------------------------------------");
        System.out.println("██████▓▓▓▓▓▓▓▓██░░░░░░████████----------------------------------------");
        System.out.println("──██████▓▓▓▓▓▓████████████████----------------Made for class ---------");
        System.out.println("────██████████████████████▓▓▓▓██--------CS-140 Intro to Programming---");
        System.out.println("──██▓▓▓▓████████████████▓▓▓▓▓▓██--------------Section 0-2-------------");
        System.out.println("████▓▓██████████████████▓▓▓▓▓▓██--------------------------------------");
        System.out.println("██▓▓▓▓██████████████████▓▓▓▓▓▓██--------Proffessor: Aparna Mahadev----");
        System.out.println("██▓▓▓▓██████████──────██▓▓▓▓████--------------------------------------");
        System.out.println("██▓▓▓▓████──────────────██████----------------------------------------");
        System.out.println("──████----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        // End of Intro Graphic
     
        Scanner console = new Scanner(System.in);
        int choice;
        do { // Print Menu Options
            System.out.println();
            System.out.println("\t1. Play a new game of nim!");
            System.out.println("\t2. View the rules for a game of nim!");
            System.out.println("\t3. Check the win and loss records of all players!");
            System.out.println("\t4. Quit the program! Come back soon!");
            System.out.print("\nYour selection: ");
            choice = console.nextInt();
            String endGame;
            switch(choice) {
            
                case 1: // Game Start
                System.out.println("----------------------------------------------------------------------------");
                System.out.print("Enter the minimum number of marbles in your pile: ");
                int min = console.nextInt();
                System.out.println("----------------------------------------------------------------------------");
                System.out.print("Enter the maximum number of marbles in your pile: ");
                int max= console.nextInt();
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(" ");
                GameOfNim game = new GameOfNim(min, max);
                game.play();
                break;

                case 2: // Print Rules
                System.out.println("The following variant has an intersting winning strategy.");
                System.out.println("Two players alternatively take marbles from a pile.");
                System.out.println("In each move, a player chooses a how many marbles to take.");
                System.out.println("The player must take at least one but at most half of the marbles. ");
                System.out.println("Then the other player takes a turn. ");
                System.out.println("The player who takes the last marble loses.");
                break;
                
                case 3: // Print Records
                System.out.println(GameOfNim.printGameRecords());
                break;

                case 4: // Exit Game
                System.out.println("Thank you for Playing our Game!  Good bye!");
                System.exit(0);
                break;

                default: // Default
                System.out.println("Invalid option, please try again. If you wish to quit the program type '3'");
            }
        } while (choice != 5);
    }
}