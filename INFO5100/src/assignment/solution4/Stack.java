package assignment.solution4;

/*
	Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
	(push): method for adding items to stack, the push operation adds items to the top of the list
	(pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list, and returns its value to the caller.
	In the case of overflow the user should be informed with a message
	In the case of underflow, the user should be informed with a message & a value of zero is returned.
	
	Assumptions: The stack will hold up to 10 integer values.
*/
public class Stack {
	private int size;
	private Object[] stack;

	public Stack(int length){
		if(length<=10&&length>=1)
			this.stack = new Object[length];
		else
			System.out.println("The stack will hold up to 10 integer values");
	}


	
	public void expand(){
		Object[] temp = new Object[size*2];  
        for (int i = 0; i < size; i++) {  
            temp[i] = stack[i];  
            stack[i] = null;  
        }  
        stack = temp; 
	}
	
	
	public void push(Object input){
		size++;
		if(size >= 10){
			System.out.println("The stack will hold up to 10 integer values, push failure");
			return;
		}else if(size >= stack.length){
			expand();
		}
		stack[size - 1] = input;
	}
	

	public Object pop(){
		if(size!=0){
			System.out.println("The stack is empty now, pop failure");
			return null;
		}
		
		Object pop = stack[--size];
		stack[size] = null;
		return pop;
	}
	
}