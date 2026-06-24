import java.util.TreeMap;

class TreeMapDemo {

    public static void main(String[] args) {

        // Creating a TreeMap with Integer keys and String values
        // TreeMap stores key-value pairs in ascending order of keys
        TreeMap<Integer, String> map = new TreeMap<>();

        /*
         * put(K key, V value)
         * Purpose    : Associates the specified value with the specified key.
         * Return Type: V (String)
         * Returns    : Previous value associated with the key,
         *              or null if no mapping existed
         * Exceptions :
         *   ClassCastException - if keys cannot be compared
         *   NullPointerException - if key is null and natural ordering is used
         */
        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println("TreeMap: " + map);

        /*
         * firstKey()
         * Purpose    : Retrieves the smallest key in the map.
         * Return Type: K (Integer)
         * Returns    : The lowest key
         * Exceptions :
         *   NoSuchElementException - if the map is empty
         */
        Integer first = map.firstKey();
        System.out.println("First key: " + first);

        /*
         * lastKey()
         * Purpose    : Retrieves the largest key in the map.
         * Return Type: K (Integer)
         * Returns    : The highest key
         * Exceptions :
         *   NoSuchElementException - if the map is empty
         */
        Integer last = map.lastKey();
        System.out.println("Last key: " + last);

        /*
         * higherKey(K key)
         * Purpose    : Returns the least key strictly greater than the given key.
         * Return Type: K (Integer)
         * Returns    : Next greater key, or null if none exists
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        Integer higher = map.higherKey(20);
        System.out.println("Key higher than 20: " + higher);

        /*
         * lowerKey(K key)
         * Purpose    : Returns the greatest key strictly less than the given key.
         * Return Type: K (Integer)
         * Returns    : Previous smaller key, or null if none exists
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        Integer lower = map.lowerKey(20);
        System.out.println("Key lower than 20: " + lower);
    }
}