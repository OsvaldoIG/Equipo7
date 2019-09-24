public abstract class Animal{
  public abstract String getName(); 
}

public class Bird extends Animal{
}

public class Flamingo extends Bird {
  public String getName() {
    return "Flamingo";
  }
}
