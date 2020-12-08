package ed.dsalgo.stacks;

/**
 *@atuthor Sanke Parganokar
 *@version 1.0
 *@since 07-12-2020
 */

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.Assertions.assertAll;
import org.junit.jupiter.api.Test;

public class TestPatternMatcher132{

    private PatternMatcher132 pm132;
    
    @Test
    public void initTest(){
	PatternMatcher132 pm132 = new PatternMatcher132();
	assertNotNull(pm132);
    }

    @Test
    public void testGet132Pattern1(){
	final int[] input = {2,3,5,4,6,5,67,454,54,6};
	this.pm132 = new PatternMatcher132(input);
	int[] result = pm132.Get132Pattern1();
	assertNotNull(result);
	for(int i : result)out.println(i);
    }
    
}

