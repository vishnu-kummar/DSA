WHAT IS HASHMAP?
--> Hashmap ek dataStructure hai jo ki [key<->Value] ki mapping ke form me data ko store krta hai. 
--> the pair of [key&value] is called entry.
eg: let say ek speaker store hai & we want to store price of different types of speaker
      
      SPEAKER |  PRICE
      jbl     |  20,000
      Pulse   |  10,000             [Key(speaker) Value(price)]
      Flip    |  25,999

eg : Frequnecy mapping ke liye v use ho skta hai --> to count frequency of each item etc.

NOTE: we can store key - value in array as well by creating two diffrent array [1st_for_KEY_&&_2nd_for_VALUE] but let say we want to delete any element,
     and if we delete than we need to shift all the element in key and value as well. It's possible but after messing with time complexity O(n).
     BUT:
     --> searching,insertion,deletion,find --> These all operation are possible in constant time complexity i.e O(1) which was O(n) in array (because we
         need to traverse whole array ).

Hashmap is a class in collection framework jo ki MAP INTERFACE ko implement krti hai. map interface allow us to implemet key - value storage.
map interface ko implement krne wali kuch classes hai jaise ki hashmap class, linked hashmap class, sorted map class [implemnted_by_treeMap] etc. 

                        COLLECTION FRAMEWORK
                             /  \
                            /    \
            COLLECTION INTERFACE    MAP INTERFACE
                                        /  |  \
                                       /   |   \
                                HASHMAP  LINKED  SORTED MAP
                                        HASHMAP      |
                                                     |
                                                  TREE MAP  

--> HASHMAP uses hastable to store data but it is unordered. jaise ki humne pehle store kiya [1,20] aur baad me store kiya [3,40], toh iski koi guarantee nhi hai ki [1,20] pehle place pr mile.

--> LINKED HASHMAP: uses linkedlist + hasmap to store data . therefore you store [1,20] in first place, you will always find this data in first place

--> TREE MAP: they maintain order using sorting while storing data. sorting according to keys.

NOTE: HASMAP will give you best performance. key aur value dono ki datatype alag v skti hai, smae v ho skti hai.

--> To access a value one must know its key
--> Hashmap doesn't allow duplicate keys but allows duplicate value . That means a single key can't contains more than 1 value but more than 1 key can contains single value.
--> Hashmap allows null key also but only once & multiple null values
--> Java Hashmap maintains no order.
# Applications
--> Frequency count, Dictionary, Phonebook, Mapping problems, Storage optimization

# METHODS
1. PUT() --> insertion, updation (if already present)
2. GET() --> fetch/get value, null [if_not_present]

# INTERNAL WORKING
Addition/Insertion |
Removal            |         O(n)
Search/Retrieve    |
Contains           |

--> hashing means kisi v arbitrary size key ko convert kr dena smaller size key me jise Hashed key/hash value/si bol sakte hai using hash function.
--> hash function kuch v ho skta hai let say H(k) = k % M where M is table

___________________
0   |   Key,Value  |
1   |    109,2     |
2   |              |                                let say hamare pass data hai (109,2) (210,10) (338,5)  --> [Key,Value] ke form me 
3   |    210,10    |                                aur hume ise insert krna hai table me . we have .put() 
4   |              |                                H(k) = 109 % 9 => 1     
5   |    338,5     |                                H(k) = 210 % 9 => 3    
6   |              |                                H(k) = 338 % 9 => 5
7   |              |                                ab jo value aayi use slot index bolte hai . kyuki usi index pr hum data ko store krne wale hai. Ye hamara put 
8   |              |                                operarton ho gya. Agr put ke time complexity ki baar kre toh - hum key/mila humne hash function use kiya jo ki ek mathematical
                                                    operation hai/constatnt time operation hai. jisse hume slot index mil jata hai. phir hum apne table me key aur value ko store
                                                    kr dete hai. jo ki insertion v constant time me hi ho raha hai. yani ki hash function aur insertion dono constant time.
--> usi trike se get kaam krta hai - property hai ki same input ke liye same output dega --> svi me hash function use hoga [get/put/contains/remove]                                                    


--> Property of hash function:
   1.ye hamesha same input ke liye same output dega.
   2.ek perfect hash function :- always produces unique oputput for unique input.
   3.ek non-perfect hash function :- collison kra sakta hai i.e same outpt for unique input / multiple input produce same ouput.

# GENERALLY USED HASH FUNCTION
1. Division method
--> h(k) = k mod M

2. Mid Square Method
--> h(k) = h(k*k)

3. Digit Folding Method
k = k1,k2,k3...kn
s = k1 + k2 + k3 +...+ kn
h(k) = s

4. Multiplication method
h(k) = floor(M(kA mod 1))

# COLLISIONS
--> Sometimes, hash function can result in same hash value for different keys.
   eg: let say hash function hai hamara k % m, whre m = 9
      k = 20 % 9 = 2
      k = 29 % 9 = 2
      k = 38 % 9 = 2
--> yaha ye dekha ja skta hai ki 3 different key --> ki vlue 2 hi aa tah ahai 

NOTE: hume koi v entry milti hai toh hum sbse pehle key ho hash krte hai using hash function --> jisse hume index milta hai. aur us index pr hum hash table/bucket array me entry     ko     store krte hai.
-> array ke kis index me key value ko store krna hai , yeh hume hash function se pta chalta hai.
-> hash table basically array of node hai jisme key,value hai.

