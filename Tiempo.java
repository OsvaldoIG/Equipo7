package ejercicio2;
import java.text.DecimalFormat;

public class Tiempo{
	private int hora;
	private int minuto;
	private int segundo;

	public Tiempo(){
		setHora(0,0,0);
	}

	public void setHora(int h, int m, int s){
		hora=((h>=0 && h<24)?h:0);
		minuto=((m>=0 && h<60)?m:0);
		segundo=((s>=0 && h<60)?s:0);
	}
	public String toUniversal(){
		DecimalFormat dosDigitos = new DecimalFormat("00");
		return dosDigitos.format(hora)+":"+dosDigitos.format(minuto)+":"+dosDigitos.format(segundo);
	}
	public String toStandard(){
		DecimalFormat dosDigitos = new DecimalFormat("00");
		return((hora==12||hora==0)?12:hora%12)+dosDigitos.format(minuto)+":"+dosDigitos.format(segundo)+(hora<12?"AM":"PM");
	}
}
