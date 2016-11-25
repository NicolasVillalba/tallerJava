/**
 * 
 */
package org.nicolas.app;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author nicolas
 *
 */
public class LinketListTest {
	
	private LinketList list;
	private LinketList list2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new LinketList();
		list2 = new LinketList();
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#LinketList()}.
	 */
	@Test
	public void testLinketList() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#size()}.
	 */
	@Test
	public void testSize() {
		
		loadByAdd(list, "1", "2", "3", "4", "5", "6");
		
		assertThat(list.size(), is(equalTo(6)));
	}
	
	/**
	 * Accessory method for data initialization
	 * @param input
	 * @param objects
	 */
	private static void loadByAdd(LinketList input, Object ... objects ){
		for(Object n : objects){
			input.add(n);
		}
	}
	
	/**
	 * Accessory method for data initialization
	 * @param input
	 * @param objects
	 */
	private static void loadByAddAtFirst(LinketList input, Object ... objects ){
		
		for(Object n : objects){
			input.addAtFirst(n);
		}
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#add(java.lang.Object)}.
	 */
	@Test
	public void testAddAtFirst() {	
		
		loadByAddAtFirst(list2, "Pipo", "Lito", "Miguel", "Marcos");
		
		assertThat(list2.size(), is(equalTo(4)));
	}
	
	/**
	 * Test if the last element created with addAtFirst() is
	 * the first in the list 
	 */
	@Test
	public void testIndexCreatedOnlyWithAddAtFirst() {	
		
		loadByAddAtFirst(list2, "Pipo", "Lito", "Miguel", "Marcos");
		
		assertThat(list2.get(0), is(equalTo("Marcos")));
	}
	
	@Test
	public void testAdd() {	
		
		loadByAdd(list, "sxs", "sxsa", "sxsax", "sxsaxsxas");
		
		assertThat(list.size(), is(equalTo(4)));
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#get(int)}.
	 */
	@Test
	public void testGetLast() {
		
		loadByAdd(list, "sxsaxsxas", "sxsaxsxas", "sxsaxsxas", "nicolas");
		
		assertThat(list.getLast(), is(equalTo("nicolas")));
	}
	
	@Test
	public void testGet() {
		
		loadByAdd(list, "sxsaxsxas", "carla", "milka", "nicolas");
		
		assertThat(list.get(2), is(equalTo("milka")));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetException() {
		
		loadByAdd(list, "sxsaxsxas", "carla", "milka", "nicolas");
		
		assertThat(list.get(6), is(equalTo("milka")));
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetExceptionNegative() {
		
		loadByAdd(list, "sxsaxsxas", "carla", "milka", "nicolas");
		
		assertThat(list.get(-1), is(equalTo("mdsdsdilka")));
	}
	
	@Test
	public void testLastIndexOf() {
		
		loadByAdd(list, "Homero", "March", "Lisa", "Bart");
		
		assertThat(list.indexOf("Bart"), is(equalTo(3)));
	}
	
	

	/**
	 * Test method for {@link org.nicolas.app.LinketList#remove(java.lang.Object)}.
	 */
	@Test
	public void testRemove() {
		
		loadByAdd(list, "sxsaxsxas", "322323232", "¿'¿'¿'¿'¿", "MMMMMMMMM");
		
		assertThat(list.remove("322323232"), is(true));
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#iterator()}.
	 */
	@Test
	public void testIterator() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#insert(int, java.lang.Object)}.
	 */
	@Test
	public void testInsert() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link java.lang.Object#toString()}.
	 */
	@Test
	public void testToString() {
		//fail("Not yet implemented");
	}

}
