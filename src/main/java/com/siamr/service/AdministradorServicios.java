package com.siamr.service;

import java.util.List;
import java.util.Optional;

import com.siamr.model.Administrador;
import com.siamr.repository.AdministradorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdministradorServicios {
	
	private final AdministradorRepository administradorRepository; 
		
@Autowired
	public AdministradorServicios(AdministradorRepository administradorRepository) {
		this.administradorRepository = administradorRepository;
	}// constructor

				//lista.add(new Administrador ("Karen Valenzuela","karen.tupatrona@gmail.com", "3311756441", "corazonValiente@123"));
				//lista.add(new Administrador ("Sandra Meraz","todosOdiamosAsandra@gmail.com", "6181066180", "laRompecorazones69@"));	
				//lista.add(new Administrador ("Angela Vera","nosoyVelaEntiende@gmail.com", "8712618563", "quieroDormir@12"));
				//lista.add(new Administrador ("Fabiola Valdes","lacomeTacos@gmail.com", "3339503490", "taquitos4Ever@"));
				//lista.add(new Administrador ("Ingrid Romero","IngridPiojosa@gmail.com","5531024561", "Piojos123@"));
				//lista.add(new Administrador ("Jazmin Rodriguez","jazzz_conejito@gmail.com","5548142468", "conejitos4Ever@"));
				//lista.add(new Administrador ("Carolina Ayala","noMellamoCONSUELO@gmail.com", "8662075674", "Nosoyconsuelo@"));
				//lista.add(new Administrador ("Ana Sanchez","todosMeaman@gmail.com", "8332954201", "todosMeaman123@"));
	
	public List<Administrador> getAllAdministrador() {
		return administradorRepository.findAll();
	} // getAllAdministrador


	public Administrador getAdministrador(long id) {
		return administradorRepository.findById(id).orElseThrow(
				()-> new IllegalArgumentException ("El Producto con el id [" + id
						+ "] no existe")
				);
	} // getAdministrador
		
	public Administrador deleteAdministrador(long id) {
		Administrador admin = null;
		if(administradorRepository.existsById(id)){
			admin=administradorRepository.findById(id).get();
			administradorRepository.deleteById(id);
		} // if existsById
	return admin;
} // deleteAdministrador



	public Administrador addAdministrador(Administrador administrador) {
		Optional <Administrador> tmpAdmin = administradorRepository.findByNombre(administrador.getNombre());
		if (tmpAdmin.isEmpty()) { // no se encuentra el producto con ese nombre
			return administradorRepository.save(administrador);
		} else {
			System.out.println("Ya existe el producto con el nombre ["
					+  administrador.getNombre() + "]");
			return null;
		} // else
	} // addAdministrador


	public Administrador updateAdministrador(long id, String nombre, String email, String telefono,  String contraseña) {
		Administrador admin = null;
		
		if(administradorRepository.existsById(id)) {
			admin = administradorRepository.findById(id).get();
			if(nombre!= null)admin.setNombre(nombre); 
			if(email!= null)admin.setEmail(email); 
			if(telefono!= null)admin.setTelefono(telefono); 
			if(contraseña!= null)admin.setContraseña(contraseña); 
			administradorRepository.save(admin);
		} // existsById
	return admin;
} // updateProducto
			
} // class
