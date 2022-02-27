import java.util.*;
class CircularDLL{
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public void createLL(int value){
        DoublyNode newNode = new DoublyNode();
        newNode.value = value;
        newNode.next= newNode;
        newNode.prev= newNode;
        head = newNode;
        tail = newNode;
        size++;

    }
    // PRINT THE LIST
    public void printList(){
        if(head == null){
            System.out.println("The list is empty!!sss!");
        }else{
            DoublyNode currentNode= head;
            System.out.println("\nThe List is :");
            for(int i=1;i <= size;i++){
                if(i != size){
                    System.out.print(currentNode.value+" -> ");
                    currentNode= currentNode.next;
                }else{
                    System.out.print(currentNode.value);
                }
            }
        
        }
    }
    // REVERSE PRINT THE LIST
    public void printListReverse(){
        if(head == null){
            System.out.println("The list is empty!!!");
        }else{
            DoublyNode currentNode= tail;
            System.out.println("\nThe List is :");
            for(int i=size;i >= 1;i--){
                if(i != 1){
                    System.out.print(currentNode.value+" -> ");
                    currentNode= currentNode.prev;
                }else{
                    System.out.print(currentNode.value);
                }
            }
        
        }
    }
    // INSERT IN THE BEGINING
    public void insertInBegining(int value){
        if(head == null){
            createLL(value);
        }else{
            DoublyNode newNode = new DoublyNode();
            newNode.value = value;
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            head= newNode;
            size++;
        }
    }
    // INSERT IN THE END
    public void insertInEnd(int value){
        if(head== null){
            createLL(value);
        }else{
            DoublyNode newNode = new DoublyNode();
            newNode.value = value;
            tail.next= newNode;
            newNode.prev = tail;
            newNode.next = head;
            tail= newNode;
            size++;

        }
    }
    // INSERT IN SPECIFIC LOCATION
    public void insertInlocation(int value,int location){
        if(head == null){
            createLL(value);
        }else if(location> size){
            insertInEnd(value);
        }else{
            DoublyNode currentNode = head;
            for(int i=0; i < size;i++){
                currentNode = currentNode.next;
            }
            DoublyNode  newNode= new DoublyNode();
            newNode.value =value;
            newNode.next= currentNode.next;
            newNode.prev= currentNode;
            currentNode.next.prev= newNode;
            currentNode.next = newNode;
            size++;

        }
    }
    // SEARCH AN ELEMENT, RETURN THE POSITION
    public void search(int value){
        if(head == null){
            System.out.println("\nThe array is null!!!");
            return;
        }else{
            DoublyNode currentNode= head;
            for(int i=1;i<=size; i++){
                if(currentNode.value == value){
                    System.out.println("\nThe element in found in position : "+i);
                    return;
                }else{
                    currentNode = currentNode.next;
                }
            }
            System.out.println("\nThe element not found!!!");

        }
    }
    // DELETE AN ELEMENT
    public boolean delete(int value){
        if(head == null){
            System.out.println("\nThe array is null!!!");
            return false;
        }else{
            DoublyNode currentNode= head;
            for(int i=1;i<=size; i++){
                if(currentNode.value == value){
                    if(i== 1){
                        // DELETE FROM THE BEGINNING
                        currentNode.next.prev=tail;
                        head= currentNode.next;
                        tail.next= currentNode.next;
                        size--;
                        System.out.println("\n Deleted succesfully !!!");
                        return true;
                    }else if(i == size){
                        // DELETE THE LAST NODE
                        currentNode.prev.next= head;
                        tail = currentNode.prev;
                        head.prev= currentNode.prev;
                        size--;
                        System.out.println("\n Deleted succesfully !!!");
                        return true;
                    }else{
                        // DELETE FROM THE MIDDLE
                        currentNode.next.prev=currentNode.prev;
                        currentNode.prev.next= currentNode.next;
                        size--;
                        System.out.println("\n Deleted succesfully !!!");
                        return true;
                    }
                    
                }else{
                    currentNode= currentNode.next;
                    
                }
            }
            System.out.println("\nThe element not found!!!");
            return false;

        }
    }
    // REMOVE DUBLICATES
    public void removedublicates(){
        HashSet<Integer> hset= new HashSet<>();
        if(head == null){
            System.out.println("The list is empty!!sss!");
            return;
        }else{
            DoublyNode currentNode= head;
            for(int i=1;i <= size;i++){
                if(hset.contains(currentNode.value)){
                    delete(currentNode.value);
                    currentNode= currentNode.next;
                }else{
                    hset.add(currentNode.value);
                    currentNode= currentNode.next;
                }
            }
        
        }
        System.out.println("\nThe elements in CDLL that are unique are: "+hset);

    }
    // PRINT nth ELEMENT FROM THE LAST NODE
    public void printNthfromTail(int nth){
        if(nth > size){
            System.out.println("\nThe list is under size");
            return;
        }else if(nth == 1){
            // PRINT TAIL
            System.out.println("\nIt is the tail: "+tail.value);
        }else if(nth == size){
            // PRINT HEAD
            System.out.println("\nIt is the head: "+head.value);
        }else{
            DoublyNode currentNode = tail;
            for(int i= 1; i < nth; i++){
                currentNode= currentNode.prev;
            }
            System.out.println("\n The "+nth+"th node value is : "+currentNode.value);

        }

    }

}