COLLECTION FRAMEWORK?
--> collection is a group of similar object
--> frameork is a unified structure to do something
--> java ke jo collection hai use standard tarike se represent aur manipulate karta hai collection framework.
--> collection framework me ek set of predifed classes and interface available hote hai [interface:-Blueprint-of-class,only-method-declaration-not-body],
    also, interface ke andr saare ke saare function abstract hote hai[yani-ki-body-define-nhi-hoti-hai]

                                            COLLECTION FRAMEWORK
                                                    /  \
                                                   /    \
                  [only-one-data]  COLLECTION INTERFACE    MAP INTERFACE       [Key-Value-pair]
                                                |                /  |  \
                                                |               /   |   \
                                                |        HASHMAP  LINKED  SORTED MAP
                                                |                HASHMAP      |
                                                |                             |
                                                |                         TREE MAP 
                                                |
                                                |
                                                |    
                    ____________________________|_________________________________
                    |E                          |E                                |E
                 LIST INTERFACE           QUEUE INTERFACE                    SET INTERFACE 
                    |                          |                                  | 
                    |                          |      ____________________________|__________________________________
                    |-Arraylist                |      HASHSET 0(1)             LINKED HASHSET             SORTED SET 0(logn)
                    |-LinkedList               |      -> unordered              -> ordered of insertion             |
                    |-Vector                   |      -> unique                 -> linkedlist + hashtable        TREE SET
                    |   |E                     |      -> hashing internally                                     -> sorted order 
                    | Stack                    |                                                             -> self - balancing
                                               |                                                             -> BST
                                  _____________|______________                                               -> red tree
                                 |             |             |
                        Linked List   Priority Queue    Dequeue [sub_interface]          
                                       -> not fifo                          |______implemt using Array Deque     
                                       -> priority based processing



# METHODS OF COLLECTION INTERFACE
-> add()
-> clear()
-> Contains(object o)
-> equals(object o)
-> remove(onject o)
-> size ()   etc. refer docientation.
These methods are availabe to every class which comes inside colection interface like stack,lineldist,arraylist.

# queue ke function ko hum use 
  linkedlist aur prioroty queue class --> queue interface ko implement krti hai , ab queue ke kuch methods hai jaise offer(),peek(),poll().
  -> since queue interface ko implemt krne ki liye linkedlist class ka use kiya jata hai ,is wajah se hum queue ke function ko linkeldist ke sath use kr
  skte hai, although linkedlist ke pass pane methods hai. 
  --> linkedlst banake as a queue use kr skte hai.

# priority queue
--> priority based on use case:
let say ek money lender use money dena hai 4 log aage one by one pehle "A", then "B", and so "C","D".
ab wo money pehle ksie de here fifo won't work , priority will. --> person having less debt
ley say "C" ke pass sbse kam debt hai toh "C" ko phle money milega .
--> by default prioriy queue jo hoti hai wo min queue hoti hai means wo chote number ko jyada priority deti hai. yani ki first position hamesha
    lower number occupy karegi . 

--> By default min priority queue hoti hai but we can make max priority ques as well by by using Comparator.reverseOrder()    

# deque which is sub interface, -> implemet using class array Deque
--> ab tak queue me hum rear end se entry aur frontEnd se exit hota tha.
--> pr array deuque me jo ki doubly queue hai usme rear se --> entry,exit &&  front se --> entry,exit. dono posssible hai. this  is doubly ended queue
    called as deque.deque interface ko implembt krne wali class hai array deque.

# SET INTERFACE
--> sorted set which is implemnt by class treeset
--> classes hashset,linkedhashset,treeset are usewed to implemnt set interface. Note : sorted set is a subclass which consiit of class treeSet 
    to implemnt set interface.  
-> set is basically a collection of non dupliacte element
--. in terms of time complecity hashset is best, after that linkedhashset, after that sorted set