package Lab2;

public class LinkedList {
	
	//Class variable declaration
	
	private ListNode firstNode;
	private ListNode lastNode;
	private String listName;
	private int size;
	
	/* First constructor of the LinkedList class */
	public LinkedList() {
		/* Initialize listName as “new list”, size as 0, firstNode 
		 * and lastNode are all null */
		listName = "new list";
		size = 0;
		firstNode = lastNode = null;
	}
	
	/**
	 * This method named size() returns the number of elements in 
	 * this linked list
	 * @return an integer representing the number of elements that 
	 * are in this linked list */
	
	public int size(){
		return size;
	}
	
	/**
	 * This method named isEmpty() determines if the linked list is 
	 * empty
	 * @return true if the linked list is empty and return false 
	 * otherwise
	 */
	
	public boolean isEmpty(){
		if(size == 0)
			return true;
		else
			return false;
	}
	
	/**
	 * Method: insertAtHead
	 * This method insert an object at front of the linked list
	 * Algorithm:
	 * 	 if the list is empty then
	 * 		the first node and the last node point to the same new node
	 * 		Note: When using ListNode constructor, please use the 
	 * 		constructor with one parameter
	 * 	 else
	 * 		first node point to the new node.
	 * 		Note: When using ListNode constructor, please use the 
	 * 		constructor with two parameters
	 *   increase the size of the list by 1
	 * @param item
	 * 		item: the new object being inserted
	 */
	
	public void insertAtHead(Object item){
		
		if(isEmpty()){
			ListNode newNode = new ListNode(item);
			firstNode = lastNode = newNode;
		}
		else{
			ListNode newNode = new ListNode(item, firstNode);
			firstNode = newNode;
		}
		
		size++;
	}
	
	/**
	 * Method: insertAtTail
	 * This method insert an object at the back of the linked list
	 * Algorithm:
	 *   if the list is empty then	
	 *			the first node and the last node point to the same new 
	 *			node
	 * 			Note: When using ListNode constructor, please use the 
	 * 			constructor with one parameter
	 * 	 else
	 * 			last node point to the new node and new node become 
	 * 			last node
	 * 			Note: When using ListNode constructor, please use 
	 * 			the constructor with two parameters
	 *  increase the size of the list by 1
	 * @param item
	 */
	
	public void insertAtTail(Object item){
		ListNode newNode = new ListNode(item);
		
		if(isEmpty()){
			firstNode = lastNode = newNode;
		}
		else{
			lastNode.setNextNode(newNode);
			lastNode = newNode;
		}
		size++;
	}
	
	
	
	/**
	 * Method: removeFromHead
	 * This method is to remove a node from front of the list
	 * Algorithm:
	 *    if the list is empty then
	 *         throw EmptyListException
	 *    else
	 *    	   Get the data of the first node (which is deleted) and store it somewhere
	 *    	   if first node points to the last node then
	 *              first node and last node both point to null
	 *         else 
	 *              first node point to the next node (neigboring node of the first node)
	 *         decrease the size of the list by 1
	 *         return the object that contains the data of the old first node (been stored somewhere)         
	 * 
	 * @throws EmptyListException
	 */
	
	public Object removeFromHead() throws EmptyListException{
		
		if(isEmpty())
			throw new EmptyListException();
		else{
			Object tempData = firstNode.getData();
			if(firstNode == lastNode)
				firstNode = lastNode = null;
			else
				firstNode = firstNode.getNextNode();
				size--;
				return tempData;
		}
	}
	

	/**
	 * Method: removeFromTail
	 * This method removes the last element in the LinkedList
	 * Algorithm:
	 * 
	 *    if the list is empty then
	 *         throw EmptyListException
	 *    else
	 *    	  Store the data of the current last node somewhere
	 *        Starting from the first node of the linked list, go to the 
	 *        node before the last node of this list (hint: using a while loop)
	 * 		  update the reference of the last node so that it now points to the node right before it	
	 * 		  set the next node of the new last node to null
	 * 		  decrease the size of the list by 1
	 * 		  Return the data of the old last node (being stored somewhere)
	 * 
	 */
	
	public Object removeFromTail() throws EmptyListException{
		
		if(isEmpty())
			throw new EmptyListException();
		else{
			Object tempData;
			if(firstNode == lastNode){
				tempData = lastNode.getData();
				firstNode = lastNode = null;
			}
			else{
				ListNode current = firstNode;
				while(current.getNextNode() != lastNode)
					current = current.getNextNode();
				tempData = lastNode.getData();
				lastNode = current;
				lastNode.setNextNode(null);
			}
			size--;
			return tempData;
		}
	}
	
	/**
	   Method: printList
	   This method prints the list content on the screen
*/
	
	public void printList(){
		ListNode current = firstNode;
		
		while(current != null){
			System.out.println(current.getData().toString());
			current = current.getNextNode();
		}
	}
	
	//Getters and Setters
	public ListNode getFirstNode() {
		return firstNode;
	}
	
	public ListNode getLastNode() {
		return lastNode;
	}

	public void setFirstNode(ListNode top) {
		firstNode = top;
	}
	public void setLastNode(ListNode last) {
		lastNode = last;
	}
	public int getSize() {
		return size;
	}

}
