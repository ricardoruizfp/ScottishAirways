import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

        Customer customer;
        @Before
        public void before(){
            customer = new Customer("Mike");
        }

        @Test
        public void hasName(){
            assertEquals("Mike", customer.getName());
        }
}
