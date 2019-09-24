package Equipo7-Practica7;

public class Punto{
  protected int x;
  protected int y;
  
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
    return "["+getX()+", "+getY()+"]";
  }

public class Circulo extends Punto{
  private doube radio;
  
  public  Circulo(){
  }
  
  public Circulo(int valorX, int valorY, double valorRadio){
    super(valorX, valorY);
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
  
  public class Cilindro extends Circulo{
    private int altura;
    
    public int setAltura(int altura){
      this.altura = altura;
    }
    
    public int getAltura(){
      return altura;
    }
    public double getArea(){
      return Math.PI * radio * radio * altura;
    }
}
