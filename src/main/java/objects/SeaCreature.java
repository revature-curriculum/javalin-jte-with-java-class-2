package objects;

public class SeaCreature {

  String name;
  int size;
  String color;

  public SeaCreature(String name, int size, String color){
    this.name = name;
    this.size = size;
    this.color = color;
  }

  public String getName(){
    return name;
  }

  public int getSize(){
    return size;
  }

  public String getColor(){
    return color;
  }
    
}
