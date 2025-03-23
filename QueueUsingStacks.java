import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> enqStack;
    Stack<Integer> deqStack;

    QueueUsingStacks(){
        enqStack=new Stack<>();
        deqStack=new Stack<>();
    }

    void push(int data){
        enqStack.push(data);
    }

    //pop and return front element of queue
    int dequeue(){
        if(deqStack.isEmpty()){  //if empty then transfer elements from eng to deq
            while(!enqStack.isEmpty()){
                deqStack.push(enqStack.pop());
            }
        }
        if(deqStack.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        return deqStack.pop();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return enqStack.isEmpty() && deqStack.isEmpty();
    }

    //peek at front element
    int peek(){
        if(deqStack.isEmpty()){
            while(!enqStack.isEmpty()){
                deqStack.push(enqStack.pop());
            }
        }
        if(deqStack.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        return deqStack.peek();
    }

    public static void main(String[] args) {
        QueueUsingStacks queue=new QueueUsingStacks();
        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.dequeue()); // Output: 10
        System.out.println(queue.peek());    // Output: 20
        System.out.println(queue.dequeue()); // Output: 20
        System.out.println(queue.dequeue()); // Output: 30
        System.out.println(queue.isEmpty()); // Output: true
    }
}
