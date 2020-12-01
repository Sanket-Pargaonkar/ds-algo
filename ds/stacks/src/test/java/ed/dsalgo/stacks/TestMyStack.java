package ed.dsalgo.stacks;

import static java.lang.System.out;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.lang.NullPointerException;
import java.lang.Exception;

public class TestMyStack{
    @Test
    public void ConstructorTest(){
	MyStack stack = null;
	try{
	    stack = new MyStack();
	}catch(Exception e){
	    printExceptionInfo(e);
	    }
	assertNotNull(stack, "Object Instantiated successfully");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,2,3,2,2,3})    
    public void StackInputTest(int input){
	MyStack stack = null;
	try{
	    stack = new MyStack();
	    stack.push(input);
	    assertEquals(stack.getLength(), 1);
	}catch(Exception e){
	    printExceptionInfo(e);
	}
    }

    @Test
    public void StackPopTest(){
	MyStack stack = null;
	try{
	    stack = new MyStack();
	    stack.push(1);
	    assertEquals(stack.getLength(), 1);
	    stack.pop();
	    assertEquals(stack.getLength(), 0);
	}catch(Exception e){
	    printExceptionInfo(e);
	}

    }


    private void printExceptionInfo(Exception ex){
	try{
	    out.println("Exception Occured: "+ex.toString());
	    out.println("Message: "+ex.getMessage());
		ex.printStackTrace();
	}catch(Exception e){
	    out.println("Exception Occured: "+e.toString());
	    out.println("Message: "+e.getMessage());
		e.printStackTrace();
	}
    }
    

    
}

