package prometheus;

import static org.junit.Assert.*;
import org.junit.Test;


public class ValueTest {
	
	@Test
	public void valueTest() {
		Value val = new Value(0);
		
		assertEquals(val.getValue(),0);
		
		val.setValue(1);
		
		assertEquals(val.getValue(),1);
	}
	
}
