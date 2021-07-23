class DoublyNode{
   private int value;
   private DoublyNode next;
   private DoublyNode previous;
   public DoublyNode(){

   };
   public DoublyNode(int value) {
       this.value = value;
   };
   public void setValue(int value) {
       this.value = value;
   };
   public void setNext(DoublyNode next) {
       this.next = next;
   };
   public void setPrevious(DoublyNode previous) {
       this.previous = previous;
   };
   public int getValue() {
       return this.value;
   };
   public DoublyNode getNext() {
    return this.next;
};
public DoublyNode getPrevious() {
    return this.previous;
};
}