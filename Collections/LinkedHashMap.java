import java.util.LinkedHashMap;

class LinkedHashMapDemo {

    public static void main(String[] args) {

        // Creating a LinkedHashMap with Integer keys and String values
        // LinkedHashMap stores key-value pairs and maintains insertion order
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        /*
         * put(K key, V value)
         * Purpose    : Associates the specified value with the specified key.
         * Return Type: V (String)
         * Returns    : Previous value associated with the key,
         *              or null if the key had no mapping
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         *   IllegalArgumentException
         */
        map.put(2, "B");
        map.put(1, "A");
        map.put(3, "C");

        // LinkedHashMap maintains insertion order
        System.out.println("Map: " + map);

        /*
         * get(Object key)
         * Purpose    : Retrieves the value associated with the specified key.
         * Return Type: V (String)
         * Returns    : Corresponding value, or null if key is absent
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        String value = map.get(1);
        System.out.println("Value for key 1: " + value);

        /*
         * remove(Object key)
         * Purpose    : Removes the mapping for the specified key.
         * Return Type: V (String)
         * Returns    : Removed value, or null if the key was absent
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        String removedValue = map.remove(2);
        System.out.println("Removed value: " + removedValue);
    }
}