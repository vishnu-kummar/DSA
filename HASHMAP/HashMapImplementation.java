package HASHMAP;

import java.util.LinkedList;

public class HashMapImplementation {
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>(); // creating an object of class MyhashMap

        System.out.println("Testing put");
        mp.put("a", 1);
        mp.put("b", 2);
        mp.put("c", 3);
        System.out.println("Testing size: " + mp.size()); // Output: 3
        mp.put("c", 30); // Update key "c"
        System.out.println("Testing size after update: " + mp.size()); // Output: 3

        // Testing get
        System.out.println("\nTesting get:");
        System.out.println("Key 'a' value: " + mp.get("a")); // Should output: 1
        System.out.println("Key 'b' value: " + mp.get("b")); // Should output: 2
        System.out.println("Key 'c' value: " + mp.get("c")); // Should output: 30
        System.out.println("Key 'd' value: " + mp.get("d")); // Should output: null (Key not present)

        // Testing remove
        System.out.println("\nTesting remove:");
        System.out.println("Removing 'b', value: " + mp.remove("b")); // Should output: 2
        System.out.println("Removing 'b' again (not present), value: " + mp.remove("b")); // Should output: null
        System.out.println("Testing size after removal: " + mp.size()); // Output: 2
        System.out.println("Key 'b' value after removal: " + mp.get("b")); // Should output: null
         System.out.println("Testing size: " + mp.size()); // Output: 2
    }

    public static class MyHashMap<K, V> {

        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of key-value pairs
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        private void rehash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for(var bucket:oldBuckets){
                for(var node: bucket){
                    put(node.key,node.value);
                }
            }
        }

        private int HashFun(K key) {
            // Using a bitwise AND with 0x7fffffff to ensure the hash code is non-negative
            // This is safer than Math.abs for Integer.MIN_VALUE, though Math.abs is okay for most cases.
            int hc = key.hashCode();
            return (hc & 0x7fffffff) % buckets.length;
        }

        /**
         * Corrected: Uses key.equals() for proper object comparison instead of ==.
         */
        private int searchBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                // *** CRITICAL CORRECTION: Use .equals() for object comparison ***
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1; // Key not found
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchBucket(currBucket, key);

            if (ei == -1) {
                // Key not present, add new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                // Key present, update value
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            // (Note: Re-hashing logic is omitted but necessary for a proper HashMap)
            if (n > buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        /**
         * Corrected: Checks if the key was found (ei != -1) before returning the value.
         */
        public V get(K key) {
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchBucket(currBucket, key);

            // *** CRITICAL CORRECTION: If ei != -1, the key was found ***
            if (ei != -1) {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
            // If ei is -1, key not found, return null
            return null;
        }

        /**
         * Corrected: Checks if the key was found (ei != -1) before removing the node and returning the value.
         */
        public V remove(K key) {
            int bi = HashFun(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchBucket(currBucket, key);

            // *** CRITICAL CORRECTION: If ei != -1, the key was found ***
            if (ei != -1) {
                Node curNode = currBucket.get(ei);
                V val = curNode.value;
                currBucket.remove(ei);
                n--;
                return val; // Return the removed value
            }
            // If ei is -1, key not found, return null
            return null;
        }
    }
}