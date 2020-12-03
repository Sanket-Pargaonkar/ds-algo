package ed.dsalgo.stacks;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
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
    public void TestPramertizedConstructor(){
	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("asdfa"));
	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("asdfa"), "The input string contains characters other than \"){}[]\"");
    }

    @Test
    public void TestPramertizedConstructorThrows(){

	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("asdfa"));
	assertThrows(IllegalArgumentException.class, () -> new ParanthesisMatcher("asdfa"), "The input string contains characters other than \"){}[]\"");

    }

    @Test
    public void TestIsMatch(){
	ParanthesisMatcher pm = new ParanthesisMatcher("[({})]");
	assertTrue(pm.isMatch());
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
