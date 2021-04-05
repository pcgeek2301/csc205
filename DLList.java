//This class implements a Singly Linked List

import java.util.*;

public class DLList<E> {
	//------- data
	protected DLLNode<E> head;
	protected DLLNode<E> tail;

	//------- constructors
	public     DLList() {
		head = tail = null;
	}

	//------- methods
	//addFirst - adds an element to the front of the list
	public void addFirst(E theData) {
		//create a new DLLNode to hold theData
		DLLNode<E> temp = new DLLNode<E>(theData);

		if (head == null)   //is the list empty?
			head = tail = temp;
		else {   //list is not empty
			temp.next = head;
			temp.prev = null;
			head.prev = temp;
			head = temp;
		}
	}

	//addLast - adds an element to the end of the list
	public void addLast(E theData) {
		//create a new SLLNode to hold theData
		DLLNode<E> temp = new DLLNode<E>(theData);

		if (head == null)   //is the list empty?
			head = tail = temp;
		else {  //list is not empty
			temp.prev = tail;
			tail.next = temp;
			tail = temp;
		}
	}

	//removeFirst - removes and returns the first element
	public E removeFirst() {
		//case1: list is empty
		if (head == null)
			throw new NoSuchElementException("can't removeFirst from empty list!");

		//case2: list has 1 element
		else if (head == tail) {
			E savedData = head.data;
			head = tail = null;
			return savedData;
		}

		//case3: list has many elements
		else {
			E savedData = head.data;
			head = head.next;
			head.prev = null;
			return savedData;
		}
	}

	//removeLast - removes and returns the last element
	public E removeLast() {
		//case1: list is empty
		if (head == null)
			throw new NoSuchElementException("can't removeLast from empty list!");

		//case2: list has 1 element
		else if (head == tail) {
			E savedData = tail.data;
			head = tail = null;
			return savedData;
		}

		//case3: list has many elements
		else {
			E savedData = tail.data;
			tail = tail.prev;
			tail.next = null;
			return savedData;
			
		}

	}

	//contains - returns true if the list contains what is received
	public boolean contains(Object obj) {
		//traverse the list, seeing if any node has data that .equals obj
		DLLNode<E> cursor = head;
		while (cursor != null) {
			if (cursor.data.equals(obj))    //found it!
				return true;                //so return
			cursor = cursor.next;
		}

		return false;   //if we finished the loop and got to here, it was not found
}

	//remove - removes what is received from the list.  Returns true if it
	//                was actually found and removed
	public boolean remove(Object obj) {
		if (!this.contains(obj)) //return false if it is not contained (can't remove it)
			return false;

		//if we get to here, we know that the list contains obj somewhere
		//change the links and return true at the end.
		else if (head.data.equals(obj)) {   //is it at the front?   If so, remove it
			this.removeFirst();
			return true;
		}

		else {   //not at front, so traverse the list to find the one to be deleted (know its there)
			DLLNode<E> doomed = head;
			while (!doomed.data.equals(obj))
				doomed = doomed.next;

			//now that it is found, we also need to find the node in front of it
			DLLNode<E> inFront = head;
			while (inFront.next != doomed)
				inFront = inFront.next;

			//now we have a pointer to the node to be deleted and the one in front
			               //draw it out to see how links must change...
			inFront.next = doomed.next;
			if (doomed.next != null)
			doomed.next.prev = inFront;

			//also...if the one that was deleted was the tail, we must reset the tail
			if (doomed == tail)
				tail = inFront;
		}

		return true;   //found it; links have been changed

}

	//add - inserts what is received at the given index
	public void add(int index, E elt) {
		if (index < 0 || index > size())    //check if index is out of bounds
			throw new IllegalArgumentException("illegal index: " + index);

		//if we are adding at the front or the back, use existing methods
		if (index == 0)
			addFirst(elt);

		else if (index == size())
			addLast(elt);

		else    //if we get to here, it will go in the middle somewhere
		{
			// 1. create a new node to hold it
			DLLNode<E> temp = new DLLNode<E>(elt);

			// 2. traverse the list to find where it goes
			//     when we traverse, we will stop at the node IN FRONT OF where it goes
			DLLNode<E> cursor = head;
			for (int i=1; i<index; i++)
				cursor = cursor.next;

			// 3. cursor should have stopped at the node IN FRONT
			//    if where the new node goes.  Change the links so
			//    it is part of the list.  draw it out so see how
			//    the links change...
			temp.next = cursor.next;
			temp.prev = cursor;
			cursor.next.prev = temp;
			cursor.next = temp;
		}
	}

	//getFirst - returns the data from the head
	public E getFirst() {
		if (head == null)
			throw new NoSuchElementException("can't getFirst from empty list");
		return head.data;
	}

	//getLast - returns the data from the tail
	public E getLast() {
		if (head == null)
			throw new NoSuchElementException("can't getLast from empty list");
		return tail.data;
	}

	//isEmpty - returns true if the list is empty
	public boolean isEmpty() {
		return head == null;
	}

	//size - returns its size
	public int size() {
		int theSize = 0;
		DLLNode<E> cursor = head;

		while (cursor != null) { //traverse the list, counting the elements
			theSize++;
			cursor = cursor.next;
		}

		return theSize;
	}

	//toString - returns its representation as a String
	public String toString() {
		String answer = "";
        DLLNode<E> cursor = head;
        while (cursor != null) { //traverse the list, building up a String
			answer = answer + cursor.data + "--->";
			cursor = cursor.next;
		}

		answer = answer + "(null)";  //the last node points to "(null)"

		return answer;
	}

	//------- "inner classes"
	//==============================
	class DLLNode<E> {
		//------- data
		protected E data;
		protected DLLNode<E> next;
		protected DLLNode<E> prev;

		//------- constructors
		public DLLNode(E theData) {
			this.data = theData;
			next = null;
			prev = null;
		}

		//------- methods
		public String toString() {
			return this.data.toString();
		}
	}	 //end of DLLNode

}   //end of DLList
