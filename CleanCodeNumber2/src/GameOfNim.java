import java.util.Random;
import java.util.Scanner;
/**
 * This my class for the GameOfNim. My constructor for the Game of Nim helps create the pile size the user wishes to start with. 
 * The play method starts the game! The player methods control the nature of each player! There are two possible opponents the 
 * human can play! Luigi, the easier and less intelligent computer player. And Mario, the far superior computer player with a 
 * better strategy to outsmart his human opponents. Enjoy! 
 * 
 *
 * @author (Andrew Sychtysz)
 * @version (Version 4 4/13/2019)
 */
public class GameOfNim
{										// Instance Variables
    Random generator = new Random();				
    Scanner keyboard = new Scanner(System.in);
    boolean compFirst = generator.nextBoolean();
    boolean compMario = generator.nextBoolean(); 
    private int pileSize;
    private int roundNumber = 1;	    // Static Variables for Record Calculations
    private static int gameTotalCount = 0;
    private static int marioWins = 0;
    private static int luigiWins = 0;
    private static int humanWins = 0;
    private static int marioLosses = 0;
    private static int luigiLosses = 0;
    private static int humanLosses = 0; // End of Instance Variables
   
    /**
     * Constructor for objects of class GameOfNim
     * @param min The minimum amount of marbles the size can possibly be
     * @param max The maximum amount of marbles the size can possibly be
     */
    public GameOfNim(int min, int max) {
        int range = (max - min);
        pileSize = generator.nextInt(range + 1) + min;
    }

