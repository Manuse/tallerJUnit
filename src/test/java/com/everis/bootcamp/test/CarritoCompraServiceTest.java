package com.everis.bootcamp.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.everis.bootcamp.tallerjunit.Articulo;
import com.everis.bootcamp.tallerjunit.CarritoCompraService;

public class CarritoCompraServiceTest {

	CarritoCompraService ccs;
	
	@Test
	public void comprobarArticulo(){
		
		assertTrue(CarritoCompraService.calculadorDescuento(10, 50)==5);
		
	}
	
	
	
	@Before
	public void setUp(){
		ccs = new CarritoCompraService();
	}
	
}

