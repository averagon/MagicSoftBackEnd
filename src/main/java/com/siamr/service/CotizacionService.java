package com.siamr.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siamr.model.Cotizacion;
@Service
public class CotizacionService {

	public final ArrayList<Cotizacion> lista = new ArrayList<Cotizacion>();
	
	@Autowired
	public CotizacionService() {
		lista.add(new Cotizacion("Verónica Castro","verocastro@mail.com","2356987412","Vero sa de cv","Quiero unos servicios en la nube"));
		lista.add(new Cotizacion("Amalia Quinteros","amalia@mail.com","6598742355","Amalia sa de cv","Equipo de cómputo centralizado y descentralizado"));
		lista.add(new Cotizacion("Luis Miguel","luis@mail.com","6658974451","Luis sa de cv","Distribución de licencias de software"));
		lista.add(new Cotizacion("Amanda Miguel","amanda@mail.com","6598256633","Amanda sa de cv","Servicios administrativos"));
		lista.add(new Cotizacion("Benito Juárez","benito@mail.com","6699856655","Benito sa de cv","Implementación de Software de Caja"));
		lista.add(new Cotizacion("Verónica Castro","verocastro@mail.com","2356987412","Vero sa de cv","Servicios Administrativos de la OnSite"));
		
	}//constructor CotizacionService
	
	public ArrayList<Cotizacion> getAllCotizaciones(){
		return lista;
	}//getAllCotizaciones
	
	public Cotizacion getCotizacion (long id) {
		Cotizacion cot=null;
		for (Cotizacion cotizacion: lista) {
			if (id==cotizacion.getId()) {
				cot=cotizacion;
				break;
			}//if
		}//forEach
		return cot;
	}//getCotizacion
	
	public Cotizacion deleteCotizacion (long id) {
		Cotizacion cot=null;
		for (Cotizacion cotizacion : lista) {
			if (id==cotizacion.getId()) {
				cot=cotizacion;
				lista.remove(cotizacion);
				break;
			}//if
		}//forEach
		return cot;
	}//deleteCotizacion
	
	public Cotizacion addCotizacion (Cotizacion cotizacion) {
		lista.add(cotizacion);
		return cotizacion;
	}//addCotizacion
	
	public Cotizacion updateCotizacion (long id, String nombre, String email, String telefono, String empresa, String mensaje) {
		Cotizacion cot = null;
		for (Cotizacion cotizacion : lista) {
			if (id==cotizacion.getId()) {
				if (nombre!=null) cotizacion.setNombre (nombre);
				if (email!=null) cotizacion.setEmail (email);
				if (telefono!=null) cotizacion.setTelefono(telefono);
				if (empresa!=null) cotizacion.setEmpresa(empresa);
				if (mensaje!=null) cotizacion.setMensaje(mensaje);
				cot=cotizacion;
				break;
			}//if
		}//foreach
		return cot;
		
	}//updateCotizacion
	
	
	
}//class CotizacionesService
