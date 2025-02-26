package implementation;

/**
 * Main class to handle user interactions and manage linked list operations.
 * It provides a menu interface for adding, removing, and displaying
 * elements sorted or unsorted.
 * <p>
 * Please refer to the Readme.txt regarding how to run the program
 * or generate the documentation
 * </p>
 * <p>
 * This program also follows the Single responsibility, encapsulation,
 * and guidelines regarding variables and class naming convention.
 * </p>
 * <p>
 * It reuses code from the LinkedList Collection and use the sorting methods
 * from the Collections as well
 * </p>
 *
 * @author Idriss Cissoko
 * @version 1.0
 * @since 2025-02-11
 * 
 */
public class Main {

    /**
     * The entry point of the program.
     * It initializes the linked list and user input manager, then
     * processes user input based on menu selections until the user chooses to exit.
     * 
     * @param args default parameter for the main method (not used in this program).
     */
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        UserInputManagement inputManager = new UserInputManagement();

        while (true) {
            MenuOptionsDisplay.displayMenu();
            String choice = inputManager.readString();

            switch (choice) {
                case "AB":
                    System.out.print("Enter a number to add to the beginning: ");
                    int num1 = inputManager.readInteger();
                    myList.addToBeginning(num1);
                    System.out.println(num1 + " added to the beginning.");
                    break;

                case "AE":
                    System.out.print("Enter a number to add to the end: ");
                    int num2 = inputManager.readInteger();
                    myList.addToEnd(num2);
                    System.out.println(num2 + " added to the end.");
                    break;

                case "RB":
                    myList.removeFromBeginning();
                    break;

                case "RE":
                    myList.removeFromEnd();
                    break;

                case "DO":
                    SortLinkedList sorter = new SortLinkedList();
                    MyLinkedList sortedList = sorter.ascendingSort(myList);
                    System.out.println("Sorted List is: " + sortedList.getLinkedList());
                    break;

                case "DU":
                    System.out.println("Unsorted List is: " + myList.getLinkedList());
                    break;

                case "Q":
                    System.out.println("Exiting program...");
                    inputManager.closeScanner();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
