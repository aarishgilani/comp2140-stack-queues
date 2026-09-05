interface Stack<T> {
    /**
     * Pushes an element onto the stack.
     * 
     * @param element
     * 
     * @throws NullPointerException if the element is null
     */
    void push(T element);

    /**
     * Pops an element from the stack.
     * 
     * @return the element at the top of the stack
     * 
     * @throws EmptyStackException if the stack is empty
     */
    T pop();

    /**
     * Returns the element at the top of the stack without removing it.
     * 
     * @return the element at the top of the stack
     * 
     * @throws EmptyStackException if the stack is empty
     */
    T peek();

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise
     * 
     */
    boolean isEmpty();
}