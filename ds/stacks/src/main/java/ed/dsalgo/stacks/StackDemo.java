package ed.dsalgo.stacks;
/**
 *@author Sanket Pargaonakar
 *@version 1.0
 *@since  
 */


import static java.lang.System.out;
import ed.CustomExceptions.MyStackEmptyException;
public class StackDemo{
    public static void main(String[] args){
	out.println("hello");
	try{
	    MyStack stack = new MyStack();
	    stack.push(1);
	    stack.push(2);	
	    stack.push(3);
	    stack.push(5);
	    stack.printMyStack();
	    stack.pop();
	    stack.printMyStack();
	}catch(MyStackEmptyException e){
	    out.println(e.getMessage());
	}catch(Exception e){
	    out.println(e.getMessage());
	}
	
    }
}
