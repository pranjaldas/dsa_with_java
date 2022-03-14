public class Driver {
    public static void main(String args[]){
        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);
        bst.levelOrder();
        bst.deleteNode(bst.root,20);
        System.out.println("\n");
        bst.levelOrder();
        
    }
}
