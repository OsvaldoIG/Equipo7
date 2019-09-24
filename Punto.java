package Equipo7_Practica7;

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
}
