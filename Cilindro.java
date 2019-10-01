public class Cilindro extends Circulo{
	private double altura;

	public Cilindro(){}

	public Cilindro(int x, int y, double radio, double valorAltura){
		super(x, y, radio);
		establecerAltura(valorAltura);
	}

	public void establecerAltura(double valorAltura){
		altura = valorAltura < 0.0 ? 0.0 : valorAltura;
	}

	public double obtenerAltura()
	{
		return altura;
	}

	// sobrescribir método abstracto obtenerArea para devolver el área de Cilindro 
	public abstract obtenerArea(){
		return (2 * Math.PI * obtenerRadio() * obtenerRadio()) + (Math.PI * obtenerRadio() * obtenerAltura());
	}

	// sobrescribir método abstracto obtenerVolumne para devolver vaolr del cilindro
	public abstract obtenerVolumen(){
		return Math.PI * obtenerRadio() * obtenerRadio() * obtenerAltura();
	}

	// sobrescribir método abstracto obtenerNombre para devolver "Cilindro"
	public abstract obtenerNombre(){
		return "Cilindro";
	}

	//sobrescribir toString para devolver representación String del Cilindro

	public abstract toString(){
		return "Radio = "+obtenerRadio()+" Altura = "+obtenerAltura();
	}
}
