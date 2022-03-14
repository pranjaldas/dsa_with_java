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
            return search(currentNode.left, value);
        }else{
            return search(currentNode.right, value);
        }
        
    }
    public BinaryNode search(int value){
        return search(root,value);
    }
    // THREE CASES IN DELETING A NODE
    // CASE 1: DELETE THE NODE THAT IN A LEAF NODE
    // CASE 2: DELETE THE NODE THAT HAS ONE CHILD
    // CASE 3: DELETE THE NODE THAT HAVE TWO CHILDS
    // IN CASE 3, FIND THE NODE TO BE DELETED AND FIND THE SMALLEST NODE IN THE RIGHT SUB TREE (SUCCESSOR)
    // SWAP THE VALUES BETWEEN THE SUCCESSOR AND THE NODE TO DELETE
    // NOW CALL THE SAME DELETE METHOD FOR THE SUCCESSOR NODE
    public BinaryNode deleteNode(BinaryNode currentNode, int value){
        if(currentNode== null){
            System.out.println("Value not found in the binary tree");
            return null;
        }
        
        if(value < currentNode.value){
            currentNode.left= deleteNode(currentNode.left, value);
        }else if(value > currentNode.value){
            currentNode.right= deleteNode(currentNode.right, value);
        }else{
            if(currentNode.left != null && currentNode.right != null){
                // DELETE THE NODE
                // FIND THE SUCCESOR
                BinaryNode successorNode= findSuccessor(currentNode.right);
                currentNode.value= successorNode.value;
                successorNode.value= value;
                currentNode.right = deleteNode(currentNode.right, successorNode.value);
            }else if(currentNode.left != null){
                System.out.println("\n"+value+"Deleted succesfully");
                currentNode.left = null;
            }else if(currentNode.right != null){
                System.out.println("\n"+value+"Deleted succesfully");
                currentNode.right= null;
            }else{
                System.out.println("\n"+value+"Deleted succesfully");
                currentNode =null;
            }
        }
        return currentNode;
        
    }
    public BinaryNode findSuccessor(BinaryNode node){
        if(node.left == null){
            return node;
        }else{
            return findSuccessor(node.left);
        }
    }

}
