package com.siamr.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siamr.model.Administrador;
@Service
public class AdministradorServicios {
	public final ArrayList<Administrador> lista = new ArrayList<Administrador>();
@Autowired
	public AdministradorServicios() {
		lista.add(new Administrador ("Karen Valenzuela","karen.tupatrona@gmail.com", "3311756441", "corazonValiente@123"));
		lista.add(new Administrador ("Sandra Meraz","todosOdiamosAsandra@gmail.com", "6181066180", "laRompecorazones69@"));	
		lista.add(new Administrador ("Angela Vera","nosoyVelaEntiende@gmail.com", "8712618563", "quieroDormir@12"));
		lista.add(new Administrador ("Fabiola Valdes","lacomeTacos@gmail.com", "3339503490", "taquitos4Ever@"));
		lista.add(new Administrador ("Ingrid Romero","IngridPiojosa@gmail.com","5531024561", "Piojos123@"));
		lista.add(new Administrador ("Jazmin Rodriguez","jazzz_conejito@gmail.com","5548142468", "conejitos4Ever@"));
		lista.add(new Administrador ("Carolina Ayala","noMellamoCONSUELO@gmail.com", "8662075674", "Nosoyconsuelo@"));
		lista.add(new Administrador ("Ana Sanchez","todosMeaman@gmail.com", "8332954201", "todosMeaman123@"));
	}// constructor
	
	public ArrayList<Administrador> getAllAdministrador() {
		return lista;
	} // getAllAdministrador


	public Administrador getAdministrador(long id) {
		Administrador admin = null;
		for (Administrador administrador : lista) {
			if(id == administrador.getId()) {
				admin=administrador;
				break;
			} // if
		} // forEach
		return admin;
	} // getAdministrador


	public Administrador deleteAdministrador(long id) {
		Administrador admin = null;
		for (Administrador administrador : lista) {
			if(id == administrador.getId()) {
				admin=administrador;
				lista.remove(administrador);
				break;
			} // if
		} // forEach
		return admin;
	} // deleteAdministrador



	public Administrador addAdministrador(Administrador administrador) {
		lista.add(administrador);
		return administrador;
	} // addAdministrador


	public Administrador updateAdministrador(long id, String nombre, String email, String telefono,  String contraseña) {
		Administrador admin = null;
		for (Administrador administrador : lista) {
			if(id == administrador.getId()) {
				if(nombre!= null)administrador.setNombre(nombre); 
				if(email!= null)administrador.setEmail(email); 
				if(telefono!= null)administrador.setTelefono(telefono); 
				if(contraseña!= null)administrador.setContraseña(contraseña); 
				admin = administrador;
				break;
			} // if
		} //forEach
		return admin;
	} // updateAdministrador
	
} // class
