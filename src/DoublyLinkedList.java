//Keller Han
//DoublyLinkedList class contains all the methods necessary to modify a double linked list and display its contents

public class DoublyLinkedList {
	
	//initialize variables
	private ListNode head;
	private ListNode current;
	private ListNode previous;

	//default constructor
	public DoublyLinkedList()
	{
		head = null;
		current = null;
		previous = null;
	}

	/*-------------------------------------------------------------
	|  Method: [showList()]
	|
	|  Purpose:  [This method, if called, will display the contents of the double linked list.]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [The contents of the list will be displayed.]
	|
	|  Parameters:
	|      	[N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void showListState()
	{
		ListNode position = head;
		int count = 0;
		System.out.println("The head is: " + head.data);
		System.out.println("Current is: " + current.data);
		System.out.println("The current list contains: ");
		while (position != null)
		{
			count++;
			System.out.println(position.data);
			position = position.link;
		}
		System.out.println("There are a total of " + count + " elements in the list.");
	}

	/*-------------------------------------------------------------
	|  Method: [length()]
	|
	|  Purpose:  [This method, if called, will display how many items are in the list.]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [The number of items in the list will be returned.]
	|
	|  Parameters:
	|      	[N/A]
	|
	|  Returns:  [int]
	*------------------------------------------------------------------*/
	
	public int length()
	{
		int count = 0;
		ListNode position = head;
		while (position != null)
		{
			count++;
			position = position.link;
		}
		return count;
	}

	/*-------------------------------------------------------------
	|  Method: [findInList(String target)]
	|
	|  Purpose:  [This method, if called, set current to the String target if target is found, else current will be set to null.]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [current will be set to target or null]
	|
	|  Parameters:
	|      	[N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public void findInList(String target)
	{
		boolean detected = false;
	    ListNode position = head;
	    while ((position != null) && !detected)
	    {
	    	String data = position.data;
	    	if (data.equals(target))
	    		current.data = data;
	        else
	            current.data = null;
	    	    detected = true;
	    }
	}

	/*-------------------------------------------------------------
	|  Method: [addANodeToStart(String newData]
	|
	|  Purpose:  [This method, if called, will add a node to the head]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [A new node will be at the head]
	|
	|  Parameters:
	|      	[String addData]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public void addANodeToStart(String newData)
	{
		head = new ListNode(newData, head);
		if ((current == head.link) && (current != null))
		previous = head;
	}

	/*-------------------------------------------------------------
	|  Method: [moreToIterate()]
	|
	|  Purpose:  [To determine if there are more items to iterate]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [returns true or false]
	|
	|  Parameters:
	|      	[N/A]
	|
	|  Returns:  [boolean]
	*------------------------------------------------------------------*/
	public boolean moreToIterate( )
	{
		return current != null;
	}
	
	/*-------------------------------------------------------------
	|  Method: [resetIteration()]
	|
	|  Purpose:  [To reset current to head]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [returns to the top of the list]
	|
	|  Parameters:
	|      	[N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public void resetIteration( )
	{
		current = head;
		previous = null;
	}

	/*-------------------------------------------------------------
	|  Method: [goToNext()]
	|
	|  Purpose:  [to set current to the next node]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [current will be set as the next node or error msg will pop up]
	|
	|  Parameters:
	|      	[N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public void goToNext( )
	{
		if (current != null)
		{
			previous = current;
			current = current.link;
		}
		else if (head != null)
		{
			System.out.println("Error. Can't itterate.");
			System.exit(0);
		}
		else
		{
			System.out.println("Error. The list is empty.");
			System.exit(0);
		}
	}

	/*-------------------------------------------------------------
	|  Method: [setDataAtCurrent(String newData)]
	|
	|  Purpose:  [To replace current data with new data]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [The data at the current node will be replaced with String newData]
	|
	|  Parameters:
	|      	[String newData]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public void setDataAtCurrent(String newData)
	{
		if (current != null)
		{
			current.data = newData;
		}
		else
		{
			System.out.println("Error. There is no data at the current node. ");
			System.exit(0);
		}
	}

	/*-------------------------------------------------------------
	|  Method: [insertNodeAfterCurrent(String newData)]
	|
	|  Purpose:  [To add data after current node]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [String newData will be added after current node]
	|
	|  Parameters:
	|      	[String newData]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public void insertNodeAfterCurrent(String newData)
	{
		ListNode newNode = new ListNode( );
		newNode.data = newData;
		if (current != null)
		{
			newNode.link = current.link;
			current.link = newNode;
		}
		else if (head != null)
		{
			System.out.println("Error. Can't itterate. ");
			System.exit(0);
		}
		else
		{
			System.out.println("Error. The list is empty. ");
			System.exit(0);
		}
	}

	/*-------------------------------------------------------------
	|  Method: [deleteCurrentNode()]
	|
	|  Purpose:  [To delete the current node]
	|
	|  Pre-condition:  [Nodes must be defined]
	|
	|  Post-condition: [The current node will be deleted or error msg will pop up]
	|
	|  Parameters:
	|      	[N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public void deleteCurrentNode()
	{
		if ((current != null) && (previous != null))
		{
			previous.link = current.link;
			current = current.link;
		}
		else if ((current != null) && (previous == null))
		{ 
			head = current.link;
			current = head;
		}
		else 
		{
			System.out.println("Error. No node at current." );
			System.exit(0);
		}
	}
	
	//node class as inner class
	private class ListNode
	{
		//initialize variables
		private String data;
		private ListNode link;
	      
		//default constructor
		public ListNode()
		{
			link = null;
			data = null;
		}
	     
		//constructor with passed parameters
		public ListNode(String newData, ListNode linkValue)
		{
			data = newData;
			link = linkValue;
		}
	}
}
	

