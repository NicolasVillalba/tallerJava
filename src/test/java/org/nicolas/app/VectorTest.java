package org.nicolas.app;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class VectorTest {
	
	private List vector;

	@Before
	public void setUp() throws Exception {
		vector = new Vector(); 
	}

	@Test
	public void testVector() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		for (int i = 1; i <= 22; i++) {
			vector.add("dsds" + i);
		}
		assertThat(vector.size(), is(equalTo(22)));
	}

	@Test
	public void testAdd() {
		vector.add("dsds");
	}

	@Test
	public void testGet() {
		for (int i = 1; i <= 22; i++) {
			vector.add("dsds" + i);
		}
		assertThat(vector.get(21), is(equalTo("dsds22")));
		assertThat(vector.size(), is(equalTo(22)));
	}

	@Test
	public void testRemove() {
		for (int i = 1; i <= 5; i++) {
			vector.add("obj" + i);
		}
		assertThat(vector.remove("obj1"), is(equalTo(true)));
	}
	
	
	@Test
	public void testRemove2() {
		for (int i = 1; i <= 20; i++) {
			vector.add(i);
		}
		assertThat(vector.remove(20), is(equalTo(true)));
	}

	@Test
	public void testIterator() {
		//fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		//fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
	}

}
