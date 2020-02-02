import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hw3.task1_3;

public class test1_3 {

	@Test
	public void test() {
		//ÍÅ ÇÍÀŞ, ßÊ ÇÂÅĞÍÓÒÈÑß ÄÎ ÌÅÒÎÄÓ ÌÅÉÍ Â ÇÀÄÀÍÍ² 1_3
		assertEquals("must enter the error number correctly", "BAD_REQUEST", task1_3.main(400));
		assertEquals("must enter the error number correctly", "UNAUTORIZED", task1_3.main(args));
		assertEquals("must enter the error number correctly", "PAYMENT_REQUIRED", task1_3.main(args));
		assertEquals("must enter the error number correctly", "FORBIDDEN", task1_3.main(args));
		assertEquals("must enter the error number correctly", "NOT_FOUND", task1_3.main(args));
		assertEquals("must enter the error number correctly", "METHOD_NOT_ALLOWED", task1_3.main(args));
	   
	}

}
 