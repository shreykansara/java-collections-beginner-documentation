import java.util.ArrayDeque;

class ArrayDequeDemo {
    public static void main(String[] args) {

        // Creating an ArrayDeque of Integer objects
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        /*
         * addFirst(E element)
         * Purpose    : Inserts the specified element at the front of the deque.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions :
         *   IllegalStateException - if capacity restrictions prevent insertion
         *   NullPointerException  - if the element is null
         */
        deque.addFirst(20);

        /*
         * addLast(E element)
         * Purpose    : Inserts the specified element at the rear of the deque.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions :
         *   IllegalStateException - if capacity restrictions prevent insertion
         *   NullPointerException  - if the element is null
         */
        deque.addLast(30);

        /*
         * offerFirst(E element)
         * Purpose    : Inserts the specified element at the front of the deque.
         * Return Type: boolean
         * Returns    : true if the element is successfully inserted
         * Exceptions :
         *   NullPointerException - if the element is null
         */
        deque.offerFirst(10);

        System.out.println("Deque: " + deque);

        /*
         * peekFirst()
         * Purpose    : Retrieves, but does not remove, the first element.
         * Return Type: E (Integer)
         * Returns    : First element, or null if the deque is empty
         * Exceptions : None
         */
        Integer first = deque.peekFirst();
        System.out.println("First element: " + first);

        /*
         * peekLast()
         * Purpose    : Retrieves, but does not remove, the last element.
         * Return Type: E (Integer)
         * Returns    : Last element, or null if the deque is empty
         * Exceptions : None
         */
        Integer last = deque.peekLast();
        System.out.println("Last element: " + last);

        /*
         * pollFirst()
         * Purpose    : Retrieves and removes the first element.
         * Return Type: E (Integer)
         * Returns    : Removed first element, or null if the deque is empty
         * Exceptions : None
         */
        Integer removedFirst = deque.pollFirst();
        System.out.println("Removed first element: " + removedFirst);

        /*
         * pollLast()
         * Purpose    : Retrieves and removes the last element.
         * Return Type: E (Integer)
         * Returns    : Removed last element, or null if the deque is empty
         * Exceptions : None
         */
        Integer removedLast = deque.pollLast();
        System.out.println("Removed last element: " + removedLast);

        System.out.println("Final Deque: " + deque);
    }
}