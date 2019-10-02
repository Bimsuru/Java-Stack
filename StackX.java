package exam;

public class StackX {

	private int maxSize; //maximum size of stackarray
	private int top; // define a top value
	
	private char[ ] stackArray; //create stack array
	
	//define constructor
	public StackX(int size){
		maxSize = size;
		stackArray = new char[maxSize];
		top = -1;
	}
	
	//push method
	public void push(char ch) {
		
		//check whether the stack is full
		if(top == maxSize - 1)
			System.out.println("Stack array is full");
		else 
			stackArray[top++] = ch;
	}
	//pop method
	public char pop() {
		
		//check whether the stack is empty
		if(top == -1)
		{
			System.out.println("Stack array is empty");
			return ' ';
		}
		
		else
			return stackArray[top--];
	}
	//peek method
	public char peek() {
		
		//check whether the stack is empty
		if(top == -1)
		{
			System.out.println("Stack array is empty");
			return ' ';
		}
		
		else
			return stackArray[top];
	}
	public boolean isEmpty() {
		//check whether the stack is empty
		return (top == -1);
	}
	public boolean isFull() {
		return (top == maxSize - 1);
	}

}
