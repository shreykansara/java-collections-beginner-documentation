class StringDemo {
    public static void main(String[] args) {

        // Creating a String object
        String message = "Hello, World!";

        /*
         * length()
         * Purpose    : Returns the length of the string (number of characters).
         * Return Type: int
         * Returns    : The number of Unicode characters in the string
         * Exceptions : None
         */
        int len = message.length();
        System.out.println("Length of string: " + len);

        /*
         * charAt(int index)
         * Purpose    : Retrieves the character at the specified index.
         * Return Type: char
         * Returns    : The char value at the specified index of this string
         * Exceptions : IndexOutOfBoundsException 
         * - if index is negative or not less than length()
         */
        char firstChar = message.charAt(0);
        System.out.println("Character at index 0: " + firstChar);

        /*
         * substring(int beginIndex, int endIndex)
         * Purpose    : Returns a new string that is a substring of this string.
         * The substring begins at beginIndex and extends to endIndex - 1.
         * Return Type: String
         * Returns    : The specified substring
         * Exceptions : IndexOutOfBoundsException 
         * - if beginIndex is negative, endIndex is larger than 
         * length(), or beginIndex is larger than endIndex.
         */
        String sub = message.substring(7, 12);
        System.out.println("Substring (7 to 12): " + sub);

        /*
         * contains(CharSequence s)
         * Purpose    : Checks if the string contains the specified sequence of char values.
         * Return Type: boolean
         * Returns    : true if this string contains 's', false otherwise
         * Exceptions : NullPointerException 
         * - if s is null
         */
        boolean hasWorld = message.contains("World");
        System.out.println("Contains 'World'? " + hasWorld);

        /*
         * replace(CharSequence target, CharSequence replacement)
         * Purpose    : Replaces each substring of this string that matches the literal 
         * target sequence with the specified literal replacement sequence.
         * Return Type: String
         * Returns    : The resulting string
         * Exceptions : NullPointerException 
         * - if target or replacement is null
         */
        String updatedMessage = message.replace("World", "Java");
        System.out.println("Replaced String: " + updatedMessage);
        
        System.out.println("Original Vector/String unaltered: " + message);
    }
}