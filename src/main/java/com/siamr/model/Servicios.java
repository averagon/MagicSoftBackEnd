package com.siamr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "servicios")
public class Servicios {
	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 @Column (name = "id", unique = true, nullable = false)
	 private Long id;
	 @Column (nullable = false)
	private String nombre;
	 @Column (nullable = false)
	private String descripcion;
	 @Column (nullable = false)
	private String imagen;
	
	
	public Servicios(String nombre, String descrpcion, String imagen) {
		this.nombre = nombre;
		this.descripcion = descrpcion;
		this.imagen = imagen;
	} // constructor
	
	
		public Servicios() {

			} // constructor2
	
	

			public String getNombre() {
				return nombre;
			}
		
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
		
			public String getDescrpcion() {
				return descripcion;
			}
		
			public void setDescrpcion(String descrpcion) {
				this.descripcion = descrpcion;
			}
		
			public String getImagen() {
				return imagen;
			}
		
			public void setImagen(String imagen) {
				this.imagen = imagen;
			}
		
			public Long getId() {
				return id;
			}

	
	
	@Override
	public String toString() {
		return "Servicios [Id=" + id + ", nombre=" + nombre + ", descrpcion=" + descripcion + ", imagen=" + imagen + "]";
	} //toString


	public void setDescripcion(String descripcion) {
		// TODO Auto-generated method stub
		
	}


} // class
