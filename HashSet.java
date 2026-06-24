import java.util.HashSet;

class HashSetDemo {
    public static void main(String[] args) {

        // Creating a HashSet of Integer objects
        // HashSet stores only unique elements and does not maintain insertion order
        HashSet<Integer> numbers = new HashSet<>();

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
        numbers.add(10);
        numbers.add(20);
        numbers.add(20); // Duplicate; ignored

        System.out.println("HashSet: " + numbers);

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
        boolean exists = numbers.contains(10);
        System.out.println("Contains 10? " + exists);

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
        boolean removed = numbers.remove(20);
        System.out.println("20 removed? " + removed);

        /*
         * size()
         * Purpose    : Returns the number of elements in the set.
         * Return Type: int
         * Returns    : Total number of elements present
         * Exceptions : None
         */
        int size = numbers.size();
        System.out.println("Size of set: " + size);
    }
}