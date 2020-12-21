package org.iteracion4.Dominio;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class mesaTest {
	
	private static final mesa m = new mesa(1,2,Estados.Reservada,new Camarero_Sala(1,"Juan"));

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
	public final void testGetId_mesa() {
		//fail("Not yet implemented"); // TODO
		assertEquals("1", m.getId_mesa());
	}

	@Test
	public final void testSetId_mesa() {
		//fail("Not yet implemented"); // TODO
		m.setId_mesa(2);
		assertEquals("2", m.getId_mesa());
	}

	@Test
	public final void testGetNum_comensales_int() {
		//fail("Not yet implemented"); // TODO
		assertEquals("2", m.getNum_comensales_int());
	}

	@Test
	public final void testSetNum_comensales_int() {
		//fail("Not yet implemented"); // TODO
		m.setNum_comensales_int(2);
		assertEquals("2", m.getNum_comensales_int());
	}

	@Test
	public final void testGetEstado() {
		//fail("Not yet implemented"); // TODO
		assertEquals("2", m.getEstado());
	}

	@Test
	public final void testSetEstado() {
		fail("Not yet implemented"); // TODO
		m.setEstado(Estados.Reservada);
		assertEquals("2", m.getEstado());
	}

	@Test
	public final void testGetCamarero() {
		fail("Not yet implemented"); // TODO
		assertEquals("2", m.getCamarero());
	}

	@Test
	public final void testSetCamarero() {
		fail("Not yet implemented"); // TODO
		m.setCamarero(new Camarero_Sala(2,"Pedro"));
		assertEquals("2", m.getCamarero().getId_camarero());
		assertEquals("Pedro", m.getCamarero().getNombre());
	}

}
