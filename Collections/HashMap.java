import java.util.HashMap;
import java.util.Map;

class HashMapDemo {

    public static void main(String[] args) {

        // Creating a HashMap with Integer keys and String values
        // HashMap stores key-value pairs and does not maintain any order
        HashMap<Integer, String> languages = new HashMap<>();

        /*
         * put(K key, V value)
         * Purpose    : Associates the specified value with the specified key.
         * Return Type: V (String)
         * Returns    : Previous value associated with the key,
         *              or null if no mapping existed
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         *   IllegalArgumentException
         */
        languages.put(1, "Java");
        languages.put(2, "Python");

        /*
         * get(Object key)
         * Purpose    : Retrieves the value associated with the specified key.
         * Return Type: V (String)
         * Returns    : Corresponding value, or null if key is not found
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        String value = languages.get(1);
        System.out.println("Value for key 1: " + value);

        /*
         * containsKey(Object key)
         * Purpose    : Checks whether the specified key exists.
         * Return Type: boolean
         * Returns    : true if the key exists, false otherwise
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        boolean hasKey = languages.containsKey(2);
        System.out.println("Contains key 2? " + hasKey);

        /*
         * containsValue(Object value)
         * Purpose    : Checks whether the specified value exists.
         * Return Type: boolean
         * Returns    : true if the value exists, false otherwise
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        boolean hasValue = languages.containsValue("Python");
        System.out.println("Contains value \"Python\"? " + hasValue);

        /*
         * remove(Object key)
         * Purpose    : Removes the mapping for the specified key.
         * Return Type: V (String)
         * Returns    : Removed value, or null if key was absent
         * Exceptions :
         *   ClassCastException
         *   NullPointerException
         */
        String removedValue = languages.remove(2);
        System.out.println("Removed value: " + removedValue);

        /*
         * keySet()
         * Purpose    : Returns a Set view of all keys.
         * Return Type: Set<K>
         * Returns    : Set containing all keys
         * Exceptions : None
         */
        System.out.println("Keys: " + languages.keySet());

        /*
         * values()
         * Purpose    : Returns a Collection view of all values.
         * Return Type: Collection<V>
         * Returns    : Collection containing all values
         * Exceptions : None
         */
        System.out.println("Values: " + languages.values());

                /*
         * entrySet()
         * Purpose    : Returns a Set view of the mappings (key-value pairs).
         * Return Type: Set<Map.Entry<K, V>>
         * Returns    : Set containing all map entries
         * Exceptions : None
         */
        for (Map.Entry<Integer, String> entry : languages.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /*
         * forEach(BiConsumer<? super K, ? super V> action)
         * Purpose    : Performs the given action for each entry in this map.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions :
         *   NullPointerException
         */
        languages.forEach((key, val) -> System.out.println("Key: " + key + ", Value: " + val));

    }
}