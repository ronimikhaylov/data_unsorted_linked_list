//import exceptionclasses.*;

/**
 * <p>Title: LinkedList.java</p>
 *
 * <p>Description: Represents a linked implementation of a list. The front of
 * the list is referenced by first and the back of the list is referenced by last. 
 * This class will be extended to create a specific kind of list.</p>
 *
 * @author Roni Mikhaylov
 */
public class LinkedList<E> implements ListADT<E>
{
	protected int count;
	protected Node<E> first, last;

	/**
	 * default constructor --
	 * Creates an empty list.
	 */
	public LinkedList()
	{
		count = 0;
		first = last = null;
	}

	/**
	 * size --
	 * returns a count of the number of items in the list.
	 * @return the number of items currently in the list
	 */
	public int size()
	{
		return count;
	}

	/**
	 * isEmpty --
	 * determines whether or not the list is empty.
	 * @return true if this list is empty; false otherwise
	 */
	public boolean isEmpty()
	{
		return count == 0;
	}

	/**
	 * first --
	 * returns a reference to the item at the front of the list. The item
	 * is not removed from the list.
	 * @return a reference to the first item in the list
	 * @throws EmptyListException if the list is empty
	 */
	public E first()
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		return first.getItem();
	}

	/**
	 * last -- 
	 * returns a reference to the item at the end of the list. The item
	 * is not removed from the list.
	 * @return a reference to the last item in the list
	 * @throws EmptyListException if the list is empty
	 */
	public E last()
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		return last.getItem();
	}

	/**
	 * contains --
	 * returns true if the list contains the specified target.
	 * @param target a reference to the item to be located
	 * @return true if the target is found; false otherwise
	 */
	public boolean contains (E target)
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		boolean found = false;

		Node<E> current = first;

		while (current != null && !found)
		{
			if (target.equals(current.getItem()))
				found = true;
			else
				current = current.getNext();
		}

		return found;
	}

	/**
	 * removeFirst -- 
	 * removes and returns the first item in the list.
	 * @return a reference to what was the first item in the list
	 * @throws EmptyListException if the list is empty
	 */
	public E removeFirst()

	{ 
		if (isEmpty()) {
			throw new EmptyListException("List is empty");
		} 
		Node<E> current;
		if (count == 1) {
			current = first;
			first = last = null;
			count--;
		}
		else {
			current = first;
			first = first.getNext();
			current.setNext(null);
			count--;
		}
		return current.getItem();
	}
	


	/**
	 * removeLast -- 
	 * removes and returns the last item in the list.
	 * @return the item removed from the end of the list
	 * @throws EmptyListException if the list is empty
	 */
	//THIS METHOD DOES NOT WORK AS EXPECTED
	public E removeLast()
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		Node<E> temp = first;
		Node<E> current = first;  
		Node<E> prev = null;		

		while (current.getNext() != null) 
		{
			prev = current; 
			current = current.getNext();
		} 
		prev.setNext(null); 
		last = prev;

		count--;
		return temp.getItem();
	}

	/**
	 * get --
	 * @param index the index of the item to be returned
	 * @return the item at the specified index
	 * @throws EmptyListException if the list is empty
	 * @throws IndexOutOfBoundsException if the index is out of range
	 */
	public E get(int index)
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		if (index < 0 || index >= count)
			throw new IndexOutOfBoundsException("Index out of range!");
		
		Node<E> current = first;
		for (int i = 0; i < index; i++)
			current = current.getNext();

		return current.getItem();
		
	}
	 
/**get -- 
 * locates the target from the list
 * @return target that was searched for
 * 
 */
public E get(E target) {
	if (isEmpty())
		throw new EmptyListException("List is empty!");
	Node<E> current = first;
	while (current != null) {
		if (target.equals(current.getItem())) {
			return current.getItem();
		}
		current = current.getNext();
	}
	return null;
}
/**
 * addFirst -- 
 * adds the specified item to the front of the list.
 * @param item the item to be added to the list
 */
