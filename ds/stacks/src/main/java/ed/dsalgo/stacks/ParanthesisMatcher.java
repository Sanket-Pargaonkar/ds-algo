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

    public ParanthesisMatcher(){
	input = "";
    }

    public ParanthesisMatcher(String s) throws IllegalArgumentException{
	if(!isStringValid(s)) throw new IllegalArgumentException("The input string contains characters other than \"){}[]\"");
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

    public boolean IsMatch(){
	boolean result = false;
	//parse string into stack
	
	//reverse stack

	//match the two stacks
	return result;
    }

}


