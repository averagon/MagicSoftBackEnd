package com.siamr.model;

public class Cotizacion {
	
	private Long id;
	private String nombre;
	private String email;
	private String telefono;
	private String empresa;
	private String mensaje;

	private static long total=0;

	//1. Constructor
	public Cotizacion(String nombre, String email, String telefono, String empresa, String mensaje) {
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.empresa = empresa;
		this.mensaje = mensaje;
		
		Cotizacion.total++;
		this.id=total;
	}//constructor
	
	public Cotizacion() {
		Cotizacion.total++;
		this.id=total;
	}//constructor

	//2. Getters and setters (encapsular)
			public String getNombre() {
				return nombre;
			}//getNombre
		
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}//setNombre
		
			public String getEmail() {
				return email;
			}//getEmail
		
			public void setEmail(String email) {
				this.email = email;
			}//setEmail
		
			public String getTelefono() {
				return telefono;
			}//getTelefono
		
			public void setTelefono(String telefono) {
				this.telefono = telefono;
			}//setTelefono
		
			public String getEmpresa() {
				return empresa;
			}//getEmpresa
		
			public void setEmpresa(String empresa) {
				this.empresa = empresa;
			}//setEmpresa
		
			public String getMensaje() {
				return mensaje;
			}//getMensaje
		
			public void setMensaje(String mensaje) {
				this.mensaje = mensaje;
			}//setMensaje
		
			public Long getId() {
				return id;
			}//getId
			
			
	//3. toString

			@Override
			public String toString() {
				return "Cotizaciones [id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono
						+ ", empresa=" + empresa + ", mensaje=" + mensaje + "]";
			}//toString	
	
}//class Cotizaciones
