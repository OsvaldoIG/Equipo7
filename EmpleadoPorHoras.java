package my.com.equipo7.nomina;
public classs EmpleadoPorHoras extends Empleado{
	private double sueldo;
	private int horas;

	public EmpleadoPorHoras(String nombre, String apellido, String numeroSS){
		super(nombre,apellido,numeroSS);
	}

	public String ingresos(){
		return "Sueldo: "+getSueldo()*getHoras();
	}
	public void setSueldo( double sueldo ){
		this.sueldo = sueldo;
	}

	public void setHoras( int horas ){
		this.horas = horas;
	}

	public double getSueldo(){
		return sueldo;
	}

	public int getHoras(){
		return horas;
	}
}
