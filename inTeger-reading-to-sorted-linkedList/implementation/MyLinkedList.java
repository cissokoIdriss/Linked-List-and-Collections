package implementation;

import java.util.LinkedList;

/**
 * This class implements a linked List using the java collection linkedList
 * By using the java collection linkedList we avoid reinventing the wheel,
 * because
 * we do not plan on learning more about wheels.
 * It only uses 4 methods from the linked List collection which are
 * addFirst, addLast, removeFirst, removeLast
 * It uses the following guidelines:
 * - encapsulation by protecting the list
 * - Single responsibility by managing the list only
 * - error handling
 * - Java collections
 */
public class MyLinkedList {
    /**
     * Define a protected empty linked list of integer named unsortedLinkedList
     */
    protected LinkedList<Integer> unsortedLinkedList = new LinkedList<>();

    /**
     * Default constructor that initializes an empty linked list.
     */
    public MyLinkedList() {
    }

    /**
     * constructs a linked List with a parameter number using the add method from
     * the java
     * linked list collection
     * 
     * @param number an Integer to add to the linked list
     */
    public MyLinkedList(int number) {
        unsortedLinkedList.addFirst(number);
    }

    /**
     * 
     * This methods is a getter for the unsortedLinkedList
     * 
     * @return unsortedLinkedList
     */
    public LinkedList<Integer> getLinkedList() {
        return this.unsortedLinkedList;
    }

    /**
     * This method adds an integer to the beginning of a list
     * 
     * @param number The integer to add to the beginning of the list
     */
    public void addToBeginning(int number) {
        unsortedLinkedList.addFirst(number); // code reuse
    }

    /**
     * This method adds an integer to the end of the list
     * 
     * @param number The integer to add to the end of the list
     */
    public void addToEnd(int number) {
        unsortedLinkedList.addLast(number); // code reuse
    }

    /**
     * This method removes an integer from the beginning of the list when the list
     * is not empty
     * otherwise it provides a feedback message to the user
     */
    public void removeFromBeginning() {
        if (!unsortedLinkedList.isEmpty()) {
            unsortedLinkedList.removeFirst(); // code reuse
        } else {
            System.out.println("The linked list is empty");
        }

    }

    /**
     * This method removes an integer from the end of the list when not empty
     * Otherwise provide a message regarding the emptiness of the list
     */
    public void removeFromEnd() {
        if (!unsortedLinkedList.isEmpty()) {
            unsortedLinkedList.removeLast(); // code reuse
        } else {
            System.out.println("The linked list is empty");
        }
    }

}