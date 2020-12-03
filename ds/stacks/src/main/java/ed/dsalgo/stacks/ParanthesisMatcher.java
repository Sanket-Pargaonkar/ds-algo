package ed.dsalgo.stacks;

/**
 *@author Sanket Pargaonkar
 *@since 03-12-2020
 *@version 1.0
 */

import static java.lang.System.out;
import java.lang.IllegalArgumentException;

public class ParanthesisMatcher{
    private final String input;
    private final char SQ_OP = '[';
    private final char SQ_CL = ']';
    private final char ROU_OP = '(';
    private final char ROU_CL = ')'; 
    private final char CUR_OP = '{';
    private final char CUR_CL = '}';   
    private final String SQ_P= "[]";
    private final String ROU_P= "()";
    private final String CUR_P= "{}";    
    public ParanthesisMatcher(){
	input = "";
    }

    public ParanthesisMatcher(String s) throws IllegalArgumentException{
	if(!isStringValid(s)) throw new IllegalArgumentException("The input string contains characters other than \"){}[]\"");
	else if(s.length()%2 != 0)throw new IllegalArgumentException("The input string does not have even number of characters");
	input = s;
    }

    private boolean isStringValid(String s){
	boolean result = true;
	for(char c: s.toCharArray()){
	    if(!(c == SQ_OP ||
	       c == SQ_CL ||
	       c == ROU_OP ||
	       c == ROU_CL ||
	       c == CUR_OP ||
	       c == CUR_CL 	       
		 )){
		result =  false;
		break;
	    }
		
	}
	return result;
    }

    public boolean isMatch(){
	boolean result = true;
	//parse string into stack
	MyStack<Character> stack = parseString();
	//split stack
	MyStack<Character>[] stacks = splitStackInHalf(stack);
	//match the two stacks
	if(stacks == null)
	    return result = false;
        MyStack stack1 = stacks[0];
        MyStack stack2 = stacks[1];
	try{
	    if(stack1.getLength()!= 0 & stack2.getLength()!= 0 & stack1.getLength() == stack2.getLength()
	       ){
		for(int i =0 ; i<stack1.getLength();i++){
		    String s = String.valueOf(stack1.pop())+String.valueOf(stack2.pop());
	            if(!(s.equals(SQ_P) ||
			 s.equals(ROU_P) ||
			 s.equals(CUR_P)
			 )){
			result =  false;
			break;
		    }
		    
		}
		     }else
		result = false;
	}catch(Exception e){
	    out.println(e.getMessage());
	    e.printStackTrace();
	}
		
	return result;
    }

    private MyStack<Character> parseString(){
	MyStack<Character> stack = new MyStack<Character>();
	for(char c : input.toCharArray())
	    stack.push(c);
	return stack;
    }

    private MyStack<Character>[] splitStackInHalf(MyStack stk){
	if(stk.getLength() == 0) return null;
	int center = stk.getLength()/2;
	MyStack<Character>[] result = new MyStack[2];
	MyStack<Character> stack2 = new MyStack<Character>();
	try{
	    for(int i = 0; i < center; i++){
		stack2.push((char)stk.pop());

	    }
	}catch(Exception e){
	    out.println(e.getMessage());
	    e.printStackTrace();
	}
	result[0] = stk;
	result[1] = stack2;  
	return result;
    }
    
}


