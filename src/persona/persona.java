package persona;

import java.util.Date;

public class persona {

	private String NombreCompleto;
	private int Edad;
	private char Genero;
	private Date FechaNacimiento;
	private String Correo;
	private Long id;	
	
	public class persona() {
		
	}
	
	public class persona(String NombreCompleto,int Edad,char Genero,Date FechaNacimiento,String Correo,Long id ){
		this.NombreCompleto=nombrecompleto;
		this.Edad=edad;
		this.Genero=genero;
		this.fechaNacimiento=fechanacimiento;
		this.Correo=correo;
		this.id=id;
	}
	public String getNombreCompleto() {
		return NombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public char getGenero() {
		return Genero;
	}
	public void setGenero(char genero) {
		Genero = genero;
	}
	public char getDate() {
		return Date;
	}
	public void setDate(char date) {
		Date = date;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getLong() {
		return Long;
	}
	public void setLong(String l) {
		Long = l;
	}
	
	
	
	
}
