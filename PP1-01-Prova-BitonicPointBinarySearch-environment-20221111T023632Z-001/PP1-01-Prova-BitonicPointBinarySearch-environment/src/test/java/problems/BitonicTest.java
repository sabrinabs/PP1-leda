package problems;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitonicTest {

	public BitonicPointBinarySearchImpl<Integer> bitonic = new BitonicPointBinarySearchImpl<Integer>();
	public BitonicPointBinarySearchImpl<String> bString = new BitonicPointBinarySearchImpl<String>();
	
	
	@Test
	public void test01() {
		Integer[] arrayum = new Integer[]{7,12,16,20,7,4,2,1};
		Integer saida = bitonic.bitonicPoint(arrayum);
		assertEquals(20, saida.intValue());
	}
	
	
	@Test
	public void test02() {
		Integer[] arraydois = new Integer[]{1,2,5,3};
		Integer saida = bitonic.bitonicPoint(arraydois);
		assertEquals(5, saida.intValue());
	}
	
	@Test
	public void test03() {
		Integer[] arraytres = new Integer[]{5,3};
		Integer saida = bitonic.bitonicPoint(arraytres);
		assertEquals(5, saida.intValue());
	}
	
	
	@Test
	public void test04() {
		Integer[] arrayquatro = new Integer[]{1,2};
		Integer saida = bitonic.bitonicPoint(arrayquatro);
		assertEquals(2, saida.intValue());
	}
	
	@Test
	public void test05() {
		Integer[] arraycinco = new Integer[]{1,-2,3,5, 4};
		Integer saida = bitonic.bitonicPoint(arraycinco);
		assertEquals(5, saida.intValue());
	}
	
	@Test
	public void test06() {
		Integer[] arrayseis = new Integer[]{};
		Integer saida = bitonic.bitonicPoint(arrayseis);
		assertNull(saida);
	}
	
	@Test
	public void test07() {
		Integer[] arraysete = null;
		Integer saida = bitonic.bitonicPoint(arraysete);
		assertNull(saida);
	}
	
	@Test
	public void test08() {
		Integer[] arrayunitario = new Integer[]{1};
		Integer saida = bitonic.bitonicPoint(arrayunitario);
		assertEquals(1, saida.intValue());
	}
	
	@Test
	public void test09() {
		String[] arrayString = new String[]{"a", "caixa", "virou", "pedra"};
		String saida = bString.bitonicPoint(arrayString);
		assertEquals("virou", saida);
	}
	
	// so decrescente e de tam par
	@Test
	public void test033() {
		Integer[] arraytres = new Integer[]{5,3,2,1,-4,-8,-10,-56};
		Integer saida = bitonic.bitonicPoint(arraytres);
		assertEquals(5, saida.intValue());
	}
	
	// so crecente e de tam impar
	@Test
	public void test044() {
		Integer[] arrayquatro = new Integer[]{1,2,5,8,44,89,122,345,433};
		Integer saida = bitonic.bitonicPoint(arrayquatro);
		assertEquals(433, saida.intValue());
	}
	
	@Test
	public void test035() {
		Integer[] arraytres = new Integer[]{5,70,2,1,-4,-8,-10,-56};
		Integer saida = bitonic.bitonicPoint(arraytres);
		assertEquals(70, saida.intValue());
	}
	
	// so crecente e de tam impar
	@Test
	public void test045() {
		Integer[] arrayquatro = new Integer[]{1,2,5,8,44,89,122,2};
		Integer saida = bitonic.bitonicPoint(arrayquatro);
		assertEquals(122, saida.intValue());
	}
	
	
}
