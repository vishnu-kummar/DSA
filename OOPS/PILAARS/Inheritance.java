package OOPS.PILAARS;

public class Inheritance {

   static  class Shape{
        String color;
    }

static class Rectangle extends Shape{

}

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.color = "Red";  // her ewe are able to access the property of class Shape by creating object of Rectangle class
    }
    
}
