# QUEUE 
--> queue is like bhai of stack...
--> jaise stack me push,pop,peek major operation hai whi queue me v hai bs naam alag hai. jaise add,remove/poll,peek/elelment.
--> queue works on the principle of --> FIFO/LILO
-> eg: jaise ticket counter -> let sya 5 log hai -> jo sbse pehle/aage me hoga use pehle ticket milega aur wo pehle hall me jaega.
--> toh queue ek aisa data structore hai jisme jis elelment ko pehle insert karenge use hi pehle nikla jaega.
--> yaha pr do end hote hai ek rear end --> jaha se insertion hoga. ek front end --> jaha se retrieval/deletion hoga.

          _____________________________
PUSH   ->  5     4     3      2       1  -> POP
 [rear]   _____________________________    [front]


# TYPES:-
1. QUEUE
2. DEQUOE
3. CIRCULAR QUEUE

# Advantage of Linked list implementation of queue over array implementation:
1. Unlimited size

# DisAdvantage of Linked list implementation of queue over array implementation:
1. Size ->LL has two mwmwbers

# CIRCULAR QUEUE
queue ki array implementation me problem ye thi ki let say array 8 size ki hai, aur hum 8 elememt bhar diya aur --> phir delete krna start
krte hai let say 3 element kiye [yani ki 0 bana diye] toh hamara front fourth element ko point karega. Ab hum element insert karenge toh nhi
hoga --> kyu bhai humne toh kuch element delete kr diye the ) yani ki space utilize nhi ho pa rhi thi
--> isko solve krne ke liye hum circular queue ko use karenge
-> jaise 9,10,11 ab add karna hai toh wo possible hai circular queue ke through
-> problem solved: i.e. agar rear hamara last index pr pahuch gya aur front pehle index pr nhi hai -> kyuki pehla element humne delete
   kar diya hai --> toh ab space ab bhara ja sakta hai.

_F_______________          _______F_________
|1|2|3|4|5|6|7|8|   -->    |0|0|0|4|5|6|7|8|   --inCircularQueue--> |9|10|11|4|5|6|7|8|
                R                         R