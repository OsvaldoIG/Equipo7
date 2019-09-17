public class ClienteDatosPaquete{
	public static void main(String[] args){
		DatosPaquete datosPaquete = new DatosPaquete();

		String salida = "Despues de instanciar: "+datosPaquete.toString();
		System.out.println(salida);

		datosPaquete.numero = 77;
		datosPaquete.cadena = "Adios";

		salida += "\nDespues de cambiar valores: "+datosPaquete.toString();
		System.out.println(salida);
	}
}

class DatosPaquete{
	int numero;
	String cadena;

	public String toString(){
	return "numero: " + numero + ", cadena: " + cadena;
	}
}
