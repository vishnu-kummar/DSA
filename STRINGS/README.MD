--> Basically character array is our String i.e. char[] arr = new char[];

# INTERNING [to save space] -> [but-we-can-avoid-interning-using-new-keyword]
String str = "hello"
String gtr = "hello"

technically it should allocate two variable and  in both places store "Hello" value [but] in reality it does create
2 variable but store hello in one varibale and in next it just point the first variable (memory ke andr
baar-baar hello nhi banega) [this-was-the-case-in-Array-as-well]
int[] arr = {1,2,3} and int[] brr = {1,2,3} toh memory ek hi array ke liye create hui doosri variable bs pehke ko point kr rahi hai

1. Note: agr hum String str = new String("Hello") -> toh ab point nhi bhone waala asal me hello ki mmeory banegi


# IMMUTABILITY
-> hum string ko change nhi kr sakte hai bs usko reference change kr sakye hai
        String s = "abc";
        System.out.println(s);  //abc
        s = "def";
        System.out.println(s); // def     [ab s bs "def" ko point krne laga "abc" me koi changes nhi aayi]


# PERFORMANCE OF STRING  [can-be-increaded-by-string-builder]
poor performance --> due to --> immutability [kyuki hum baar-baar copy bana rahe hai actual me koi chnages nhi aa rahi hai]

String s  =  "a"
       s +=  "b";
       s +=  "c";
--------------------
       s -|-|- "a"
       |\
       | \--|-|-"ab"
       |
       "abc"
pehle string bani a phir new string bni "ab" phir nyi string bni "abc"       