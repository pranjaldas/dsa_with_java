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

    public void search(String value){
       // LEVELORDER TRAVERSAL
       Queue<BinaryNode> queue =new LinkedList<BinaryNode>();
       queue.add(root);
       while(!queue.isEmpty()){
           BinaryNode presentNode= queue.remove();
           if(presentNode.value.equals(value)){
             System.out.println(value + " Found!");
             return;
           }else{
            if(presentNode.left != null)
                queue.add(presentNode.left);
            if(presentNode.right != null)
                queue.add(presentNode.right);
           }
       } 
       System.out.println(value + " Not Found!");
    }
}