package ed.randomQtns;

/**
 *@author Sanket Pargaonkar
 *@since <2020-11-22 Sun 17:40>
 */


import static java.lang.System.out;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQtn1{
    @Test
    public void test1(){
	Qtn1 q = new Qtn1();
	out.println("test1 Begin:");
	out.println("input: \"1231\"");
	out.print("output:");q.Solution("1231");


	out.println("input: \"254331\"");
	out.print("output:");q.Solution("254331");

	out.println("test1 executed");
    }

}
