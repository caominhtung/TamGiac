import static org.junit.Assert.*;

import org.junit.Test;


public class testKTTamGiac {

	@Test
	public void KTTamGiactest1() {
		
		//KTTamGiac tamgiac = new KTTamGiac();
		String str = new String();
		str = KTTamGiac.Tg(2,3,6);
		assertEquals("Khong phai tam giac.", str);
	}
	
	@Test
	public void KTTamGiactest2() {
		
		//KTTamGiac tamgiac = new KTTamGiac();
		String str = new String();
		str = KTTamGiac.Tg(3,4,5);
		assertEquals("Tam giac vuong.", str);
	}
	
	@Test
	public void KTTamGiactest3() {
		
		//KTTamGiac tamgiac = new KTTamGiac();
		String str = new String();
		str = KTTamGiac.Tg(4,4,6);
		assertEquals("Tam giac can.", str);
	}
}
