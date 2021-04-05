public class DLListWithOutput<E> extends DLList<E>
{
	// ------ no data - DLList's head and tail should be proteced!

	// ------ constructors
	public      DLListWithOutput()
	{
		super();
	}

	// ------- methods
	//toString - returns its representation as a String
	public String toString()
	{
		String answer;
		//if the size not 0, indent 9 spaces to make room for the "(null)<--" that backwards will print
		if (size() != 0)
			answer = "         ";
		else
			answer = "";

		DLLNode cursor = head;
		while (cursor != null)
		{
			answer = answer + cursor.data + "-->";
			cursor = cursor.next;
		}

		answer = answer + "(null)";
		return answer;
	}

	//backwards - this will traverse the list like toString, only "backwards".
	public String backwards()
	{
		String answer = "";
		DLLNode cursor = tail;
		while (cursor != null)
		{
			answer = "<--" + cursor.data + answer;
			cursor = cursor.prev;
		}

		answer = "(null)" + answer;
		return answer;
	}
}