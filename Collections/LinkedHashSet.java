import java.util.LinkedHashSet;

class LinkedHashSetDemo {

    public static void main(String[] args) {

        // Creating a LinkedHashSet of Integer objects
        // LinkedHashSet stores unique elements and maintains insertion order
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        /*
         * add(E element)
         * Purpose    : Adds the specified element to the set if it is not already present.
         * Return Type: boolean
         * Returns    : true if the element was inserted,
         *              false if it was already present (duplicate)
         * Exceptions :
         *   ClassCastException       - if the element type is incompatible
         *   NullPointerException     - if null elements are not permitted
         *   IllegalArgumentException - if some property of the element prevents insertion
         */
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        // LinkedHashSet maintains insertion order
        System.out.println("LinkedHashSet: " + numbers);

        /*
         * remove(Object obj)
         * Purpose    : Removes the specified element from the set.
         * Return Type: boolean
         * Returns    : true if the element was found and removed,
         *              false otherwise
         * Exceptions :
         *   ClassCastException - if the object type is incompatible
         *   NullPointerException - if null is not permitted
         */
        boolean removed = numbers.remove(10);
        System.out.println("10 removed? " + removed);

        /*
         * contains(Object obj)
         * Purpose    : Checks whether the specified element exists in the set.
         * Return Type: boolean
         * Returns    : true if the element is present,
         *              false otherwise
         * Exceptions :
         *   ClassCastException - if the object type is incompatible
         *   NullPointerException - if null is not permitted
         */
        boolean exists = numbers.contains(30);
        System.out.println("Contains 30? " + exists);
    }
}