# built in  DATA TYPE:-
--> int, float, double, char, string

# what if we have a data type which can store multiple thing [user-define-data-type]
-> CLASS: ek aisi chiz jisme multiple object/entitiy ho jisme kuch particular  property common ho, toh uske blueprint ko class bolte hai.
  --> jaise 50 student hai ek class me . student ki kuch property hongi jaise roll,name,percentage. ab ye property saare student me common hai.
   -> name ke hiye string array lena padta. lly roll --> int[] , percentage --> double[] aur phir in sbko jdona pdta isiliye hamare pass class aur object
      ka concept aaya.

-> OBJECTS are real life entities [They-are-instance-of-class] while classes are blueprint jo ki exist nhi krti bs ek tarika hot ahai categorize krne ki.  
-> classes are pass by reference

# NOTE:-
 Student s1 = new Student(); 
   s1.name = "Vishnu";         
   s1.name = "Kumar"; 
--> toh yaha pr name update hoke vishnu se kumar ho jaega.

-> PASS BY VALUE: value chnage nhi hoti

# [FILE-NAME]
--> hum ye v kr sakte hai ki class ke name se file bana le aur bs uske object se kaam chaa skte hai.

# [DEFAULT-VALUES]
jaise let say humne object create kiya pr values nhi fiye toh int ke liye defaulrrt value 0 hogi, float --> 0.0, String --> null

# ACCESS MODIFIER
1] Public  - all package --> kisi me package me jao aur acces karo hoaega but attribiye ke aage v public lagani hongi.
2] Private - same class --> jaise humne kisi class ko doosre file me define kiya aur us file ki jagah, doosre file se acces krenge toh error aaega  
3] Default - same package  --> agr hum kuch na like toh woh default ke andr aaegi aur use same package me khi v use kr skate hai. bahar nhi.

--> access naam se samjh aata hai ki kisi ko access dena / permission grant . 
--> public,private,default ya sb keyword hai , aur v keywords hai jaise new etc.

# [GETTER-SETTER]  --> enemy og access modifier
--> getter and setter are basicall function of a class
--> jb chize i.e attributes private ho aur hum chahte hai ki atleast access kr sake , kyuki private ko hum na change kr skte hai na hi access kr sakte hai,
     not even print.
--> jb hum ye chahte hai ki koi attribute private toh ho but atleast acces ho sake us case me getter function banate hai, aur hum chahte hai ki attrivute ko change v kr sake toh setter banate hai.     

# [THIS-KEYWORD]
--> jaise function ke through humne jo variable accept kiya uska naame aur jo attribute class me pehle se define hai unka naame --> agr dono same hai,
   toh compiler ke liye differntiate karna muskil ho jata hai kaun sa attribute hai aur kaun sa function ke through aaya / argument  --> iske liye this keyword aata hai. 
--> this current class ko refer karta hai.

# [CONSTRUCTOR]
  jaise humne student class banaya aur --> use value put krne ke liye object banaya aur phir baar-baar --> dot operator ka use karke --> attribute access 
  krte the.
  --> agr ise ek single line me karnah ia uske liye constructor ka use hota hai.
  --> name of constructor should be same as the name of class with no return type not even void.

# [FINAL-KEYWORD]  
--> let say we have any attribute, ek aisa common atribute jise hum chahte hai , us class ke kai saare object bana de toh wo wale attriute ko koi change/
    manipulate na kar sake. toh attribute ke aage hum final keyword laga denge.
eg: jaise schoolname hai agr hamne student class me schoolname = "dps" kr diya toh jitne v object banenge waha pr schoolname ki value dps hi hogi,
    koi change nhi kar sakega.
--> ye private ki tarah nhi hai kyuki private ko hyum getter,setter se access/change kr sakte hai pr final ko hum getetr / setter change nhi kar skate.

# [STATIC-KEYWORD]

jaise humne ek clas banaya teacher --> aur hume check krna hai, kitne number of teacher hai. toh hum ek sttribute banaenge i.e int numberOfTaecher; aur 
jb v ek object banaenge is attribute ko  constructor me increment kr denge i.e  numberOfTeacher++
--> pr aisa krne se kbhi v value 1 se jyada nhi badegi despite of creating mutiple objects kyuki "numberOfTeacher" ekk attribute hai new object bante hi
    wo ek space legi aur us space ki value 1 hi jaegi.
--> so what we want is --> we don't want ki yeh individuLLAY saare objevvt me numberofteacher block bane, bus ek single block ban jaye aur khud
    hi update hoti rahe, jaise koi nyi object bane.
--> It means jo numOfTeacher ho wo class dependent ho na ki object depndnt , in above case it is object dependent -> for this we use [STATIC] keyword.        
    like this :- static  int numberOfTeacher; 

    static class teacher{
        String name;
        String department;
        static int numberOfTeacher; 
    }

-->    agr yaha pr dekhe toh object bante hi 2 dabbe banege na ki teen , kyuki static keyword lagate hi numberOfTeacher class dependent ban gaya.
--> static variable ko hum global variable v bolte hai.

* {STATIC-FUNCTION]
--> jaise static varibale shared hai jo ki object ka nhi class ka vriable hai.
-> When you make a method static, it means that the method is also class-dependent and not object-dependent.
-> A static method can be called directly on the class without needing to first create an object of that class.

-> eg:
public class RocketShip {
    
    public static int shipCount = 0; 
    private int shipID;
    
    // Static Method: Can only access other static members.
    public static void launch() {
        // ✅ Can access static variable
        System.out.println("--- Fleet Command ---");
        System.out.println("Ready to launch the " + shipCount + " rockets.");
        // ❌ Cannot access non-static 'shipID' here!
    }
    
    
   
    public void fly() {
        System.out.println("Ship ID " + this.shipID + " is flying now.");
        System.out.println("Total ships tracked: " + shipCount);
    }
    
-----------------------------------------------------------------------------

    public static void main(String[] args) {
        
        // 1. Calling the STATIC method using the CLASS name (no object needed)
        RocketShip.launch(); 
        // Output: Ready to launch the 0 rockets.
        
        // 2. Creating objects
        RocketShip apollo = new RocketShip();
        RocketShip gemini = new RocketShip();
        
        // 4. Calling INSTANCE methods using the OBJECT reference
        apollo.fly();
        gemini.fly();
      
    }
}



