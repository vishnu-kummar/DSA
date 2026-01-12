# STACK
--> insertion ho ya deletion dono --> front end se ho hoga yani ki ek hi rasta hai.
--> stack works on priniple -> LIFO/FILO.
eg: kafi saari plates rakhi hui hai 1 ke upar 1, aur hame let say niche wali plates uthani hai ek hi rasta hai --> uske upar waale plates ko
    hatao aur us tak pahucho.....
--> 3 operation
1. PUSH --> insertion, timeComplexity -> O(1)
2. POP  --> deletion ,                   O(1)             --> of topmost element
3. PEEK  --> retrieval of only that elelment which is present at the top of stack   O(1)

--> other operation
* SIZE()
* isEmpty()  --> return boolean
* isFull()  --> generally full nhi hoti but ek limit hoti hai uske baad error aaega --> STACK OVERFLOW 

--> if we don't push any element and print the stack then entry stack will print like this --> []
NOTE: though push,pop,peek is O(1) but since it works on LIFO if there are n elelemnt and we need to find access first elelmt, --> then timeComplexity
      would be O(n);
      

# ADVANTAGES:
--> size is unlimited push & push & push --> there is no limitation unlike array where size is fixed, unlike arraylist where if arraylist is full->
    it doubles it size dynamically.

get________T.C_______S.C__
ARRAYS     O(1)      O(1)       
LL         O(n)      O(n)
STACK      O(n)      O(n)    --> space is also order of n because let say if there are 4 elelmts in stack & you wan to access any element
                                 other than topmost elelmt --> then you need to peek those ellemnt who are above that particular elelment
                                 and put somewhere like array,arraylist etc.. Which obviously takes some space. that is the problem but we 
                                 actually don't consider this as a problem --> we treat as a discipline kyuki hum kuch aisa karna chahenge 
                                 jo ki hamesha top pr rahe kuiki topmost ellemt ki timeComplexity hamesha order of 1 hogi.


# [STACK-IS-ALSO-PASS-BY-REFERENCE]

let say hamare stack "st" me kuch value hai. humne "st" ko kisi function "displayFun(st)" me pass kiya -> aur us function me st me kuch cghange kiya toh
original stack "st" me v chnage hoga. see below:-

public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
            st.push(10);
            st.push(32);
            st.push(5);
            st.push(20);
   System.out.print(st)  // [10, 32, 5, 20]
   displayFun(st)
   System.out.print(st)  // [10, 32, 5,20, 999]
}     

    static void displayFun(Stack<Integer> s) {
            s.push(999);
    }

ouput: []  

# [UNDERFLOW]
--> error {empty stack exception} occured when you try to perform pop/peek operation on an empty stack.

# [OVERFLOW]
--> if stack is full --> on performing push operation --> error {stack overflow} occured.
--> overflow is occured only if actual memory i.e computer's memeory is full --> which is rare.
--> it also occured when you use stack of you own implementation [using-array/linkedList/queue] as there --> you need to fix the size of your stack.

# ADVANTAGE OF ARRAY IMPLEMENTATION OF STACK OVER LINKED LIST
1. size --> for every element --> space taken is one block but in [LL] it is node[which-consist-of-two-block-value_&_address]
--> choose array if you want you stack to be fixed size........
2. display -> O(1)

# [Disadvantage of array]
--> size is fixed here --> overflow
--> space can be underutilized --> let say we make array of size 100 --> but we only took 10 space. 

# ADVANTAGE OF LL IMPLEMENTATION OVER STACK
--> unlimited size

#[DISADVANTAGE OF LL]
1. size --> two data memember
display --> reverse --> space complexity[it uses call stack] -> O(n)

# INFIX EXPRESSION
 let say we have x = 9 - 5 + 3 * 4 / 6    
 -> evaluation is done on [heirarchy of operator] or precdence or simply BODMAS --> Divison,Multiplication > Addition,Subtraction --> which means
    precedence of [*,/>+,-]. but it's not like division should be done before multiplication -> because if we done omn above case becomes 0.
 -> this   [*,/>+,-] means  Divison aur Multiplication ki same precedence hoti hai. jaise addition aur subtraction ki hai.  but multiplication 
    aur divison ki precedence jyada jrur hoti hai + aur - ki comparison me.
NOTE: jab equal precendce hoti hai toh hum LEFT to RIGHT jaate hai.

-> above exmaple me since precedence of * and / is higher we'll consider this 3 * 4 / 6 portion first. --> but *,/ is same so we'll consider
   left to right i.e 9 - 5 + 12 / 6
                     9 - 5 + 2
                     4 + 2
                     6
-> intereserting thing is all this process is done by computer . question type will be we have given this infix expressioin in string format like this:     "9 - 5 + 3 * 4 / 6  "   -> now find answer    

# PREFIX EXPRESSION

infix           = a+b
-> it's prefix  = +ab
-> it's postfix = ab+

let say infix = 9 - 5 + 3 * 4 / 6
        prefix: 9 - 5 + * 34 / 6
                9 - 5 + /* 346
                - 95 + /* 346
                +- 95 /* 346

        infix = 9 - (5 + 3) * 4 / 6        
       prefix = 9 - + 53 * 4/6
              = 9 - *+ 534 / 6
              = 9 - /*+ 5346
              = -9 /*+ 5346

        pre: o V1 V2      

# POSTFIX EXPRESSION

infix           = a+b
-> it's prefix  = +ab
-> it's postfix = ab+

let say infix = 9 - (5 + 3) * 4 / 6
      postfix = 9 -  53 +   * 4 / 6
                9 -  53 + 4 * / 6
                9 -  53 + 4 * 6 /
                953 + 4*6 /- 
                 
       pre: v1 v2 o          