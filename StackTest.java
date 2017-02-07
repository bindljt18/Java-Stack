/*
 * Name: Jacob Bindl
 * Course: Data Structures
 * Class: Driver for Stack class
 * Date: 2/7/16
 */
package Lab2;

public class StackTest {

	public static void main(String [] args){
		Stack aStack = new Stack();
		aStack.push(1);
		aStack.push(2);
		aStack.push(3);
		aStack.push(5);
		System.out.println("Original Stack:");
		aStack.printStack();
		Integer topValue = (Integer) aStack.pop();
		System.out.println("Pop this value from stack: " + topValue);
		System.out.println("Stack after single pop: ");
		aStack.printStack();
		System.out.println("Current size of stack: " + aStack.getSize());
		System.out.println("Current value at top of the stack is: " + aStack.peek());
		
		/*
		Original Stack:
			5
			3
			2
			1
			Pop this value from stack: 5
			Stack after single pop: 
			3
			2
			1
			Current size of stack: 3
			Current value at top of the stack is: 3
		*/
	}
}
