package Equipo7_Practica7;
public abstract class Animal{
  public abstract String getName(); 
}

class Flamingo extends Animal {
  public String getName() {
    return "Flamingo";
  }
}

class Bird extends Flamingo{
}



}