    /**
     *  This play method will randomly choose which player is playing the human. Also, which order of turns these players will follow.
     *  Also, keeping count of the current round the players are in.
     */    
    public void play() {
    	gameTotalCount++;
        System.out.println("Game begins...");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Initially there are " + pileSize + " marbles in the pile");
        System.out.println("----------------------------------------------------------------------------");
        do {
            if (compMario) {
                if (compFirst) {
                    System.out.println(" ");
                    System.out.println("----------------------------------------------------------------------------"); 
                    System.out.println("Round: " + roundNumber + " Current size of Marbles: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    mario();
                    humanPlayer();
                    roundNumber++;
                } else {
                    System.out.println(" ");
                    System.out.println("----------------------------------------------------------------------------"); 
                    System.out.println("Round: " + roundNumber + " Current size of Marbles: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");                    
                    humanPlayer();
                    mario();
                    roundNumber++;
                } 
            } else {
                if (compFirst) {
                    System.out.println(" ");
                    System.out.println("----------------------------------------------------------------------------"); 
                    System.out.println("Round: " + roundNumber + " Current size of Marbles: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");                    
                    luigi();
                    humanPlayer();
                    roundNumber++;
                } else {
                    System.out.println(" ");
                    System.out.println("----------------------------------------------------------------------------"); 
                    System.out.println("Round: " + roundNumber + " Current size of Marbles: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");                    
                    humanPlayer();
                    luigi();
                    roundNumber++;
                }                    
            }
        } while(pileSize > 1);
    }

    /**
     * Luigi, the less intelligent of players. His preference of strategy is to just pick a random number in between the playable range.
     * Also, choosing what his reaction is to the decision of victory. If he wins or loses, he will respond in a certain way.
    */
    public void luigi() {
        if (pileSize > 1) {
            System.out.println(" ");
            int dumbRange = (pileSize / 2);
            int amount = generator.nextInt(dumbRange) + 1;          
            pileSize -= amount;
            if (pileSize == 1) {   // If Luigi Wins
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("LUIGI'S  TURN: Luigi reaches into the pile and grabs " + amount + " marble(s).");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Luigi took the marbles. Current size of pile : " + pileSize);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("YOU HAVE NO CHOICE BUT TO TAKE THE LAST MARBLE ");
                pileSize -= 1;
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("You took " + 1 + " marble(s), from the pile. " + "Current number of marbles: " + pileSize);
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("****************************************************************************");
                System.out.println("******************** The winning star is awarded too... ********************");
                System.out.println("-                            * ''LUIGI'' *                                 -"); 
                System.out.println("-    ''Now out of me way! I must help Mario save the Mushroom Kingdom!''   -");
                System.out.println("****************************************************************************");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println("────────██▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██────────────────────────────────");
                System.out.println("──────██▓▓▓▓▓▓████████████░░░░██────────────────────────────────");
                System.out.println("────██▓▓▓▓▓▓████████████████░██─────────────────────────────────");
                System.out.println("────██▓▓████░░░░░░░░░░░░██████──────────────────────────────────");
                System.out.println("──████████░░░░░░██░░██░░██▓▓▓▓██────────────────────────────────");
                System.out.println("──██░░████░░░░░░██░░██░░██▓▓▓▓██────────────────────────────────");
                System.out.println("██░░░░██████░░░░░░░░░░░░░░██▓▓██────────────────────────────────");
                System.out.println("██░░░░░░██░░░░██░░░░░░░░░░██▓▓██────────────────────────────────");
                System.out.println("──██░░░░░░░░░███████░░░░██████──────────────────────────────────");
                System.out.println("────████░░░░░░░███████████▓▓██──────────────────────────────────");
                System.out.println("──────██████░░░░░░░░░░██▓▓▓▓██──────────────────────────────────");
                luigiWins++;
                humanLosses++;
            } else { 			  // Luigi's regular turn
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("LUIGI'S TURN:");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Luigi reaches into the pile and grabs " + amount + " marble(s)."); 
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Luigi took the marbles. Current size of pile: " + pileSize );
                System.out.println("----------------------------------------------------------------------------");
            	}
        	} else {			  // Luigi Loses
	            System.out.println("----------------------------------------------------------------------------");
	            System.out.println("Luigi screams: Oh noooooOoOoOoOOoOOOO!!!! How did I lose!?");
	            System.out.println("----------------------------------------------------------------------------");
	            System.out.println("Luigi screams: Maaarioooooooo!!!! I need your heeEeEElllp!");
	            System.out.println("----------------------------------------------------------------------------");
	            luigiLosses++;
        	}
    }
    
    /**
     * Mario, the far more intelligent of players. His strategy, is to make the size of marbles equal a power of 2 - 1. For example, 3, 7, 15, 24....
     * Also, choosing what his reaction is to the decision of victory. If he wins or loses, he will respond in a certain way.
     */
    public void mario() {
        if (pileSize > 1) {
            int amount;
            int currentPileSize = pileSize;
            if (pileSize == 3 || pileSize == 7 || pileSize == 15 || pileSize == 31 || pileSize == 63) {
                amount = generator.nextInt((pileSize / 2)) + 1;
                pileSize -= amount;
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("MARIO'S TURN                                   ");
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                System.out.println("----------------------------------------------------------------------------");
            }
            else {
                if (pileSize > 63) {
                    pileSize = 63;
                    amount = (currentPileSize - pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN                                   ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                }
                else if (pileSize > 48) {
                    pileSize = 48;
                    amount = (currentPileSize - pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN                                   ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                }
                else if (pileSize > 35) {
                    pileSize = 35;
                    amount = (currentPileSize - pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");                    
                }
                else if (pileSize > 24) {
                    pileSize = 24;
                    amount = (currentPileSize - pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN                                   ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");                    
                }
                else if (pileSize > 15) {
                    pileSize = 15;
                    amount = (currentPileSize - pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN                                   ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");                    
                }
                else if (pileSize > 7) {
                    pileSize = 7;
                    amount = (currentPileSize - pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN                                   ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");                    
                }
                else if (pileSize > 3) {
                    pileSize = 3;
                    amount = (currentPileSize - pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN                                   ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                }
                else if (pileSize > 1) {   // Mario Wins
                    amount = generator.nextInt((pileSize / 2)) + 1;
                    pileSize -=1;
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("MARIO'S TURN                                   ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario reaches into the pile and grabs " + amount + " marble(s)."); 
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Mario took the marbles. Current size of pile: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("YOU HAVE NO CHOICE BUT TO TAKE THE LAST MARBLE ");
                    pileSize -= 1;
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("You took " + 1 + " marble(s), from the pile. " + "Current number of marbles: " + pileSize);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("****************************************************************************");
                    System.out.println("******************** The winning star is awarded too... ********************");
                    System.out.println("-                            * ''MARIO'' *                                 -"); 
                    System.out.println("-       ''Now out of me way! I must go and save the Mushroom Kingdom!''    -");
                    System.out.println("****************************************************************************");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("────────██▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██");
                    System.out.println("──────██▓▓▓▓▓▓████████████░░░░██");
                    System.out.println("────██▓▓▓▓▓▓████████████████░██");
                    System.out.println("────██▓▓████░░░░░░░░░░░░██████");
                    System.out.println("──████████░░░░░░██░░██░░██▓▓▓▓██");
                    System.out.println("──██░░████░░░░░░██░░██░░██▓▓▓▓██");
                    System.out.println("██░░░░██████░░░░░░░░░░░░░░██▓▓██");
                    System.out.println("██░░░░░░██░░░░██░░░░░░░░░░██▓▓██");
                    System.out.println("──██░░░░░░░░░███████░░░░██████");
                    System.out.println("────████░░░░░░░███████████▓▓██");
                    System.out.println("──────██████░░░░░░░░░░██▓▓▓▓██");
                    marioWins++;
                    humanLosses++;                    
                }
            }
        } else {				// Mario Loses
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Mario screams: Wahhhahhhhhhhhhahaaaaaaaaaah! ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Mario screams: You need to playa' me again a' pleaza'!");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Mario screams: Clearly I am a' not smart' enough to beata' bowsa");
            System.out.println("----------------------------------------------------------------------------");   
            marioLosses++;
        }
    }
    
    /**
     * The humanPlayer method is essentially the controller for the user. The humanPlayer method is what
     * allows someone to play the game. It will ensure the user stays within the playable range, and it's 
     * reaction to the results of the game.
     */
    public void humanPlayer() {
        if (pileSize > 1) {	// Human Regular Turn
            int dumbRange = (pileSize / 2);
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("YOUR TURN! Please enter an amount of marbles in between 1 - " + dumbRange + ": ");
            int amount = keyboard.nextInt();
            System.out.println("----------------------------------------------------------------------------");
            System.out.println(" ");
            if ((amount > pileSize / 2) || (amount < 0)) { 
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("* Hey you know the rules, please enter an amount of marbles in between 1 - " + dumbRange + " *");
                System.out.println("----------------------------------------------------------------------------");
                System.out.print("YOUR TURN! Please enter an amount of marbles in between 1 - " + dumbRange + ": ");
                amount = keyboard.nextInt();
                System.out.println("----------------------------------------------------------------------------");
                pileSize -= amount;
                System.out.println("You took " + amount + " marble(s), from the pile. " + "Current number of marbles: " + pileSize); 
                System.out.println("----------------------------------------------------------------------------");
            } else {		// Human Wins
                pileSize -= amount;
                System.out.println("You took " + amount + " marble(s), from the pile. " + "Current number of marbles: " + pileSize); 
                System.out.println("----------------------------------------------------------------------------");
                System.out.println(" ");
                if (pileSize == 1) {
                    System.out.println("You're opponent has no choice but to take the last marble in the pile.");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    System.out.println("****************************************************************************");
                    System.out.println("****************** The winning star is awarded too... **********************");
                    System.out.println("- - - - - - - >             * ''YOU'' *        < - - - - - - - - - - - - - -"); 
                    System.out.println("-          ''You have outsmarted one of the Mario Brothers!''              -");
                    System.out.println("****************************************************************************");
                    System.out.println("");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("***************** A win has been added to your record! *********************");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("");
                    humanWins++;
                }    
            }
        } else { // Human loses
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("You've been outsmarted by one of the Mario Brothers...");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("A loss has been added to your record. ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("We will send you back to the main menu.");
            System.out.println("----------------------------------------------------------------------------");          
        }
    }
    
    /**
     * Print String Method for Game Records
     * return s String that contains the Records
     */
    public static String printGameRecords() {
        String s = "";
        s += "You have completed " + gameTotalCount + " matches during this session!\n"; 
        s += "You have won " + humanWins + " match(es) and you have lost " + humanLosses + " match(es).\n";
        s += "Luigi has won " + luigiWins + " match(es) and he has lost " + luigiLosses + " match(es).\n";
        s += "Mario has won " + marioWins + " match(es) and he has lost " + marioLosses + " match(es).\n";
        return s;
    }
}    