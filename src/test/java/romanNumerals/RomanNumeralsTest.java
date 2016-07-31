package romanNumerals;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {
	
	RomanNumeral rn;

	@Before
	public void setUp() throws Exception {
		rn = new RomanNumeral();
	}
	
	@Test
	public void shouldReturnI() {
		assertEquals("I", rn.romanOfNum(1));
	}
	
	@Test
	public void shouldReturnII() throws Exception {
		assertEquals("II", rn.romanOfNum(2));
	}
	
	@Test
	public void shouldReturnIII() throws Exception {
		assertEquals("III", rn.romanOfNum(3));
	}
	
	@Test
	public void shouldReturnIV() throws Exception {
		assertEquals("IV", rn.romanOfNum(4));
	}
	
	@Test
	public void shouldReturnV() throws Exception {
		assertEquals("V", rn.romanOfNum(5));
	}
	
	@Test
	public void shouldReturnVI() throws Exception {
		assertEquals("VI", rn.romanOfNum(6));
	}
	
	@Test
	public void shouldReturnVII() throws Exception {
		assertEquals("VII", rn.romanOfNum(7));
	}
	
	@Test
	public void shouldReturnVIII() throws Exception {
		assertEquals("VIII", rn.romanOfNum(8));
	}
	
	@Test
	public void shouldReturnIX() throws Exception {
		assertEquals("IX", rn.romanOfNum(9));
	}
	
	@Test
	public void shouldReturnX() throws Exception {
		assertEquals("X", rn.romanOfNum(10));
	}
	
	@Test
	public void shouldReturnXI() {
		assertEquals("XI", rn.romanOfNum(11));
	}
	
	@Test
	public void shouldReturnXII() throws Exception {
		assertEquals("XII", rn.romanOfNum(12));
	}
	
	@Test
	public void shouldReturnXIII() throws Exception {
		assertEquals("XIII", rn.romanOfNum(13));
	}
	
	@Test
	public void shouldReturnIL() throws Exception {
		assertEquals("IL", rn.romanOfNum(49));
	}
	
	@Test
	public void shouldReturnL() throws Exception {
		assertEquals("L", rn.romanOfNum(50));
	}
	
	@Test
	public void shouldReturnLI() {
		assertEquals("LI", rn.romanOfNum(51));
	}
	
	@Test
	public void shouldReturnLII() throws Exception {
		assertEquals("LII", rn.romanOfNum(52));
	}
	
	@Test
	public void shouldReturnLIII() throws Exception {
		assertEquals("LIII", rn.romanOfNum(53));
	}
	
	@Test
	public void shouldReturnIC() throws Exception {
		assertEquals("IC", rn.romanOfNum(99));
	}
	
	@Test
	public void shouldReturnC() throws Exception {
		assertEquals("C", rn.romanOfNum(100));
	}
	
	@Test
	public void shouldReturnCI() {
		assertEquals("CI", rn.romanOfNum(101));
	}
	
	@Test
	public void shouldReturnCII() throws Exception {
		assertEquals("CII", rn.romanOfNum(102));
	}
	
	@Test
	public void shouldReturnCIII() throws Exception {
		assertEquals("CIII", rn.romanOfNum(103));
	}
	
	@Test
	public void shouldReturnID() throws Exception {
		assertEquals("ID", rn.romanOfNum(499));
	}
	
	@Test
	public void shouldReturnD() throws Exception {
		assertEquals("D", rn.romanOfNum(500));
	}
	
	@Test
	public void shouldReturnDI() {
		assertEquals("DI", rn.romanOfNum(501));
	}
	
	@Test
	public void shouldReturnDII() throws Exception {
		assertEquals("DII", rn.romanOfNum(502));
	}
	
	@Test
	public void shouldReturnDIII() throws Exception {
		assertEquals("DIII", rn.romanOfNum(503));
	}
	
	@Test
	public void shouldReturnIM() throws Exception {
		assertEquals("IM", rn.romanOfNum(999));
	}
	
	@Test
	public void shouldReturnM() throws Exception {
		assertEquals("M", rn.romanOfNum(1000));
	}
}
