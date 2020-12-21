package org.iteracion3.Dominio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CamareroTest {
	private static final Camarero a = new Camarero("Pedro",1);
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
	public void testGetNombre() {
		fail("Not yet implemented");
		assertEquals("Pedro",a.getNombre());
	}

	@Test
	public void testSetNombre() {
		fail("Not yet implemented");
		a.setNombre("Pipo");
		assertEquals("Pipo",a.getNombre());
	}

	@Test
	public void testGetId_trabajador() {
		fail("Not yet implemented");
		assertEquals("3",a.getId_trabajador());
	}

	@Test
	public void testSetId_trabajador() {
		fail("Not yet implemented");
		a.setId_trabajador(2);
		assertEquals("2",a.getNombre());
	}

}
