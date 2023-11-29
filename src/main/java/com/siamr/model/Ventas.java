package com.siamr.model;

public class Ventas {
	private Long Id;
	private Double precio;
	private String fecha;
	
	private static long total = 0;

	public Ventas(Double precio, String fecha) {
		this.precio = precio;
		this.fecha = fecha;
		Ventas.total++;
		this.Id=total;
	} // constructor
	
	public Ventas() {
		Ventas.total++; 
		this.Id= total;
		} // constructor2

	public Long getId() {
		return Id;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
	@Override
	public String toString() {
		return "Ventas [Id=" + Id + ", precio=" + precio + ", fecha=" + fecha + "]";
	} //toString
	
	
	
	
	
	
	

} // class
