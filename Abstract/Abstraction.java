abstract class Shape{
  abstract void numberOfSides();
}

class Rectangle extends Shape{
  void numberOfSides(){
    System.out.println("4 Sides");
  }
}
class Triangle extends Shape{
  void numberOfSides(){
    System.out.println("3 Sides");
  }
}
class Hexagon extends Shape{
  void numberOfSides(){
    System.out.println("6 Sides");
  }
}

public class Abstraction{
  public static void main(String[] args){
    Rectangle rectangle = new Rectangle();
    rectangle.numberOfSides();
    Triangle triangle = new Triangle();
    triangle.numberOfSides();
    Hexagon hexagon = new Hexagon();
    hexagon.numberOfSides();
  }
}