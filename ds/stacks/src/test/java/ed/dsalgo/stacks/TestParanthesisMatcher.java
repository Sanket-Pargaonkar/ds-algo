package ed.dsalgo.stacks;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class TestParanthesisMatcher{

    @Test
    public void TestEmptyConstructor(){
	ParanthesisMatcher pm = null;
	try{
	    pm = new ParanthesisMatcher();
	}catch(Exception e){
	    printExceptionInfo(e);
	}
	assertNotNull(pm);
    }

    @Test
    public void TestPramertizedConstructor1(){
	assertAll(() -> new ParanthesisMatcher("[{()}]"));
    }
    
    @Test
    public void TestPramertizedConstructor2(){
	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("asdfa"));
	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("asdfa"), "The input string contains characters other than \"){}[]\"");
    }

    @Test
    public void TestPramertizedConstructorThrows1(){
	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("[]][())"));
	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("asdfa"), "The input string does not have even number of characters");
    }

    @Test
    public void TestIsMatch1(){
	ParanthesisMatcher pm = new ParanthesisMatcher("[({})]");
	assertTrue(pm.isMatch());
    }

    @Test
    public void TestIsMatch2(){
	ParanthesisMatcher pm = new ParanthesisMatcher("[{(})]");
	assertFalse(pm.isMatch());
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
