package org.iteracion4.Dominio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Camarero_SalaTest {

	private static final Camarero_Sala m = new Camarero_Sala(1, "Pepe");
	
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
	public final void testCamarero_SalaIntString() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testCamarero_SalaIntStringMesa() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetId_camarero() {
		//fail("Not yet implemented"); // TODO
		assertEquals(1, m.getId_camarero());
	}

	@Test
	public final void testSetId_camarero() {
		//fail("Not yet implemented"); // TODO
		m.setId_camarero(2);
		assertEquals(2, m.getId_camarero());
	}

	@Test
	public final void testGetNombre() {
		//fail("Not yet implemented"); // TODO
		assertEquals("Pepe", m.getNombre());
		
	}

	@Test
	public final void testSetNombre() {
		//fail("Not yet implemented"); // TODO
		m.setNombre("Lucas");
		assertEquals("Lucas", m.getNombre());
		
	}

	

}
