package QUEUE.CIRCULAR_QUEUE;
/*
_______F_________                                                                                                 _____r_____f_________
|1|2|3|4|5|6|7|8|   -->     normal queue ko display karana easy tha loop lagao f --> r tak but in circular queue  |10|11|3|4|5|6|7|8|9|
                R  
                
 jo element include hone wo f --> r tak {5,6,7,8,9,10,11}.       
                
*/
public class arrayImplementation {

    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

     public void add(int val) throws Exception {
    if (size == arr.length) throw new Exception("Queue is full");
    
    if (size == 0) {
        front = rear = 0;
        arr[0] = val;
    } else {
        // This one line replaces your rear < length and rear == length logic
        rear = (rear + 1) % arr.length; 
        arr[rear] = val;
    }
    size++;
}

        public int remove() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            else  {
                int val = arr[front];
                if(front == arr.length - 1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            else return arr[front];
        }

        public void display(){
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            else if (front<= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            else{ // rear < front
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
        q.add(6);
        q.display();
        
    }
}
