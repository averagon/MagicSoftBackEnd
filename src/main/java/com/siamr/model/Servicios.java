package com.siamr.model;

public class Servicios {
	private Long Id;
	private String nombre;
	private String descrpcion;
	private String imagen;
	
	private static long total = 0;
	
	public Servicios(String nombre, String descrpcion, String imagen) {
		this.nombre = nombre;
		this.descrpcion = descrpcion;
		this.imagen = imagen;
		Servicios.total++;
		this.Id=total;
	} // constructor
	
	
		public Servicios() {
			Servicios.total++; 
			this.Id= total;
			} // constructor2
	
	

			public String getNombre() {
				return nombre;
			}
		
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
		
			public String getDescrpcion() {
				return descrpcion;
			}
		
			public void setDescrpcion(String descrpcion) {
				this.descrpcion = descrpcion;
			}
		
			public String getImagen() {
				return imagen;
			}
		
			public void setImagen(String imagen) {
				this.imagen = imagen;
			}
		
			public Long getId() {
				return Id;
			}

	
	
	@Override
	public String toString() {
		return "Servicios [Id=" + Id + ", nombre=" + nombre + ", descrpcion=" + descrpcion + ", imagen=" + imagen + "]";
	} //toString


} // class
