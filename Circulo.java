package Equipo7_Practica7;

public class Circulo extends Punto{
  private double radio;
  
  public  Circulo(){
  }
  
  public Circulo(int valorX, int valorY, double valorRadio){
    x = valorX;
    y = valorY;
    setRadio(valorRadio);
  }
  
  public void setRadio(double valorRadio){
    radio = (valorRadio < 0.0 ? 0.0 : valorRadio);
  }
  
  public double getRadio(){
    return radio;
  }
  
  public double getDiametro(){
     return 2 * radio;
  }
  
  public double getCircunferencia(){
      return Math.PI * getDiametro();
  }
  
  public double getArea(){
    return Math.PI * radio * radio;
  }
  
  public String toString(){
    return "Centro = ["+x+", "+y+"]; Radio = "+radio;
  }
}
