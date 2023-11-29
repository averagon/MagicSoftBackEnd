package com.siamr.service;

import java.util.ArrayList;

import com.siamr.model.Administrador;

public class AdministradorServicios {
	public final ArrayList<Administrador> lista = new ArrayList<Administrador>();
	
	public AdministradorServicios() {
		lista.add(new Administrador ("Karen Valenzuela","karen.tupatrona@gmail.com", "3311756441", "corazonValiente@123"));
		lista.add(new Administrador ("Sandra Meraz","todosOdiamosAsandra@gmail.com", "6181066180", "laRompecorazones69@"));	
		lista.add(new Administrador ("Angela Vera","nosoyVelaEntiende@gmail.com", "8712618563", "quieroDormir@12"));
		lista.add(new Administrador ("Fabiola Valdes","lacomeTacos@gmail.com", "3339503490", "taquitos4Ever@"));
		lista.add(new Administrador ("Ingrid Romero","IngridPiojosa@gmail.com","5531024561", "Piojos123@"));
		lista.add(new Administrador ("Jazmin Rodriguez","jazzz_conejito@gmail.com","5548142468", "conejitos4Ever@"));
	
	}
	
	
	
	

} // class
