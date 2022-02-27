public class Main {
    public static void main(String[] args) throws Exception {
        // CircularDLL cdll= new CircularDLL();
        // cdll.search(7);
        // cdll.createLL(5);
        // cdll.insertInBegining(6);
        // cdll.insertInBegining(7);
        // cdll.insertInEnd(4);
        // cdll.insertInEnd(7);
        // // cdll.insertInlocation(22, 2);
        // // cdll.search(7);
        // cdll.printList();
        // // cdll.printListReverse();
        // // cdll.removedublicates();
        // // cdll.delete(6);
        // // cdll.printList();
        // cdll.printNthfromTail(2);

        CircularDLL list1= new CircularDLL();
        CircularDLL list2 = new CircularDLL();
        list1.insertInEnd(7);
        list1.insertInEnd(8);
        list1.insertInEnd(6);
        list1.printList();
        list2.insertInEnd(2);
        list2.insertInEnd(9);
        list2.printList();
        sumList(list1,list2);



        
    }
    // TWO LIST IS GIVEN WHICH IS A COLLECTION OF DIGITS OF A NUMBER SO THAT 1'S DIGIT 
    // OF THE NUMBERS ARE IN HEADS OF THE LIST (REVERSING THE DIGITS OF THE NUMBER)
    public static void sumList(CircularDLL list1, CircularDLL list2){
        CircularDLL sumlist = new CircularDLL();
        if(list1.size == list2.size){
            int carry =0;
            int sum= 0;
            DoublyNode list1Current = list1.head;
            DoublyNode list2Current = list2.head;
            for(int i=1; i <= list1.size ;i++){
                sum= list1Current.value+list2Current.value+carry;
                sumlist.insertInEnd(sum%10);
                carry= sum/10;
                list1Current= list1Current.next;
                list2Current= list2Current.next;
            }
            if(carry>0){
                sumlist.insertInEnd(carry);
            }
            sumlist.printList();

        }else if(list1.size >list2.size){
            int carry =0;
            int sum= 0;
            DoublyNode list1Current = list1.head;
            DoublyNode list2Current = list2.head;
            for(int i=1; i <= list1.size ;i++){
                sum= list1Current.value+list2Current.value+carry;
                sumlist.insertInEnd(sum%10);
                carry= sum/10;
                list1Current= list1Current.next;
                if(list2.tail ==list2Current){
                    // IT IS THE LAST NODE
                    list2Current.value = 0;
                }else{
                    list2Current= list2Current.next;
                }   
            }
            if(carry>0){
                sumlist.insertInEnd(carry);
            }
            sumlist.printList();
        }


    }
}

        