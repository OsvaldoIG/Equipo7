public class RelacionJerarquica{
  public static void main (String[] args){
    Punto punto = new Punto(30, 50);
    //Circulo circulo = new Circulo(120, 89, 2.7);
    Circulo circulo = (Circulo)punto;
    
    System.out.println("Llamado a toString de Punto con referencia a la superficie"
    +"apuntando al objeto de la superclase:\n"+punto.toString());
    
    System.out.println("Llamado a toString de Cicrulo con referencia a la subclase"
    +"apuntando al objeto de la subclase:\n"+circulo.toString());
    
    Punto refPunto = circulo;
    System.out.println( refPunto.toString());
  }
}
