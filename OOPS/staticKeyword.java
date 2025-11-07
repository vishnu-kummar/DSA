package OOPS;

public class staticKeyword {
    public static void main(String[] args) {

       // Teachers.numberOfTeachers = 100; isse bachne ki liye hum static ke aage private laga dete hai. toh iske liye geetr bana ddenge so that atleast value 
       // access kr sake.

        Teachers t = new Teachers("vikash", "cse");
        System.out.println(t.numberOfTeachers);

        Teachers t1 = new Teachers("vikash", "cse");
        System.out.println(t1.numberOfTeachers);

        // kyuki numberOfTeachers static hai/class la vriable hai toh ise class name ke through v acces kr sakte hai, whi hum dori property
        // jaise name acces karn achahe like this --> Teachers.name toh eror aaega [kyuki non static variable can't be acces without creating object],
        //  see below line
        System.out.println(Teachers.numberOfTeachers); // pr static hone ki wajah se ye v ho skata hai hum object banaye bina value assign kr de jaise
        // numberOfStudent attribut me value saaogn krde 100. jo ki gallat ho jaega. see above example

    }
}
