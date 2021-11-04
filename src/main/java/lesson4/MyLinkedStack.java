package lesson4;

import java.util.ListIterator;

public class MyLinkedStack<T> {
    private MyDoublyLinkedList<T> stack;

    public MyLinkedStack() {
        this.stack = new MyDoublyLinkedList<>();
    }

    public void push(T item) {
        stack.insertLast(item);
    }

    public T pop() {
        return stack.deleteLast();
    }

    public T peek() {
        return stack.getLast();
    }

    public int search(T item) {
        return stack.indexOf(item);
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public void print() {
        System.out.println("My stack = " + stack);
    }

    public void printHasNext() {
        ListIterator<T> listIterator = stack.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    public void printHasPrevious() {
        ListIterator<T> listIterator = stack.listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    public void printNextIndex(){
        ListIterator<T> listIterator = stack.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex());
        }
    }

    public void printPreviousIndex() {
        ListIterator<T> listIterator = stack.listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex());
        }
    }

}