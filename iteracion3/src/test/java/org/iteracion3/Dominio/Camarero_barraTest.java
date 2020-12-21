package org.iteracion3.Dominio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Camarero_barraTest {

	private static final Camarero_barra c = new Camarero_barra(1,"Juan");
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
	public void testCamarero_barra() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetId_camarero() {
		fail("Not yet implemented");
		assertEquals("1",c.getId_camarero());
		
	}

	@Test
	public void testSetId_camarero() {
		fail("Not yet implemented");
		c.setId_camarero(2);
		assertEquals("2",c.getId_camarero());
	}

	@Test
	public void testGetNombre_camarero() {
		fail("Not yet implemented");
		assertEquals("Juan",c.getId_camarero());

	}

	@Test
	public void testSetNombre_camarero() {
		fail("Not yet implemented");
		c.setNombre_camarero("Pedro");
		assertEquals("Pedro",c.getId_camarero());
	}

}
