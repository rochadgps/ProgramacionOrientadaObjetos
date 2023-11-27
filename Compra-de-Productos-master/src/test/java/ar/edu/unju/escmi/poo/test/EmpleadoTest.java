package ar.edu.unju.escmi.poo.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unju.escmi.poo.dominio.Carrito;
import ar.edu.unju.escmi.poo.dominio.Empleado;
import ar.edu.unju.escmi.poo.dominio.Plan;
import ar.edu.unju.escmi.poo.dominio.TarjetaDeCredito;

public class EmpleadoTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Inicia Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Finaliza Test");
	}

	@Test
	public void testSumarMontoDePlanes() {
		Empleado emp = new Empleado("gustso", "123", "Gustavo", "Sosa",22222222);
		List<Plan> planes = new ArrayList<Plan>();
		List<Carrito> carrito = new ArrayList<Carrito>();
		carrito.add(new Carrito("m52",2,23000));
		planes.add(new Plan("Lucas",12,45000,3750,carrito,new TarjetaDeCredito("Lucas",12341234,"Galicia",LocalDate.of(2030, 12, 12),123)));
		
		assertEquals(45000.0,emp.sumarMontoDePlanes(planes),0);
	}

}
