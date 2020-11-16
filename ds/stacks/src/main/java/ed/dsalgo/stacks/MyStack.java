package ed.dsalgo.stacks;
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
    private len;
    private final ArrayList<int> store;

    public MyStack(){
	this.top = 0;
	this.len = 0;
	store = new ArrayList<int>();
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
	if(top == 0)throw MyStackEmptyException();

    }
    
    
    
}



