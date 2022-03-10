import java.util.*;
public class BinarySearchTree {
    public BinaryNode root;
    public BinarySearchTree(){
        root = null;
    }
    // MY FIRST APPROACH TO INSERT
    public void myInsert(int value){
        if(root== null){
            BinaryNode newNode= new BinaryNode();
            newNode.value= value;
            root= newNode;
            System.out.println("Binary node created in root");
        }else{
            BinaryNode newNode= new BinaryNode();
            newNode.value = value;
            BinaryNode tempNode=root;
            BinaryNode parentNode= root;
            while(tempNode != null){
                parentNode= tempNode;
                if(value <= tempNode.value){
                    // go to left subtree
                    tempNode= tempNode.left;
                }else{
                    // go to right sub tree
                    tempNode=tempNode.right;
                }
            }
            if(newNode.value <= parentNode.value)
                parentNode.left = newNode;
            else
                parentNode.right = newNode;
            System.out.println("Value inserted Successfully");
           
        }
    }
    // INSERT USING RECURSION
    public BinaryNode insert(BinaryNode currentNode,int value){
        if(currentNode== root && currentNode == null){
            BinaryNode newNode= new BinaryNode();
            newNode.value= value;
            root= newNode;
            System.out.println(value+ " inserted in root successfully"); 
            return root;
        }
        else if(currentNode== null){
            BinaryNode newNode= new BinaryNode();
            newNode.value= value;
            System.out.println(value+ " inserted successfully");
            return newNode;
        }else if(value <= currentNode.value){
            currentNode.left= insert(currentNode.left,value);
            
        }else{
            currentNode.right =insert(currentNode.right, value);
        }
        return currentNode;
    }
    // METHOD OVERLOADING
    public void insert(int value){
        insert(root, value);
    }

    public void levelOrder(){
     
        // LEVELORDER TRAVERSAL
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
    // SEARCHING
    public BinaryNode search(BinaryNode currentNode,int value){
        if(currentNode == null){
            System.out.println("\n"+value+ " Not found");
            return null;
        }else if(value == currentNode.value){
            System.out.println("\n"+value+" Found in the BST");
            return currentNode;
        }else if(value <= currentNode.value){
            search(currentNode.left, value);
        }else{
            search(currentNode.right, value);
        }
        return null;
    }
    public BinaryNode search(int value){
        return search(root,value);
    }
}
