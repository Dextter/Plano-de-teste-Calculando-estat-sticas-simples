

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author guest-1urjbg
 */

@RunWith(Parameterized.class)
public class media {
   
    private int[] array;
    
   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][][] {
         { {1,2,3}, }
      });
   }

    public media(int[] a) {
        array = a;
    }
             
    @Test
    public void is_sizeSqn(){
        assertTrue(array[0]/1 == 0 || array[0]/1 != 0);
    }
        
    
}
