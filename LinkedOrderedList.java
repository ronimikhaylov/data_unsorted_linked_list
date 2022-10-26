//import exceptionclasses.*;

/**
 * <p>Title: LinkedOrderedList.java</p>
 *
 * <p>Description: Represents a linked implementation of an ordered list. The front of
 * the list is referenced by first and the back of the list is referenced by last. 
 * This class will be extended to create a specific kind of list.</p>
 *
 * @author Roni Mikhaylov
 */
// 
public class LinkedOrderedList <E>   {
    protected int count; // list size
    protected Node<E> first; // ref to first element
    protected Node<E> last; // ref to last element

    /**
     * Creates an empty list.
     */
    public LinkedOrderedList() {
        count = 0;
        first = null;
        last = null;
    }
    // compare the item calling the function and the parameter item
    // return true if the item calling the function is greater than the parameter item
    // return false if the item calling the function is less than the parameter item
    public boolean greaterThan(E item1, E item2) {
        return ((String) item1).compareTo((String)item2) > 0;
    }

    /**
     * Returns the first element in this list.
     *
     * @return the first element in the list
     * @throws EmptyCollectionException if the list is empty
     */
    public E first() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException("list");
        return first.getItem();
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the integer representation of number of elements in this list
     */
    public int size() {
        return count;
    }

    /**
     * Returns a string representation of this list.
     *
     * @return the string representation of this list
     */
    public String toString() {
        String result = "";
        Node<E> current = first;
        while (current != null) {   
            result += (current.getItem()).toString() + "";   
            current = current.getNext();

        }
        return result;
    }

    /**
     * Adds the specified element to this list at the proper location.
     * using the insertion sort algorithm to sort the list
     *
     * @param element the element to be added to this list
     */
    public void add(E element)   {
        Node<E> newNode = new Node<E>(element);
        Node<E> previous = null;
        Node<E> current = first;

        while (current != null && ((Comparable<E>)element).compareTo(current.getItem()) > 0) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null)
            first = newNode;
        else
            previous.setNext(newNode);

        newNode.setNext(current);

        count++;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws EmptyCollectionException if the list is empty
     */
    public E removeFirst() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException("list");

        E result = first.getItem();
        first = first.getNext();
        count--;

        return result;
    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     * @throws EmptyListException if the list is empty
     */

    
    public E removeLast() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException("list");

        E result = last.getItem();
        Node<E> previous = null;
        Node<E> current = first;

        while (current != null && current != last) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null)
            first = null;
        else
            previous.setNext(null);

        last = previous;
        count--;

        return result;

    }

    /**
     * Removes and returns the specified element from this list.
     *
     * @param element the element to be removed from the list
     * @return the removed element
     * @throws EmptyListException if the list is empty
     * @throws ElementNotFoundException if the target element is not found
     */

    public E remove(E element) throws EmptyListException, ElementNotFoundException {
        if (isEmpty())
            throw new EmptyListException("list");

        boolean found = false;
        Node<E> previous = null;
        Node<E> current = first;

        while (current != null && !found) {
            if (((Comparable <E>)element).compareTo(current.getItem()) == 0)
                found = true;
            else {
                previous = current;
                current = current.getNext();
            }
        }

        if (!found)
            throw new ElementNotFoundException("Element not found in list");

        if (size() == 1)
            first = last = null;
        else if (current == first)
            first = current.getNext();
        else if (current == last) {
            last = previous;
            last.setNext(null);
        } else
            previous.setNext(current.getNext());

        count--;

        return current.getItem();
    }

    /**
     * insert sort 
     * @param element
     * @throws EmptyListException
     */
    public void insertSort(E element) throws EmptyListException {
        Node<E> newNode = new Node<E>(element);
        Node<E> previous = null;
        Node<E> current = first;
        while (current != null && ((Comparable<E>)element).compareTo(current.getItem()) > 0) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null)
            first = newNode;
        else
            previous.setNext(newNode);

        newNode.setNext(current);

        count++;
    }

}
    
     