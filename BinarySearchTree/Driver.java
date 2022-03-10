public class Driver {
    public static void main(String args[]){
        BinarySearchTree bst= new BinarySearchTree();
        bst.insert(60);
        bst.insert(50);
        bst.insert(70);
        bst.insert(65);
        bst.insert(3);
        bst.levelOrder();
        BinaryNode node3=bst.search(3);
        BinaryNode node7=bst.search(7);
        System.out.println("OK node3"+node3);
        System.out.print("OK node7"+node7);
    }
}
