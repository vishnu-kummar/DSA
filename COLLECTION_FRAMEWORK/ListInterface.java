package COLLECTION_FRAMEWORK;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        ArrayListExample();
        LinkedListExample();
        StackExample();
    }

    static void ArrayListExample(){
        ArrayList<Integer> l = new ArrayList<>();
        // to add element in list --> .add()
        l.add(45);
        l.add(89);
        l.add(69);
        
        System.out.println(l);

        // to get/ retrieve ellement use --> .get()
        System.out.println("Index 1:"+l.get(1));  // index 1 value

        // to modify use --> .set()
        l.set(1,809);

        System.out.println(l);

        // to check whether any particular elelment is present or not use --> .contains()
        System.out.println(l.contains(69));  // if present -> return true
    }

    static void LinkedListExample(){

        System.out.println("Linked List Methods");

        LinkedList<Integer> l = new LinkedList<>();
        // to add element in list --> .add()
        l.add(45);
        l.add(89);
        l.add(69);
        
        System.out.println(l);

        // to get/ retrieve ellement use --> .get()
        System.out.println("Index 1:"+l.get(1));  // index 1 value

        // to modify use --> .set()
        l.set(1,809);

        System.out.println(l);

        // to check whether any particular elelment is present or not use --> .contains()
        System.out.println(l.contains(69));  // if present -> return true
    }

    static void StackExample(){

System.out.println("Statck methods");

        Stack<String> s = new Stack<>();
       // s.add("lambda")
        s.push("pw");
        s.push("skills");
        System.out.println(s.peek());  // topmost element --> skill not pw;
        System.out.println(s.pop());  // first read then remove topmost element i.e skill
        System.out.println(s.peek()); // since skill is removed so pw will be topmost elelemet
        System.out.println(s.size()); // 1
        System.out.println(s.empty()); // check whrther sttack is empty or not here it is false.
    }
}
