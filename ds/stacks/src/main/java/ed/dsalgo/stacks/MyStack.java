package ed.dsalgo.stacks;
import ed.CustomExceptions.MyStackEmptyException;
import java.util.ArrayList;
import static java.lang.System.out;
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
public class MyStack<T>{
    private int top;
    private int len;
    private final ArrayList<T> store;

    public MyStack( ){
	this.top = 0;
	this.len = 0;
	this.store = new ArrayList<T>();
    }

    public int getLength(){
	return len;
    }
    //insert
    public void push(T ele){
	store.add(ele);
	len++;
	top++;
    }
    //pop top
    public T pop() throws MyStackEmptyException{ 
	if(top == 0)throw new MyStackEmptyException();
	T result = store.get(len-1);
	store.remove(len-1);
	top--;
	len--;
	return result;
    }
    //Contains
    public boolean contains(T i){
	return store.contains(i);
    }
    //print
    public void print(){
	for(T i : store)out.println(i);
    }
}



