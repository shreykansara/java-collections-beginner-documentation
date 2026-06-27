import java.util.Hashtable;

class HashtableDemo {

    public static void main(String[] args) {

        // Creating a Hashtable with Integer keys and String values
        // Hashtable is synchronized and does not allow null keys or values
        Hashtable<Integer, String> table = new Hashtable<>();

        /*
         * put(K key, V value)
         * Purpose    : Associates the specified value with the specified key.
         * Return Type: V (String)
         * Returns    : Previous value associated with the key,
         *              or null if no mapping existed
         * Exceptions :
         *   NullPointerException   - if key or value is null
         *   ClassCastException     - if key/value type is incompatible
         *   IllegalArgumentException - if some property of key/value prevents insertion
         */
        table.put(1, "Java");
        table.put(2, "Python");

        /*
         * get(Object key)
         * Purpose    : Retrieves the value associated with the specified key.
         * Return Type: V (String)
         * Returns    : Corresponding value, or null if key is absent
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        String value = table.get(1);
        System.out.println("Value for key 1: " + value);

        /*
         * containsKey(Object key)
         * Purpose    : Checks whether the specified key exists.
         * Return Type: boolean
         * Returns    : true if the key is present, false otherwise
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        boolean hasKey = table.containsKey(2);
        System.out.println("Contains key 2? " + hasKey);

        /*
         * remove(Object key)
         * Purpose    : Removes the mapping for the specified key.
         * Return Type: V (String)
         * Returns    : Removed value, or null if key was absent
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        String removedValue = table.remove(2);
        System.out.println("Removed value: " + removedValue);
    }
}