package com.siamr.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.siamr.model.Ventas;
@Service

public class VentasServicios {
	

		
		public final ArrayList<Ventas> lista = new ArrayList<Ventas>();
	@Autowired
		public VentasServicios() {
			lista.add(new Ventas (120000.00,"02/10/23"));
			lista.add(new Ventas (75000.00,"12/10/23"));	
			lista.add(new Ventas (85000.00,"12/10/23"));
			lista.add(new Ventas (59000.99,"05/11/23"));
			lista.add(new Ventas (250000.00,"06/11/23"));
			lista.add(new Ventas (500000.00,"21/11/23"));
			
		}// constructor
		
		public ArrayList<Ventas> getAllVentas() {
			return lista;
		} // getAllVentas


		public Ventas getVenta(long id) {
			Ventas vent = null;
			for (Ventas ventas : lista) {
				if(id == ventas.getId()) {
					vent=ventas;
					break;
				} // if
			} // forEach
			return vent;
		} // getVenta


		public Ventas deleteVentas(long id) {
			Ventas vent = null;
			for (Ventas ventas : lista) {
				if(id == ventas.getId()) {
					vent=ventas;
					lista.remove(ventas);
					break;
				} // if
			} // forEach
			return vent;
		} // deleteVenta



		public Ventas addVenta(Ventas venta) {
			lista.add(venta);
			return venta;
		} // addVenta


		public Ventas updateVentas(long id, Double precio, String fecha) {
			Ventas vent = null;
			for (Ventas ventas : lista) {
				if(id == ventas.getId()) {
					if(precio!= null)ventas.setPrecio(precio); 
					if(fecha!= null)ventas.setFecha(fecha); 
					
					vent = ventas;
					break;
				} // if
			} //forEach
			return vent;
		} // updateVentas
		
	} // class


