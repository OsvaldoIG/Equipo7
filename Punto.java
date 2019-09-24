package Equipo7-Practica7;
222222222
public class Punto{
  private int x;
  private int y;
  
  public Punto(){
  }
  
  public Punto(int valorX, in valorY){
    x = valorX;
    y = valorY;
  }
  
  public void setX(int valorX){
    x=valorX;
  }
  
  public int getX(){
    return x;
  }
  
  public void setY(int valorY){
    y=valorY;
  }
  
  public int getY(){
    return y;
  }
  
  public String toString(){
    return "["+x+", "+y+"]";
  }

public class Circulo extends Punto{
  private doube radio;
  
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