public void addFirst(E item)
{
	Node<E> newNode = new Node<E>(item);

	if (isEmpty())
		first = last = newNode;
	else
	{
		newNode.setNext(first);
		first = newNode;
	}

	count++;
	}

	/**
	 * addLast -- 
	 * adds the specified item to the end of the list.
	 * @param item the item to be added to the list
	 */
	public void addLast(E item)
	{
		Node<E> newNode = new Node<E>(item);

		if (isEmpty())
			first = last = newNode;
		else
		{
			last.setNext(newNode);
			last = newNode;
		}

		count++;
	}

	/**
	 * remove --
	 * removes the first occurrence of the specified target from the list.
	 * @param target the item to be removed from the list
	 * @throws EmptyListException if the list is empty
	 * @throws ElementNotFoundException if the target is not found
	 */
	public void voidRemove(E target)
	{
		if (isEmpty())
			throw new EmptyListException("List is empty!");

		boolean found = false;
		Node<E> current = first;
		Node<E> previous = null;

		while (current != null && !found)
		{
			if (target.equals(current.getItem()))
				found = true;
			else
			{
				previous = current;
				current = current.getNext();
			}
		}

		if (!found)
			throw new ElementNotFoundException("List");

		if (size() == 1) //only one element in the list
			first = last = null;
		else if (current.equals(first)) //target is at the front of the list
			first = current.getNext();
		else if (current.equals(last)) //target is at the end of the list
		{
			last = previous;
			last.setNext(null);
		}
		else //target is in the middle of the list
			previous.setNext(current.getNext());

		count--;
	}


	/**
 	* remove --
 	* locates and removes the target from the list.
 	* @param target a reference to an initialized item containing data 
 	* in its key-field
 	* @return a reference to the removed item
 	* @throws EmptyListException if the list is empty
	* @throws ElementNotFoundException if the target is not found
	*/
	public E remove (E target){

	if (isEmpty())
		throw new EmptyListException("List is empty!");
	
	Node<E> current = first;
	Node<E> prev = null;
	boolean found = false;
	// REMOVE THE target FROM THE LIST
	while (current != null && !found) {
		if (target.equals(current.getItem())) {
			found = true;
		}
		else {
			prev = current;
			current = current.getNext();
		}
	}
	if (!found) {
		throw new ElementNotFoundException("List");
	}

	// return a reference to the removed item
	if (size() == 1) {
		first = last = null;
	}
	else if (current.equals(first)) {
		first = current.getNext();
	}
	else if (current.equals(last)) {
		last = prev;
		last.setNext(null);
	}
	else {
		prev.setNext(current.getNext());
	}
	count--;
	return current.getItem();


}
	
		

	// /**
	//  * removeDups --
	//  * locates the first occurrence of the target, then removes all other 
	//  * occurrences of target from the list.
	//  * @param target a reference to an initialized item containing data 
	//  * in its key-field
	//  * @throws EmptyListCollection if the list is empty
	//  * @throws ElementNotFoundException if the target is not found
	//  */
	// public void removeDups1(E target)
	// {
	// 	if (isEmpty())
	// 		throw new EmptyListException("Target is not found!");

	// 	Node<E> current = first;
	// 	Node<E> prev = null;
	// 	boolean found = false;
	// 	Node <E> prev2 = first;
	// 	boolean dupFound = false;

	// 	while (!found && current !=null) {
	// 		if (current.getItem().equals(target)) {
	// 			found = true;
	// 			prev2 = current;
	// 		}
	// 		else{
	// 			prev = current;
	// 			current = current.getNext();


	// 		}
	// 	}
	// 	if (found !=true) {
	// 		throw new ElementNotFoundException ("Target Element is not in this list");
	// 	}

	// 	if (current == first) {
	// 		current = current.getNext();

	// 		dupFound = true;
	// 		count--;
	// 	}
	// 	while (current != null) {
	

	// 		prev = current;

	// 		current = current.getNext();

	// 		if (current != null &&  current.getItem().equals(target) ) {
				
	// 			dupFound = true;
	// 			if (last.getItem().equals(target) && current == last) {
	// 				prev.setNext(null);
	// 				last = prev;
	// 			}
	// 			if (current == last) {
	// 				prev.setNext(null);
	// 				last = prev;
	// 				count --;
	// 			}
	// 			else {
	// 				while (current !=null && current.getItem().equals(target) ) {
	// 					current = current.getNext();
	// 					count--;

	// 				}

	// 				prev.setNext(current);
	// 				prev2 = prev;

	// 			}
	// 		}


	// 	}
	// 	if (current == null && last.getItem().equals(target)) {
	// 		last = prev2;
	// 		prev2.setNext(null);


	// 	}
	// 	if (dupFound == false) {
	// 		throw new ElementNotFoundException("There are no Duplicates in this list");
	// 	}



	// }
	
	/**
	 * removeDups2 - 
	 * handles a case where 3 or more dups are in the list 
	 * and are not adjacent to each other
	 * 
	 */
	public void removeDups2(E  target){
		if (isEmpty())
			throw new EmptyListException("Target is not found!");

		Node<E> current = first;
		Node<E> prev = null;
		boolean found = false;

		while (!found && current !=null) {
			if (current.getItem().equals(target)) {
				found = true;
			}
			else{
				prev = current;
				current = current.getNext();
			}
		}
		if (found !=true) {
			throw new ElementNotFoundException ("Target Element is not in this list");
		}
		
		found = false;
		if (prev == null)
		{
			prev = first;
		}
		while (current.getNext() != null)
		{
			if(prev != null && prev.getNext() == current)
			{
				prev = prev.getNext();
			}
			current = current.getNext();
			if(current != null && current.getItem().equals(target))
			{
				if(current == last)
				{
					prev.setNext(null);
					last = prev;
				}
				else
				{
					prev.setNext(current.getNext());
				}
				count--;
				found = true;
			}
		}
		if(!found)
		{
			throw new ElementNotFoundException("Duplicates not found");
		}
	}

	
	
	/**
	 * adds a Node to the linked list
	 * @param item
	 */
	public void add(E item)
	{
		Node<E> newNode = new Node<E>(item);
		if (isEmpty())
		{
			first = newNode;
			last = newNode;
		}
		else
		{
			last.setNext(newNode);
			last = newNode;
		}
		count++;
	}

	 

	/**
	 * toString --
	 * returns a string representation of the list.
	 * @return a reference to a String containing the items in the list
	 */

	public String toString()
	{
		Node<E> current = first;
		String result = new String();

		while (current != null)
		{
			result = result + current.getItem().toString() + "\n";
			current = current.getNext();
		}

		return result;
	}

	

}