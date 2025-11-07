# WHAT ?
--> Hashset ek aisa data structure hai jo tb use kiya jata hai when we want uniqueness.
    jaise maths me v set hota hai , jisme duplicate ellement nhi daale jaate. Iski properry hi hiti hai uniqueness.

# WHY HASHSET ?
--> because similar to hashmap, hashset operations are also efficient.
   -> insertion,removal,updation all are done in constant time.
   -> all things include working are same as hashmap but here we only store one thing --> it can be key/value/anything --> but only one.

# WORKING
--> jis v value/key ko insert karna hai, use hash Function se paas karaenge, hash function se hash value milti hai . jo value mili us index pe jaake
    us data/key/value ko store kr do.

# HIERARCHY OF HASHSET

                                             COLLECTION INTERFACE
                    _____________________________|____________________________
                    |                            |                           |
                 LIST INTERFACE             QUEUE INTERFACE             SET INTERFACE 
                                                                                | 
                                                    ____________________________|__________________________________
                                                    HASHSET 0(1)             LINKED HASHSET             SORTED SET 0(logn)
                                                  -> unordered              -> order of insertion             |
                                                  -> unique                 -> linkedlist + hashtable        TREE SET
                                                  -> hashing internally                                     -> sorted order 
                                                                                                            -> self - balancing
                                                                                                            -> BST
                                                                                                            -> Red-blod tree

--> collection nterface ke andr set interface, -> set interface ko implememt krne wali 3 class hoti hai [hashset,linkedHashset,sortedSet]
--> hashset class as similar to hashmap it is also unordered, unique and internallhy hashing.

--> similar to hashset , there is another class linkedhashset where order of insertion is maintained.

--> sorted set interace is implemted by class tree set where there is sorted order