class queue{
    int size;
    int[] arr;
    int front,rear;
    queue(int size){
        this.size = size;
        arr = new int[this.size];
        front = rear = -1;
    }
    void enqueue(int data){
        if(rear == size-1){
            System.out.println("queue overflow");
            return;
        }
        rear++;
        arr[rear] = data;
    }
    void dequeue(){
        if(front == rear){
            System.out.println("queue underflow");
            return;
        }
        front++;
    }

}
public interface queuebyarr {
    public static void main(String[] args) {

        queue q1 = new queue(05);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(5);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();        
        q1.dequeue();        
        q1.dequeue();        


    }
}
