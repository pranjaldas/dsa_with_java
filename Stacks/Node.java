class Node{
    public int value;
    public Node next;

    public Node(int value){
        this.value= value;
    }
    public Node(int value,Node node){
        this.value= value;
        this.next= node;
    }
}