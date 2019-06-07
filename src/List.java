public interface List<E> {
    /** Appends the specified element to the end of the
     list */
    void add(E x);
    /** Replaces the element at the specified index with
     the specified element */
    void set(int index, E x);
    /** Returns the number of elements in this list. */
    int size();
}
