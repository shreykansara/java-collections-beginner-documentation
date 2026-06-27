import java.util.TreeSet;

class TreeSetDemo {

    public static void main(String[] args) {

        // Creating a TreeSet of Integer objects
        // TreeSet stores unique elements in sorted (ascending) order
        TreeSet<Integer> numbers = new TreeSet<>();

        /*
         * add(E element)
         * Purpose    : Adds the specified element to the set if it is not already present.
         * Return Type: boolean
         * Returns    : true if the element was inserted,
         *              false if it was already present (duplicate)
         * Exceptions :
         *   ClassCastException   - if elements cannot be compared
         *   NullPointerException - if the element is null
         */
        numbers.add(40);
        numbers.add(10);
        numbers.add(20);

        System.out.println("TreeSet: " + numbers);

        /*
         * first()
         * Purpose    : Retrieves the smallest element in the set.
         * Return Type: E (Integer)
         * Returns    : The first (lowest) element
         * Exceptions :
         *   NoSuchElementException - if the set is empty
         */
        Integer first = numbers.first();
        System.out.println("First element: " + first);

        /*
         * last()
         * Purpose    : Retrieves the largest element in the set.
         * Return Type: E (Integer)
         * Returns    : The last (highest) element
         * Exceptions :
         *   NoSuchElementException - if the set is empty
         */
        Integer last = numbers.last();
        System.out.println("Last element: " + last);

        /*
         * higher(E element)
         * Purpose    : Returns the least element strictly greater than the given element.
         * Return Type: E (Integer)
         * Returns    : Next greater element, or null if none exists
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        Integer higher = numbers.higher(20);
        System.out.println("Element higher than 20: " + higher);

        /*
         * lower(E element)
         * Purpose    : Returns the greatest element strictly less than the given element.
         * Return Type: E (Integer)
         * Returns    : Previous smaller element, or null if none exists
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        Integer lower = numbers.lower(20);
        System.out.println("Element lower than 20: " + lower);
    }
}