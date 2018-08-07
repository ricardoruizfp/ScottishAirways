import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

        Customer customer1;
        @Before
        public void before(){
            customer1 = new Customer("Mike");
        }

        @Test
        public void hasName(){
            assertEquals("Mike", customer1.getName());
        }
}
