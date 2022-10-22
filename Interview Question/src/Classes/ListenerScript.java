package Classes;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;  
public class ListenerScript {
	
//@Listeners(Classes.ListnerTest.class)	
@Test
public void method1() {
assertEquals("12", "123");
}
}
