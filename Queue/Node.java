class Node{
    int value;
    Node next;
    public Node(){
        //Default Constructor
    };
    public Node(int value){
        this.value = value;
    };
    public Node(int value,Node next){
        this.value = value;
        this.next = next;
    }
}