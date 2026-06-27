import java.util.PriorityQueue;

class PriorityQueueDemo {
    public static void main(String[] args) {

        // Creating a PriorityQueue of Integer objects
        // By default, elements are arranged in ascending order (min-heap)
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        /*
         * add(E element)
         * Purpose    : Inserts the specified element into the priority queue.
         * Return Type: boolean
         * Returns    : true (if the element is successfully inserted)
         * Exceptions :
         *   IllegalStateException - if the queue has capacity restrictions
         *   ClassCastException    - if the element cannot be compared
         *   NullPointerException  - if the element is null
         */
        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("Priority Queue: " + queue);

        /*
         * peek()
         * Purpose    : Retrieves, but does not remove, the head of the queue.
         * Return Type: E (Integer)
         * Returns    : Smallest element (head of the queue)
         *              null if the queue is empty
         * Exceptions : None
         */
        Integer head = queue.peek();
        System.out.println("Head element: " + head);

        /*
         * poll()
         * Purpose    : Retrieves and removes the head of the queue.
         * Return Type: E (Integer)
         * Returns    : Removed head element
         *              null if the queue is empty
         * Exceptions : None
         */
        Integer removed = queue.poll();
        System.out.println("Removed using poll(): " + removed);

        /*
         * remove()
         * Purpose    : Retrieves and removes the head of the queue.
         * Return Type: E (Integer)
         * Returns    : Removed head element
         * Exceptions :
         *   NoSuchElementException - if the queue is empty
         */
        Integer removedAgain = queue.remove();
        System.out.println("Removed using remove(): " + removedAgain);

        System.out.println("Final Queue: " + queue);
    }
}