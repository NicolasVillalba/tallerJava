/**
 * 
 */
package org.nicolas.app;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author nicolas
 *
 */
public class LinketListTest {
	
	private LinketList list;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new LinketList();
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
		//fail("Not yet implemented");
	}
	
	/**
	 * Accessory method for data initialization
	 * @param input
	 * @param objects
	 */
	private static void load(LinketList input, Object ...objects ){
		for (int i = 0; i < objects.length; i++) {
			input.add(objects[i]);
		}
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#add(java.lang.Object)}.
	 */
	@Test
	public void testAdd() {	
		
		load(list, "sxsaxsxas", "sxsaxsxas", "sxsaxsxas", "sxsaxsxas");
		
		assertThat(list.size(), is(equalTo(4)));
	}

	/**
	 * Test method for {@link org.nicolas.app.LinketList#get(int)}.
	 */
	@Test
	public void testGetLast() {
		
		load(list, "sxsaxsxas", "sxsaxsxas", "sxsaxsxas", "nicolas");
		
		assertThat(list.getLast(), is(equalTo("nicolas")));
	}
	
	@Test
	public void testGetWithLastElement() {
		
		load(list, "sxsaxsxas", "carla", "milka", "nicolas");
		
		assertThat(list.get("nicolas"), is(equalTo(3)));
	}
	
	

	/**
	 * Test method for {@link org.nicolas.app.LinketList#remove(java.lang.Object)}.
	 */
	@Test
	public void testRemove() {
		
		load(list, "sxsaxsxas", "322323232", "¿'¿'¿'¿'¿", "MMMMMMMMM");
		
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
