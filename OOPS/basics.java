package OOPS;

public class basics {

    // craeting a new data type name Student
    static class Student{
        String name;
         int roll;
        double percentage;
        final String schoolName = "dps";  // using final keyword

        public Student(String nam,int roll,double per){   // construtor, hum do parametr wala v constructor bana sakte hai. 
              name = nam;           // is contructor ke banate hi hamara default constructor hat jata hai aur parenthesis khali chorne pe error aata hai.
              this.roll = roll;
              percentage = per;
        }

         public Student(){
        //   // this is deafult contructor, agr parenthese khali chorna chahte hai toh parametrized ke sath-sath default wala v banana hoga.
         }
    }

    static class Car{
        String name;
        int price;
        String type;
    }

    public static void fun(int x){
          x = 7;
    }
    public static void fun(Car c){
          c.name = "hyundai";
    }
    
    // Maa m = new Maa();     // [not possible Maa class was created inside main functoion, it can be access only inisde main function]

    public static void main(String[] args) {
           Student s1 = new Student();  // ye bante hi 1 space allocate ho gya s1 ka, na ki simply class define krne se space allocate/declaration hota hai.
           s1.name = "Vishnu";         // initilaization
           s1.name = "Kumar";    // updation value ab vishnu se kumar ho gaya.
           s1.roll = 60;
           s1.percentage = 7.5;
          // s1.schoolName = "ssp";  // error --> as schoolName is final can't be change.
           System.out.println(s1.name);  // to print the name

           Student s2 = new Student();
           s2.name = "Bholenath";
           s2.roll = 3;
           s2.percentage = 100.0;

    // NOTE: yaha pr s1, s2 ye object hue student class ke. jo ki student class ki property ko access kr rahe hai.
    //        eg: Scanner sc = new Scanner();   int x= sc.nextInt();  yaha pr scanner class ke object bananya hamne "sc" naam se aur dot operator use kiya
    

          Car c = new Car();
          c.name = "Alto";
          c.price = 400000;
          c.type = "hatchback";

          // avi tak humne jitne v class banaye sb main function ke bahar. KYA ye main ke andr v craete ho skt ahai ? --> YES but the problem is 
          // us class ko main function ke bahar acces nhi kr paenge jaise Maa class banaya aur uske object ko main ke bahar se acces krne ki kosish ki
          // to nhi ho paega 
           
          class Maa{
            String name;

          }

          Maa m = new Maa();
          m.name = "Maa khamakhya";

          // -> calling a function jaise hi humne ko integer ko pass kiya fun(x) me toh k naya intger form hua aur andr ki value ko change nhi kar raha
          //    this is pass by value. but agr hum yhi kaam array ke sath kare toh agr function me change hai toh yaha v change hoiga.
          int x = 6;
          System.out.println(x);
          fun(x);
          System.out.println(x);

        // aur class ke sath kare toh v chnage hoga kyuki clases are pass by refernce jaise
          System.out.println(c.name);  // humne c.name ki value alto rkhi hai aur use pass kiya fun me
          fun(c);
          System.out.println(c.name); // pr ab alto se change hoke hyundai ho gyi --> pass by refernce

          // hamne doose file ke andr Teachers class define kiya pr hum yaha v use kr skte hai kyuki package name same hai ,otherwise doosre packahe ko import
          //  karana padega jaise:
         // Teachers t = new Teachers();  // showing error because we have constructor of class teacher.
         // t.name = "BKLsingh";

    }
}
