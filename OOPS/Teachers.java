package OOPS;

public class Teachers {
     String name;
    private int salary;  // private krte hi iss atribute ko hum is class ke bahar yani ki, is curly braces ke bahar use kr hi nhi skate.
    String department;
    static int numberOfTeachers; // since we want this attribute to be class dependent and make it a class property

public int getId(){  // this function is getter since we only get that attribute but can't vhange it.
    return salary;  // even though salary is private but still we are able to use it here because it is in same class.
}

public void setId(int salary){ // setter
    this.salary = salary;   // this keyword as attribute and the variable which is accpeted both name are same. 

    // this ye bata hai ki ye atrribute is class ki hai
}


public Teachers(String name,String department){
        this.name = name;
        this.department = department;
        numberOfTeachers++;
}


// agr hum umberOfTeachers ko static ke sath-sath private v kr dete like this:- private static int numberOfTeachers;  toh uske getter check below:
// also agr hum static function nhi banaege toh toh function object kre through access hoga, the momenet we make any function static --> that function
// will be able to access through class.
public int getNumberofTeacher(){
    return numberOfTeachers;
}




}