--> Problem caused by collision , we can't can't place more than 1 key on smae index

[key,Value]    [H(k)=k%M]                0|                  
   [7:1]         7 % 9 = 7               1|
   [11:2]        11 % 9 = 2              2|  11 , 20 , 29, 38
   [14:3]        14 % 9 = 5              3|
   [20:4]       20 % 9 = 2               4|
   [23:5]       23 % 9 = 5               5|  14, 23
   [29:6]       29 % 9 = 2               6|
   [38:7]       38 % 9 = 2               7|  7
                                         8|

                                                               Collision Resolution Techniques:
                                                        _______________________|_______________________________
                                                        |                                                      |
                                                  Chaining (open Hashing)                                Open Addressing (closed hashing)
                                                                                                            |              |           |
                                                                                                linear Probing    Quadratic Probing    Double hashing


# SEPARATE CHAINING [OPEN HASHING]
--> isme basically agr multiple key ek hi index pr aana chahte hai , toh thik hai rakh lete hai.
--> but pehle array of nodes<Key,value> the, ab ise array of linkedlist<Node<Key,value>>

[key,Value]     [H(k)=k%M]               0|        |           
   [7:1]         7 % 9 = 7               1|        |   _____      _____      ___
   [11:2]        11 % 9 = 2              2|        |-> |11  | ->  |20  | ->  |29| 
   [14:3]        14 % 9 = 5              3|        |
   [20:4]        20 % 9 = 2              4|        |
   [23:5]        23 % 9 = 5              5|        |
   [29:6]        29 % 9 = 2              6|        |
   [38:7]        38 % 9 = 2              7|        |
                                         8|        |

 --> toh basically hum ek node banate hai aur phir usme key,value add krte hai.
 --> add krne se pehle check hota hai whether it is already present or not ifyes--> toh naya node banane ki jagah purane wale node ki value update kr deta.
    if np --> then create new node an dinsert key,value
--> so everthing i.e put(),get(),remove() is working fine but the problem is with time and space complexity since we are traversing each time in all operation
--> SOLUTION:
   1. Good hash function
   2. More buckets/capacity[Usually_Double_size_of_array]
     -> when to double : Load Factor -> A measure that decides when to double array size. By deafult load factor is 75% of initial capacity in java hashmap.
                                         eg: let say N= Initial capacity [size-of-bucket] = 100 
          1/100,2/100,75/100 but 76/100      LF = 75% of capacitY
                                             jab tak elements > 75 ya 75 se kam hai tb tak size double nhi hoga, the moment elemnts ki size 75 se upr hui size of bucket
                                             double ho jaegi yani ki 2 * 100 = 200
      Threshold value[acceptable-no.-of-entries-before-capacity-is-double] = Load Factor * Capacity --> here, 0.75 * 100 = 75

   Conclusion: When the number of entries in the map crosses theh threshold value, A new bucket array is created and all the entries are copied from old array to new array.
   --> All this because we want constant time complexity     

   EG: Initial capacity (N) = 4
       Load Factor =  0.75 lambda                                 ___________
       Threshold value =  lambda * N = 3 -> later 6              0|__________|
       _________                                                 1|__________|->1
       |0|______|->1              \                              2|__________| 
       |1|______|                  \__Rehash___                  3|__________|->2
       |2|______|->2 ->3           /                             4|__________|
       |3|______|                 /                              5|__________|->3 ->4
                                                                 6|__________|
                                                                 7|__________|
                                                                 8|__________|
                                                                 
      since first one exceed the threshold value therefore it create a new bucket double of size. in first thresold value is 3. therefore only 3 ellement allow before doubling the 
      size. once size become four it double the size of hash table and again shift all the elemnts in new table in this process it may have to reallocate the value on new index.
      if you try to fill elemnt more than 6 then again it will double the size.
      in first fun. let say we were using H(f) = k % N [k%4]   but in new H(f) = [k%8]

Question: given a hash table T with 25 slots that store 2000 elelmnts. what is the load factor for T?
         2000/25 = 8

# OPEN ADDRESSING (CLOSED HASHING)

1. LINEAR PROBING: is bacche ka kehna hai ki, data store krne ke liye hum nya node ya linkedList nhi banaenge hum kya karenge ek nichenge jaenge aur usme sto0re krenge. let say index 3 aaya store krne ke liye, pr 3 already fill hai toh hum ek niche 4 pr aaenge aur usme fill kr denge [agr-wo-khali-hai-tbhi-otherwise-ek-aur-niche].
( H (k) + i ) % M where i is probe number / number of attempt [yani hi agr i=1 hai aur wo jgh already fil hai , toh 1=2].  M is size of bucket
--> linaer is liye kyuki hum linearly khoj rahe hai ek ke baad ek

2. QUADRATIC PROBING: is baar hum linear ki jgh --> i ki jagah i square pr fill krne ki koshish karenge.

3. DOUBLE HASHING: isme do hash function use krte hai. pehli baar koi ek hash function [let-say-H1(k)] use krte hai jb tak collision nhi hai . agr hua toh hum dusra hash function, [let-say-H2(k)] aur pehla hash function dono ke combination se ek naya hash function baante ahi aur usse jo naya bucket index milta hai uspe fill krte hai.