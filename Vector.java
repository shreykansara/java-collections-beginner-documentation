import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {

        // Creating a Vector of Integer objects
        Vector<Integer> numbers = new Vector<>();

        /*
         * add(E element)
         * Purpose    : Appends the specified element to the end of the vector.
         * Return Type: boolean
         * Returns    : true (always, for Vector)
         * Exceptions : None
         */
        numbers.add(10);
        numbers.add(20);

        /*
         * insertElementAt(E element, int index)
         * Purpose    : Inserts the specified element at the given index.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions : ArrayIndexOutOfBoundsException
         *              - if index < 0 or index > size()
         */
        numbers.insertElementAt(15, 1);

        System.out.println("Vector: " + numbers);

        /*
         * firstElement()
         * Purpose    : Retrieves the first element of the vector.
         * Return Type: E (Integer)
         * Returns    : First element in the vector
         * Exceptions : NoSuchElementException
         *              - if the vector is empty
         */
        int first = numbers.firstElement();
        System.out.println("First element: " + first);

        /*
         * lastElement()
         * Purpose    : Retrieves the last element of the vector.
         * Return Type: E (Integer)
         * Returns    : Last element in the vector
         * Exceptions : NoSuchElementException
         *              - if the vector is empty
         */
        int last = numbers.lastElement();
        System.out.println("Last element: " + last);

        /*
         * removeElement(Object obj)
         * Purpose    : Removes the first occurrence of the specified element.
         * Return Type: boolean
         * Returns    : true if the element was found and removed,
         *              false otherwise
         * Exceptions : None
         */
        boolean removed = numbers.removeElement(15);
        System.out.println("Element 15 removed? " + removed);

        System.out.println("Final Vector: " + numbers);
    }
}