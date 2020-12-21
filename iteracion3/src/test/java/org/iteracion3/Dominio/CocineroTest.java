package org.iteracion3.Dominio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CocineroTest {
	private static final Cocinero o = new Cocinero(1,"Amelia");
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetId_cocinero() {
		fail("Not yet implemented");
		assertEquals("1",o.getId_cocinero());
	}

	@Test
	public void testSetId_cocinero() {
		fail("Not yet implemented");
		o.setId_cocinero(4);
		assertEquals("4",o.getId_cocinero());
	}

	@Test
	public void testGetNombre_cocinero() {
		fail("Not yet implemented");
		assertEquals("Amelia",o.getNombre_cocinero());
	}

	@Test
	public void testSetNombre_cocinero() {
		fail("Not yet implemented");
		o.setNombre_cocinero("Andrea");
		assertEquals("2",o.getNombre_cocinero());
	}

	@Test
	public void testCocinero() {
		fail("Not yet implemented");
	}

}
