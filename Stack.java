/*
 * Name: Jacob Bindl
 * Course: Data Structures
 * Class: uses the LinkedList class to create a stack frame
 * Date: 2/7/16
 */
package Lab2;

public class Stack {
		
		//Data member
		private LinkedList stack;
		
		//default constructor
		public Stack (){
			stack = new LinkedList();
		}//end Stack constructor
		
		//push method to add to stack
		public void push(Object item){
			stack.insertAtHead(item);
		}//end push method
		
		//pop method to remove from stack
		public Object pop(){
			return stack.removeFromHead();
		}//end pop method
		
		//return top of stack without removing it
		public Object peek(){
			Object item = pop();
			push(item);
			return item;
		}//end peek method
		
		//isEmpty: this method returns true if the stack is empty, else false
		public boolean isEmpty(){
			return stack.isEmpty();
		}//end isEmpty method
		
		//getSize: this method return the size of the stack
		public int getSize(){
			return stack.size();
		}
		
		//printStack method
		public void printStack(){
			stack.printList();
		}//end printStack method
}
