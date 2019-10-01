package Equipo7_Practica7;
public class Cilindro extends Circulo{
  private double altura;

  public Cilindro(){
  }

  public Cilindro(int valorX, int valorY, double valorRadio, double altura){
    super(valorX, valorY, valorRadio);
    setAltura(altura);
  }
    
  public void setAltura(double x){
    altura = x;
  }
    
  public double getAltura(){
    return altura;
  }
  public double getAreaC(){
    return Math.PI * radio * radio * altura;
  }
}
