package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.AddSub;
import Main.Calculate;
import Main.MulDiv;

class Test_CalCulate {

	@Test
	void test() {
		Calculate cal=new Calculate();
		cal.setAddSub(new AddSub());
		cal.setMulDiv(new MulDiv());
		int ret=cal.getResult(2, 3, "+");
		//int ret=5;
		assertEquals(5,ret);
		
		ret=cal.getResult(2, 3, "-");
		assertEquals(-1,ret);
		
		ret=cal.getResult(2, 3, "*");
		assertEquals(6,ret);
		
		
		ret=cal.getResult(2, 3, "/");
		assertEquals(0,ret);
	}

}
