# Linked-List-and-Collections

# 📌 Project Overview:
This repository implements a program that reads a list of Integer numbers from scanned input and saves them into a Linked List. It then sorts the list from the smallest to the largest. </br>
It uses the <strong> Collections.sort() </strong> and follows <strong> Object-Oriented Programming principles </strong>, including:
 - Encapsulation: Using protected variables.
 - Single Responsibility Principle: Each class has a dedicated function.
 - Code Reusability: Leveraging Java’s built-in LinkedList and sorting methods from the collection framework.

# Sample Image
<img width="999" alt="Screenshot 2025-02-25 at 8 29 18 PM" src="https://github.com/user-attachments/assets/f7f4608f-4469-4554-831a-44498c60a128" />

#  ✨ Features
 - Interactive Menu display
 - Reading integer from the scanned input
 - Adding numbers to the front of the linked List
 - Adding numbers to the back of the linked List
 - Removing numbers from the back of the list
 - Removing numbers from the front of the list
 - Display the unsorted list " Only before sorting or after adding a number "
 - Display the sorted list


# 📁 Folder Structure
```
  📂 inTeger-reading-to-sorted-linkedList/
   |-- 📂 implementation   # contains Java source files
        |-- Main.java     # Entry point of the program
        |-- MenuOptionsDisplay.java  # Display menu options
        |-- MyLinkedList.java  # Manages linked List
        |-- SortLinkedList.java  # Sorts the linked list
        |-- UserInputManagement.java # handles user input
   |-- Readme.txt
   |-- UML-DIAGRAM.pdf 
    
    
```
# Prerequisites
To run or clone this program you will need Java installed [Java](https://www.java.com/en/download/help/download_options.html) and/or [Git](https://git-scm.com)

# How to clone the program 
Follow instructions from the github documentation <a href="https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository" target ="_blank"> Here </a>
# How to run the program

1 Navigate to root folder
```
  $ cd inTeger-reading-to-sorted-linkedList 

```
2 Compile java files

```
  javac -d . implementation/*.java 
```

3 Run the program

```
  java implementation.Main
```

# How to Create the Documentation
From the root folder
```
  javadoc -d doc implementation/*.java

```
Then open doc/index.html in the browser

# Notes
A new version which uses a stack is available. It also includes a Jar file to prevent compilation errors.
You can find it <a href="https://github.com/cissokoIdriss/Stack-and-Collections" target="_blank" ref="noreferrer"> Here </a>


