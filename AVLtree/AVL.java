import java.util.*;

import javax.xml.bind.ValidationEvent;
class AVL{
    public BinaryNode root;
    public AVL(){
        root= null;
    } 

    // LEVEL ORDER TRAVERSAL
    public void levelOrder(){
        Queue<BinaryNode> queue =new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode= queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left != null)
                queue.add(presentNode.left);
            if(presentNode.right != null)
                queue.add(presentNode.right);
        }

    }
    // PREORDER TRAVERSAL
    public void preOrder(BinaryNode node){
        if(node == null)
            return;
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    // POSTORDER TRAVERSAL
    public void postOrder(BinaryNode node){
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
    // SEARCHING
    public BinaryNode search(BinaryNode currentNode,int value){
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
    public BinaryNode search(int value){
        return search(root,value);
    }


    // GET THE HEIGHT OF THE NODE;
    public int getHeight(BinaryNode node){
        if(node == null)
            return 0;
        else
            return node.height;
    }

    // ROTATE LEFT 
    public BinaryNode rotateRight(BinaryNode disbalancedNode){
        BinaryNode newRoot= disbalancedNode.left;
        disbalancedNode.left= disbalancedNode.left.right;
        newRoot.right=disbalancedNode;
        disbalancedNode.height= 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height= 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }
    // ROTATE RIGHT
    public BinaryNode rotateLeft(BinaryNode disbalancedNode){
        BinaryNode newRoot= disbalancedNode.right;
        disbalancedNode.right= disbalancedNode.right.left;
        newRoot.right= disbalancedNode;
        disbalancedNode.height= 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height= 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }
    // GET BALANCE
    public int getBalance(BinaryNode avlNode){
        if(avlNode == null){
            return 0;
        }
        return getHeight(avlNode.left) - getHeight(avlNode.right);
    }
    // INSERT NODE HELPER METHOD
    private BinaryNode insert(BinaryNode node,int value){
        if(node== null){
            BinaryNode newNode= new BinaryNode();
            newNode.value= value;
            newNode.height=1;
            return newNode;
        }else if(value < node.value){
            node.left  = insert(node, value);
        }else{
            node.right = insert(node, value);
        }
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        int balance = getBalance(node);
        if(balance > 1 && value < node.left.value){
            //Left Left condition
            return rotateRight(node);
        }
        if(balance > 1 && value > node.left.value){
            // Left Right condition
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && value > node.right.value){
            // RIGHT RIGHT condition
            return rotateLeft(node);
        }
        if(balance < -1 && value < node.right.value){
            // RIGHT LEFT condition
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }
    public void insert(int value){
        root = insert(root, value);
    }
}