package ed.dsalgo.stacks;

import static java.lang.System.out;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.lang.NullPointerException;
import java.lang.Exception;

public class TestMyStack{
    @Test
    public void ConstructorTest(){
	MyStack stack = null;
	try{
	    stack = new MyStack();
	}catch(Exception e){
	    out.println(e.getMessage());
	    }
	assertNotNull(stack, "Object Instantiated successfully");
    }
}

