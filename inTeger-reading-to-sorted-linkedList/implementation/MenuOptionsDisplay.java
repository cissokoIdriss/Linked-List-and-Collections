package implementation;

/**
 * This class is responsible for displaying the possible options of the program
 * 
 */
public class MenuOptionsDisplay {

    /**
     * default constructor to create an instance of the menu Option
     */
    MenuOptionsDisplay() {
    }

    /**
     * This method prints the different options available to the user
     * on the command line
     */
    public static void displayMenu() {
        System.out.println("\nPlease select your operation using the following letters:");
        System.out.println("AB: Add a number to the beginning of the list");
        System.out.println("AE: Add a number to the end of the list");
        System.out.println("RB: Remove an element from the beginning of the list");
        System.out.println("RE: Remove an element from the end of the list");
        System.out.println("DO: Display your sorted list of numbers");
        System.out.println("DU: Display your unsorted list of numbers");
        System.out.println("Q: Quit the program");
        System.out.print("\nEnter your choice now: ");
    }
}
