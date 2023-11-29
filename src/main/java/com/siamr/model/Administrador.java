package com.siamr.model;

public class Administrador {
	private Long Id;
	private String nombre;
	private String email;
	private String telefono;
	private String contaseña;
	
	private static long total = 0;
	
	public Administrador(String nombre, String email, String telefono, String contaseña) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.contaseña = contaseña;
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
			
				public String getContaseña() {
					return contaseña;
				}
			
				public void setContaseña(String contaseña) {
					this.contaseña = contaseña;
				}


@Override
public String toString() {
return "Administrador [Id=" + Id + ", nombre=" + nombre + ", email=" + email + ", telefono="
+ telefono + ", contaseña=" + contaseña + "]";
} // ToString


	
} // class
