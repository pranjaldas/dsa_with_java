import java.util.*;
public class StackMin {
    public Node head;
    public Node tail;
    public int size;
    public Stack<Node> minValues= new Stack<Node>();
    public void createStack(int value){
        Node firstNode = new Node();
        firstNode.value= value;
        firstNode.next= null;
        head= firstNode;
        tail= firstNode;
        size= 1;
        minValues.push(firstNode);
        System.out.println("\nStack is created with value: "+value);
    }

    public void push(int value){
        if(head == null)
            createStack(value);
        else{
            Node newNode = new Node();
            newNode.value= value;
            newNode.next = head;
            head= newNode;
            size++;
            if(getMin().value >= newNode.value){
                minValues.push(newNode);
            }
            System.out.println("\n"+value+" added succesfully");
        }
    }
    public Node getMin(){
        return minValues.peek();
    }
    public void pop(){
        if(head== null){
            System.out.println("\nThe stack is empty");
        }else{
            System.out.println("\n"+head.value+" poped sucessfully");
            if(getMin()==head){
                minValues.pop();
            }
            head= head.next;
            size--;
            
        }
    }
    public void printStack(){
        if(head == null){
            System.out.println("\nThe stack is empty");
        }else{
            Node currentNode= head;
            System.out.println("THE STACK IS:\n");
            while(currentNode != null){
                System.out.println(" | "+currentNode.value+" | ");
                System.out.println(" ----- ");
                currentNode = currentNode.next;
            }
        }
    }
   
    

}
