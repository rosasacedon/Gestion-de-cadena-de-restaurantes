package org.iteracion4.Dominio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class clienteTest {

	
	private static final cliente m = new cliente("Mario", 12345, 5);
 
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
	public final void testGetNombre() {
		//fail("Not yet implemented"); // TODO
		assertEquals("Mario", m.getNombre());
	}

	@Test
	public final void testSetNombre() {
		//fail("Not yet implemented"); // TODO
		m.setNombre("Juan");
		assertEquals("Juan", m.getNombre());
	}

	@Test
	public final void testGetTelefono() {
		//fail("Not yet implemented"); // TODO
		assertEquals("12345", m.getTelefono());
	}

	@Test
	public final void testSetTelefono() {
	//	fail("Not yet implemented"); // TODO
		m.setTelefono(4567);
		assertEquals(4567, m.getTelefono());
	}

	@Test
	public final void testGetId_cliente() {
		//fail("Not yet implemented"); // TODO
		assertEquals("5", m.getId_cliente());
	}

	@Test
	public final void testSetId_cliente() {
	//	fail("Not yet implemented"); // TODO
		m.setTelefono(4);
		assertEquals(4, m.getTelefono());
	}

}
