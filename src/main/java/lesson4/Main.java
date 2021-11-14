package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyLinkedStack newStack = new MyLinkedStack();

        //insert new elements
        newStack.push("Apple");
        newStack.push("Orange");
        newStack.push("Banana");
        newStack.push("Pineapple");
        newStack.push("Avocado");
        newStack.print();
        System.out.println();

        //hasNext ListIterator
        System.out.println("Printing 'hasNext ListIterator'...");
        newStack.printHasNext();
        System.out.println();

        //hasPrevious ListIterator
        System.out.println("Printing 'hasPrevious ListIterator'...");
        newStack.printHasPrevious();
        System.out.println();

        //nextIndex ListIterator
        System.out.println("Printing 'nextIndex ListIterator'...");
        newStack.printNextIndex();
        System.out.println();

        //previousIndex ListIterator
        System.out.println("Printing 'previousIndex ListIterator'...");
        newStack.printPreviousIndex();
        System.out.println();

        //check if the stack is empty
        System.out.println("Is my stack empty? " + newStack.empty());
        System.out.println();

        //search for a special element, returns an index of the element
        System.out.println("The element I'm looking for has an index = " + newStack.search("Pineapple"));
        System.out.println();

        //peek-method, returns the top element
        System.out.println("Top element = " + newStack.peek());
        System.out.println();

        //delete the top element
        System.out.println("Deleting the top element...");
        newStack.pop();
        newStack.print();

    }
}
