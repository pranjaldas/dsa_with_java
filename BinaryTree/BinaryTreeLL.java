import java.util.*;
class BinaryTreLL{
    BinaryNode root;

    public void inOrder(BinaryNode node){
        // INORDER TRAVERSAL
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }
    public void preOrder(BinaryNode node){
        // PREORDER TRAVERSAL
        if(node == null)
            return;
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(BinaryNode node){
        // POSTORDER TRAVERSAL
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }
    public void levelOrder(BinaryNode node){
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
    public BinaryNode getDeepest(){
        
            Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
            queue.add(root);
            BinaryNode presentNode=null;
            while(!queue.isEmpty()){
                presentNode= queue.remove();
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
            return presentNode;
        
    }
    public void deleteDeepest(){
        Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
        // HERE WE ASSUMED THAT THE TREE IS NOT EMPTY
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
                previousNode.right= null;
                return;
            }else if(presentNode.right==null){
                presentNode.left= null;
                return;
            }else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }

    }
    // DELETING IN BINARY TREE STEPS:
    // 1. SEARCH THE ELEMENT
    // 2. GET THE DEEPEST ELEMENT IN THE TREE
    // 3. SET THE DEEPEST ELEMENT VALUE TO THE ELEMENT TO BE DELETED
    // 4. DELETE THE DEEPEST ELEMENT
    public void delete(String value){
        BinaryNode toBeDeleted= search(value);
        if(toBeDeleted != null){
            BinaryNode theDeepest= getDeepest();
            toBeDeleted.value= theDeepest.value;
            deleteDeepest();
            System.out.println("Node deleted succuesfully");
            return;
        }
        System.out.println("Node not found");


    }

    public void insert(String value){
        // INSERTING INTO THE VACANT NODE
        // IF THE FIRST NODE THAT HAVE NO ANY CHILD NODE THEN WE WILL INSERT THE NEW NODE AS THE LEFT CHILD
        // IF THE VACANT NODE HAS ONLY LEFT CHILD THEN WE WILL ADD THE NEW NODE AS THE RIGHT CHILD
        BinaryNode newNode= new BinaryNode();
        newNode.value= value;
        if(root == null){
            System.out.println(value+" inserted in the root!");
            root= newNode;
        }else{
            Queue<BinaryNode> queue= new LinkedList<BinaryNode>();
            queue.add(root);
            while(!queue.isEmpty()){
                BinaryNode presentNode= queue.remove();
                if( presentNode.left == null){
                    presentNode.left= newNode;
                    System.out.println(value+" inserted successfully");
                    return;
                }else if(presentNode.right == null){
                    presentNode.right= newNode;
                    System.out.println(value+" inserted successfully");
                    return;
                }else{
                    queue.add(presentNode.left);
                    queue.add(presentNode.right);
                }
            }
        }
    }

    public BinaryNode search(String value){
       // LEVELORDER TRAVERSAL
       Queue<BinaryNode> queue =new LinkedList<BinaryNode>();
       queue.add(root);
       BinaryNode searchNode= null;
       while(!queue.isEmpty()){
           BinaryNode presentNode= queue.remove();
           if(presentNode.value.equals(value)){
             searchNode= presentNode;
             System.out.println(value + " Found!");
             return searchNode;
           }else{
            if(presentNode.left != null)
                queue.add(presentNode.left);
            if(presentNode.right != null)
                queue.add(presentNode.right);
           }
       } 
       System.out.println(value + " Not Found!");
       return searchNode;
    }
}