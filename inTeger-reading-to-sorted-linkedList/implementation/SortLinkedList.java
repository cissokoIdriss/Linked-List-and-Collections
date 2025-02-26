package implementation;

import java.util.Collections;
import java.util.LinkedList;

/**
 * This class sort a linked list of integers.
 * it follows the single responsibility by dealing with the sorting aspect only
 * Also the open closed principle : closed for modification and open for future
 * extensions like for example sorting from largest to the smallest etc...
 * Uses Collection to sort.
 */
public class SortLinkedList {

    /**
     * Default Constructor
     */
    SortLinkedList() {
    }

    /**
     * This method sorts a linked List of integer from the smallest to the largest
     * 
     * @param nonSortedList An instance of the non-sorted list from the MyLinkedList
     * @return sortedList a sorted list instance of the implementation of the
     *         MyLinkedList
     */
    public implementation.MyLinkedList ascendingSort(implementation.MyLinkedList nonSortedList) {
        // creating an instance of the MyLinkedList that will hold the sorted list
        implementation.MyLinkedList sortedList = new implementation.MyLinkedList();
        // get a copy of the unsorted list and put it in the list to pass to
        // Collections.sort()
        LinkedList<Integer> listToSort = nonSortedList.getLinkedList();
        Collections.sort(listToSort); // code reuse to sort a list
        listToSort.forEach(number -> sortedList.addToEnd(number));
        return sortedList;
    }

}
