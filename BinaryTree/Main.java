class Main{
    public static void main(String[] args){
        
        // NODE CREATION
        // BinaryNode n1=new BinaryNode();
        // n1.value= "N1";

        // BinaryNode n2=new BinaryNode();
        // n2.value= "N2";

        // BinaryNode n3=new BinaryNode();
        // n3.value= "N3";

        // BinaryNode n4=new BinaryNode();
        // n4.value= "N4";

        // BinaryNode n5=new BinaryNode();
        // n5.value= "N5";

        // BinaryNode n6=new BinaryNode();
        // n6.value= "N6";

        // BinaryNode n7=new BinaryNode();
        // n7.value= "N7";

        // CHILD NODE ASSOCIATION
        // n2.left= n4;
        // n2.right= n5;
        // n3.left= n6;
        // n3.right= n7;
        // n1.left=n2;
        // n1.right=n3;

        // BinaryTreLL binaryTree=new BinaryTreLL();
        // binaryTree.root=n1;

        // System.out.println("InOrder traversal: ");
        // binaryTree.inOrder(binaryTree.root);

        // System.out.println("\nPreOrder traversal: ");
        // binaryTree.preOrder(binaryTree.root);

        // System.out.println("\nPostOrder traversal: ");
        // binaryTree.postOrder(binaryTree.root);

        // System.out.println("\nLevel  Order traversal: ");
        // binaryTree.levelOrder(binaryTree.root);

        // System.out.println("\nSearch: ");
        // binaryTree.search("N0");

        // System.out.println("\nInsert: ");
        // binaryTree.insert("N8");

        // System.out.println("\nLevel  Order traversal: ");
        // binaryTree.levelOrder(binaryTree.root);
    
        // BinaryTreLL binaryTree= new BinaryTreLL();
        // binaryTree.insert("N1");
        // binaryTree.insert("N2");
        // binaryTree.insert("N3");
        // binaryTree.insert("N4");
        // binaryTree.insert("N5");
        // binaryTree.insert("N6");
        // binaryTree.insert("N7");
        // binaryTree.insert("N8");
        // System.out.println("\n");
        // binaryTree.levelOrder(binaryTree.root);

        // BinaryNode node=binaryTree.getDeepest();
        // System.out.println("Value of deepest: "+node.value);

        BinaryTreeArray binaryTree= new BinaryTreeArray(7);
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        System.out.println("Pre ORDER TRAVERSAL:\n");
        binaryTree.preOrder(1);
        System.out.println("\nPost ORDER TRAVERSAL:\n");
        binaryTree.postOrder(1);
        System.out.println("\nIn ORDER TRAVERSAL:\n");
        binaryTree.inOrder(1);
        System.out.println("\nLevel ORDER TRAVERSAL:\n");
        binaryTree.levelOrder();
        System.out.println("\nSEARCHING:\n");
        binaryTree.search("N9");
        System.out.println("\nDELEING:\n");
        binaryTree.delete("N2");
        binaryTree.levelOrder();
    }
}