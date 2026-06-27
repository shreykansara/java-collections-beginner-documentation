public class StringBufferDemo {
    public static void main(String[] args) {

        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        /*
         * append(String str)
         * Purpose    : Appends the specified string to this character sequence.
         * Return Type: StringBuffer
         * Returns    : A reference to this object (thread-safe)
         * Exceptions : None
         */
        sb.append(" World");

        /*
         * insert(int offset, String str)
         * Purpose    : Inserts the string into this character sequence at the specified offset.
         * Return Type: StringBuffer
         * Returns    : A reference to this object
         * Exceptions : StringIndexOutOfBoundsException
         * - if the offset is invalid (offset < 0 or offset > length())
         */
        sb.insert(5, ",");

        System.out.println("After append and insert: " + sb);

        /*
         * charAt(int index)
         * Purpose    : Retrieves the character at the specified index.
         * Return Type: char
         * Returns    : The char value at the specified index
         * Exceptions : IndexOutOfBoundsException
         * - if index is negative or greater than or equal to length()
         */
        char firstChar = sb.charAt(0);
        System.out.println("First character: " + firstChar);

        /*
         * delete(int start, int end)
         * Purpose    : Removes the characters in a substring of this sequence.
         * The substring begins at 'start' and extends to 'end - 1'.
         * Return Type: StringBuffer
         * Returns    : A reference to this object
         * Exceptions : StringIndexOutOfBoundsException
         * - if start is negative, greater than length(), or greater than end
         */
        sb.delete(5, 6); // Removes the comma inserted earlier
        System.out.println("After deletion: " + sb);

        /*
         * reverse()
         * Purpose    : Causes this character sequence to be replaced by the reverse of the sequence.
         * Return Type: StringBuffer
         * Returns    : A reference to this object
         * Exceptions : None
         */
        sb.reverse();
        System.out.println("Reversed StringBuffer: " + sb);

        // Resetting for final output display
        sb.reverse();
        System.out.println("Final StringBuffer: " + sb);
    }
}