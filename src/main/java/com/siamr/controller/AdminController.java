package com.siamr.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siamr.model.Administrador;
import com.siamr.service.AdministradorServicios;

@RestController
@RequestMapping(path="/api/administrador/") // http://localhost:8080/administrador/


		public class AdminController {

	private final AdministradorServicios administradorServicios;
	
	@Autowired
	public AdminController(AdministradorServicios administradorServicios) {
		this.administradorServicios= administradorServicios;
	}


	@GetMapping //http://localhost:8080/api/productos/
	public ArrayList<Administrador> getAllAdmin () {
		return administradorServicios.getAllAdministrador();
	}
	
	@GetMapping (path="{adminId}") //http://localhost:8080/api/productos/1
	public Administrador getAdministrador (@PathVariable ("admindId") long id) {
		return administradorServicios.getAdministrador(id);
	}//getproducto
	
	@DeleteMapping (path="{adminId}") //http://localhost:8080/api/productos/
	public Administrador deleteAdministrador (@PathVariable ("adminId") long id) {
		return administradorServicios.deleteAdministrador(id);
	}//deleteproducto
	
	@PostMapping  //http://localhost:8080/api/productos/
	public Administrador addAdministrador(@RequestBody Administrador administrador) {
		return administradorServicios.addAdministrador(administrador);
	}
	
	@PutMapping (path="{adminId}") //http://localhost:8080/api/productos/
	public Administrador updateAdministrador(@PathVariable ("adminId") long id, 
			@RequestParam(required=false) String nombre,
			@RequestParam(required=false) String email,
			@RequestParam(required=false) String telefono,
			@RequestParam(required=false) String contraseña) {
		return administradorServicios.updateAdministrador(id, nombre,email,telefono, contraseña);
	}

	
	
	
	
}//class ProductoController