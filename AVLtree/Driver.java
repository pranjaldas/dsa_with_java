class Driver{
    public static void main(String args[]){
        System.out.println("Hii");
        AVL avltree= new AVL();
    
        avltree.insert(50);
        avltree.insert(100);
        avltree.insert(40);
        avltree.insert(20);
        avltree.insert(30);
        avltree.insert(80);
        avltree.insert(70);
        avltree.insert(60);
       
        avltree.levelOrder();
        System.out.println("\n");
        avltree.inOrder(avltree.root);
    
    }

    
}