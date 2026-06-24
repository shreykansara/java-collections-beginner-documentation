import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {

        // Creating a LinkedList of Integer objects
        LinkedList<Integer> numbers = new LinkedList<>();

        /*
         * addFirst(E element)
         * Purpose    : Inserts the specified element at the beginning of the list.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions : None
         */
        numbers.addFirst(10);

        /*
         * addLast(E element)
         * Purpose    : Appends the specified element to the end of the list.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions : None
         */
        numbers.addLast(30);

        /*
         * add(E element)
         * Purpose    : Appends the specified element to the end of the list.
         * Return Type: boolean
         * Returns    : true (always, for LinkedList)
         * Exceptions : None
         */
        numbers.add(20);

        System.out.println("List: " + numbers);

        /*
         * getFirst()
         * Purpose    : Retrieves the first element without removing it.
         * Return Type: E (Integer)
         * Returns    : First element in the list
         * Exceptions : NoSuchElementException
         *              - if the list is empty
         */
        int first = numbers.getFirst();
        System.out.println("First element: " + first);

        /*
         * getLast()
         * Purpose    : Retrieves the last element without removing it.
         * Return Type: E (Integer)
         * Returns    : Last element in the list
         * Exceptions : NoSuchElementException
         *              - if the list is empty
         */
        int last = numbers.getLast();
        System.out.println("Last element: " + last);

        /*
         * removeFirst()
         * Purpose    : Removes and returns the first element of the list.
         * Return Type: E (Integer)
         * Returns    : Removed first element
         * Exceptions : NoSuchElementException
         *              - if the list is empty
         */
        int removedFirst = numbers.removeFirst();
        System.out.println("Removed first element: " + removedFirst);

        /*
         * removeLast()
         * Purpose    : Removes and returns the last element of the list.
         * Return Type: E (Integer)
         * Returns    : Removed last element
         * Exceptions : NoSuchElementException
         *              - if the list is empty
         */
        int removedLast = numbers.removeLast();
        System.out.println("Removed last element: " + removedLast);

        System.out.println("Final List: " + numbers);
    }
}