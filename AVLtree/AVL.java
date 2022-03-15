import java.util.*;
class AVL{
    public AVLNode root;
    public AVL(){
        root= null;
    } 

    // LEVEL ORDER TRAVERSAL
    public void levelOrder(){
        Queue<AVLNode> queue =new LinkedList<AVLNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            AVLNode presentNode= queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left != null)
                queue.add(presentNode.left);
            if(presentNode.right != null)
                queue.add(presentNode.right);
        }

    }
    // PREORDER TRAVERSAL
    public void preOrder(AVLNode node){
        if(node == null)
            return;
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    // POSTORDER TRAVERSAL
    public void postOrder(AVLNode node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
    // SEARCHING
    public AVLNode search(AVLNode currentNode,int value){
        if(currentNode == null){
            System.out.println("\n"+value+ " Not found");
            return null;
        }else if(value == currentNode.value){
            System.out.println("\n"+value+" Found in the BST");
            return currentNode;
        }else if(value <= currentNode.value){
            return search(currentNode.left, value);
        }else{
            return search(currentNode.right, value);
        }
        
    }
    public AVLNode search(int value){
        return search(root,value);
    }
}