import mx.unam.fi.ejercicio2.Tiempo;
public class ClienteTiempo{
	public static void main(String[] args){
		Tiempo tiempo = new Tiempo();
		System.out.println(tiempo.toUniversal());
		tiempo.toStandard();

		tiempo.setHora(9,54,56);
		tiempo.toUniversal();
		tiempo.toStandard();

		tiempo.setHora(81,66,702);
		tiempo.toUniversal();
		tiempo.toStandard();
	}
}
