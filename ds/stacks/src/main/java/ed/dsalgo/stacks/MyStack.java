package ed.dsalgo.stacks;
import ed.CustomExceptions.MyStackEmptyException;
import java.util.ArrayList;
/**
 * @author Sanket Pargaonkar
 * @version 1.0
 * @since
 * This class is implementation of basic non generic stack. At any point of time we can
 * 1. get length of stack,
 * 2. Read, pop top most element
 * 3. push elements to the top
 * 4. clear the stack
 */
public class MyStack{
    private int top;
    private int len;
    private final ArrayList<Integer> store;

    public MyStack(){
	this.top = 0;
	this.len = 0;
	this.store = new ArrayList<Integer>();
    }

    public int getLength(){
	return len;
    }
    //insert
    public void push(int ele){
	store.add(ele);
	top++;
    }
    //pop top
    public int pop() throws MyStackEmptyException{
	if(top == 0)throw new MyStackEmptyException();
	else
	return len;
    }
    
    
    
}



