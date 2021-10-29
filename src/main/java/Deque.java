// Task 2 - Deque realization
public class Deque {
    private int maxSize;
    private char[] deque;
    private int top;
    private int front;
    private boolean x;
    private int items;

    public Deque(int size) {
        this.maxSize = size;
        this.deque = new char[this.maxSize];
        this.top = -1; // the deque is empty
        this.front = 0;
        this.items = 0;
    }

    public void addFirstNLast(char i) {
        if (top == maxSize - 1) {
            top = -1;
            items--;
        }
        this.deque[++top] = i;
        items++;
    }

    public char removeFirst() {
        items--;
        return this.deque[this.top--];
    }

    public char removeLast() {
        char temp = deque[front++];
        if (front == maxSize) {
            front = 0;
        }
        items--;
        return temp;
    }

    public char peekFirst() {
        return this.deque[top];
    }

    public char peekLast() {
        return this.deque[front];
    }

    public void print() {
        for (int i = top, j = front; i >= j; i--) {
            System.out.println(deque[i]);
        }
    }
}
