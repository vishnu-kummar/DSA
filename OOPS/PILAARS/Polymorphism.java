package OOPS.PILAARS;

public class Polymorphism {

static class student{
    String name;
    int roll;


    // humne 3 function banaye , tino same naam se , ise hi polymorphism bolte hai  , same function ko alg alg chizo ke liye use kr liya
    // use case ye ho sakt ahai ki user sirf wk function ko call  karega aur uske andr koi value dalega, value jis tarah ki hogi us function me jaegi.
     
void print(String name){
      System.out.println(name);
}

  void print(int roll){
      System.out.println(roll);
}

  void print(String name,int roll){
      System.out.println(name+ " "+ roll);
}


}

    public static void main(String[] args) {
        student s = new student();
        s.print("Vishnu");
        s.print(60);
        

    }
}
