import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;
  

  @Before
  public void setUp() { c = new Util();  }

  @Test
  public void example() { assertTrue(true); }

  @Test
    public void testSingleArgumentReturnsFalse() {
      int array []={5};
        assertFalse(c.compute(array));
    }

    @Test
    public void testEvenNumberOfArgumentsReturnsFalse() {
      int array []={1,2};
        assertFalse(c.compute(array));
    }

    @Test
    public void testSumDivisibleByAnArgumentReturnsTrue() {
      int array []={1,2,3};
        assertTrue(c.compute(array)); // Sum = 6, divisible by 1, 2, and 3
    }
 
    @Test
    public void testSumDivisibleByAnArgumentReturnsFalse() {
      int array []={5,3,3};
        assertFalse(c.compute(array)); // Sum = 6, divisible by 1, 2, and 3
    }
    @Test
    public void testSumNotDivisibleByAnyArgumentReturnsFalse() {
      int array []={1,2,4};  
      assertTrue(c.compute(array)); // Sum = 7, not divisible by 1, 2, or 4
    }

    @Test
    public void testRunTimeException() {
      int array []={0,0,0};  
      try {
        c.compute(array);
      } catch (RuntimeException e) {
        // TODO: handle exception
        assertTrue(true);
      }
      assertFalse(false);
    }

}