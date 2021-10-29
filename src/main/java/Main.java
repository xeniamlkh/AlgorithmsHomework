// Task 2 - Deque realization
public class Main {
    public static void main(String[] args) {
        Deque letter = new Deque(5);

        letter.addFirstNLast('A');
        letter.addFirstNLast('B');
        letter.addFirstNLast('C');
        letter.addFirstNLast('D');
        letter.addFirstNLast('E');

        System.out.println("Deque after creation: ");
        letter.print();
        System.out.println();

        System.out.println("Peek First = " + letter.peekFirst());
        System.out.println("Peek Last = " + letter.peekLast());
        System.out.println();

        System.out.println("Remove First = " + letter.removeFirst());
        System.out.println("Remove Last= " + letter.removeLast());
        System.out.println();

        System.out.println("Deque after deleting the first and the last elements: ");
        letter.print();
        System.out.println();

    }
}
