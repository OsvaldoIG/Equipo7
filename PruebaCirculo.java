package Equipo7-Practica7;

import java.text.DecimalFormat;

public class PruebaCirculo{
  public static void main(String[] args){
    Circulo circulo = new Circulo(37,43,2.5);
    
    System.out.println("La coordenada X es " + circulo.getX());
    System.out.println("La coordenada Y es " + circulo.getY());
    System.out.println("La coordenada X es " + circulo.getRadio());
    
    circulo.setX(35);
    circulo.setY(20);
    circulo.setRadio(4.25);
    
    System.out.println("La nueva ubicacion y radio son: " + circulo.toString());
    
    DecimalFormat dosDigitos = new DecimalFormat("0.00");
    
    System.out.println("Diametro: " + dosDigitos.format(circulo.getDiametro()));
    System.out.println("Circunferencia: " + dosDigitos.format(circulo.getCircunferencia()));
    System.out.println("Area: " + dosDigitos.format(circulo.getArea()));
  }
}
