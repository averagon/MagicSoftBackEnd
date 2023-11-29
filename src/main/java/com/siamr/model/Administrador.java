package com.siamr.model;

public class Administrador {
	private Long Id;
	private String nombre;
	private String email;
	private String telefono;
	private String contraseña;
	
	private static long total = 0;
	
	public Administrador(String nombre, String email, String telefono, String contraseña) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.contraseña = contraseña;
		Administrador.total++;
		this.Id=total;
	} // constructor
	
		public Administrador() {
			Administrador.total++; 
			this.Id= total;
			} // constructor vacio ID
	

				public Long getId() {
					return Id;
				}


				public String getNombre() {
					return nombre;
				}
			
				public void setNombre(String nombre) {
					this.nombre = nombre;
				}
			
				public String getEmail() {
					return email;
				}
			
				public void setEmail(String email) {
					this.email = email;
				}
			
				public String getTelefono() {
					return telefono;
				}
			
				public void setTelefono(String telefono) {
					this.telefono = telefono;
				}
			
				public String getContraseña() {
					return contraseña;
				}
			
				public void setContraseña(String contraseña) {
					this.contraseña = contraseña;
				}


@Override
public String toString() {
return "Administrador [Id=" + Id + ", nombre=" + nombre + ", email=" + email + ", telefono="
+ telefono + ", contraseña=" + contraseña + "]";
} // ToString


	
} // class
