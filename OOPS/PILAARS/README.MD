# [POLYMORPHISM]
poly:- many,  morphism;-forms
--> ek hi kaam ko alg-alg tarike se karna
--> TYPES:-
1. function overlaoding :- it is --> compile time polymorphism
  many function with same name created inside same class with differnt argument or return type.
2. function overwriting :- run time 


# [INHERITANCE]
ek class ki property jb koi doosri class leni chahti ho toh us process ko ingeritance bolte hai. 
inheritance se reuability badhti hai , let say ek app me kaffi saari button ho skti hai , pr hame button ki shape hamesha rounded rakhni hai, toh hum button ki shape ek hi baar define karenge aur saare button ki jo class hai wo use inherit kar lengi.
--> jis class se property li jaati hai use kehte hai base class/parent class. aur jo class propertry leti hai use sub class / child class kehte hai.

--> 5 types in C++, but 4 types in java because in java there is no such concept of multiple inheritance but here we have concept of interfaces.

1. [SINGLE LEVEL INHERITANCE}
--> ek base class aur ek drived class bs.

2. [MULTI LEVEL INHERITANCE}
-->ek se jayada leval as in one base class and multiple derived class
 class Shape{

  public void area(){

  }
 }

 class Triangle extends shape{
    public void area(int l, int h){
        syso(1/2 * l * h);
    }

 }

 class EquilateralTriangle extends Triangle{

 }

3. [HIERARCHIAL INHERITANCE}
ek hi base class aur multiple derived class.

 class Shape{

  public void area(){

  }
 }

 class Triangle extends shape{
    public void area(int l, int h){
        syso(1/2 * l * h);
    }

 }

 class circle extends triangle{

 }

 4. [HYBRID INHERITANCE}
 saare types included hote hai khi pr multilevel, khi pr hierachial .