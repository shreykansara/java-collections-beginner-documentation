import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {

        // Creating an ArrayList of String objects
        ArrayList<String> languages = new ArrayList<>();

        /*
         * add(E element)
         * Purpose    : Appends the specified element to the end of the list.
         * Return Type: boolean
         * Returns    : true (always, for ArrayList)
         * Exceptions : None
         */
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        /*
         * add(int index, E element)
         * Purpose    : Inserts the specified element at the given index.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions : IndexOutOfBoundsException
         *              - if index < 0 or index > size()
         */
        languages.add(1, "JavaScript");

        /*
         * get(int index)
         * Purpose    : Retrieves the element present at the specified index.
         * Return Type: E (String in this case)
         * Returns    : Element stored at the given index
         * Exceptions : IndexOutOfBoundsException
         *              - if index < 0 or index >= size()
         */
        String element = languages.get(2);
        System.out.println("Element at index 2: " + element);

        /*
         * set(int index, E element)
         * Purpose    : Replaces the element at the specified index.
         * Return Type: E (String)
         * Returns    : Previous element at that index
         * Exceptions : IndexOutOfBoundsException
         *              - if index < 0 or index >= size()
         */
        String oldValue = languages.set(0, "C");
        System.out.println("Replaced \"" + oldValue + "\" with \"C\"");

        /*
         * remove(int index)
         * Purpose    : Removes the element at the specified index.
         * Return Type: E (String)
         * Returns    : The removed element
         * Exceptions : IndexOutOfBoundsException
         *              - if index < 0 or index >= size()
         */
        String removedValue = languages.remove(1);
        System.out.println("Removed: " + removedValue);

        /*
         * contains(Object obj)
         * Purpose    : Checks whether the specified element exists in the list.
         * Return Type: boolean
         * Returns    : true if element is found, false otherwise
         * Exceptions : None
         */
        boolean containsPython = languages.contains("Python");
        System.out.println("Contains Python? " + containsPython);

        /*
         * indexOf(Object obj)
         * Purpose    : Finds the index of the first occurrence of an element.
         * Return Type: int
         * Returns    : Index of the element, or -1 if not found
         * Exceptions : None
         */
        int index = languages.indexOf("Python");
        System.out.println("Index of Python: " + index);

        /*
         * size()
         * Purpose    : Returns the number of elements currently present.
         * Return Type: int
         * Returns    : Total number of elements in the list
         * Exceptions : None
         */
        int size = languages.size();
        System.out.println("Size of list: " + size);

        /*
         * clear()
         * Purpose    : Removes all elements from the list.
         * Return Type: void
         * Returns    : Nothing
         * Exceptions : None
         */
        languages.clear();

        System.out.println("List after clear(): " + languages);
    }
}