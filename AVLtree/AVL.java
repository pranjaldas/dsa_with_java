import java.util.*;
class AVL{
    public BinaryNode root;
    public AVL(){
        root= null;
    } 
    // LEVEL ORDER TRAVERSAL
    void levelOrder() {
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while (!queue.isEmpty()) {
      BinaryNode presentNode = queue.remove();
      System.out.print(presentNode.value + " ");
      if (presentNode.left != null) {
        queue.add(presentNode.left);
      }
      if (presentNode.right != null) {
        queue.add(presentNode.right);
      }
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
    // INORDER TRAVERSAL
    public void inOrder(BinaryNode node){
        // INORDER TRAVERSAL
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
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
    public void insert(int value){
        // DO NOT GET CONFUSED ABOUT WHY I HAVE ASSIGNED THE ROOT NODE TO THE NEW NODE RETURNED 
        // FROM THE PRIVATE insertNode() METHOD WHILE PROVIDING ROOT REF TO THE INSERT METHOD
        // IT LOOKS LIKE AFTER INSERTING A NODE EACH TIME ROOT IS GOING TO POINT TO THE NEW NODE INSERTED
        // BUT WAIT, DO NOT GET CONFUSED, REMEMBER HOW RECUSRION METHOD WORKS
        // EACH TIME A RECUSION METHOD CALLED, A NEW LAYER IS ADDED IN THE CALL STACK, 
        // SO BASICALLY WE ARE SENDING ROOT REF TO THE insertNode(BinaryNode root, int value) METHOD
        // IT IS GOING TO DIG DOWN AND ADD NEW LAYERS TO CALL STACK AND AGAIN REMOVING THE LAYERS FROM THE 
        // CALL STACK AND FINALLY root REF IS GOING TO ASSIGN TO THE root, DO NOT WORRY ON THAT
        // TRY TI VISUALIZE THA SCENARIO USING PENCIL WITH 56 PAGE OF THE DSA COPY
        root = insertNode(root, value);
    }
    // insertNode Method
    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left, nodeValue);
        } else {
            node.right = insertNode(node.right, nodeValue);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        if (balance > 1 && nodeValue < node.left.value) {
            //Left Left condition
            return rotateRight(node);
        }

        if (balance > 1 && nodeValue > node.left.value) {
            // Left Right condition
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && nodeValue > node.right.value) {
            // RIGHT RIGHT condition
            return rotateLeft(node);
        }

        if (balance < - 1 && nodeValue < node.right.value) {
            // RIGHT LEFT condition
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        /* return the (unchanged) root  node pointer */
        return node;

    }
    // TO FIND THE SUCCESSOR OF THE NODE
    public BinaryNode findSuccessor(BinaryNode node){
        if(node.left == null){
            return node;
        }else{
            return findSuccessor(node.left);
        }
    }
    // DELETING A NODE 
    public BinaryNode deleteNode(BinaryNode node, int value){
        if(node == null){
            System.out.println("Can not find the node");
            return null;
        }else if(value < node.value){
            return deleteNode(node.left, value);
        }else if(value > node.value){
            return deleteNode(node.right, value);
        }else{
            // MEANS WE FOUND THE NODE TO DELETE, NOW WE NEED TO CHECK 
            // IF IT HAS TWO CHILD OR ONE CHILD OR NONE
            if(node.left != null && node.right != null){
                // SWAPPING THE VALUES BETWEEN SUCCESSOR AND THE NODE TO BE DELETED
                BinaryNode successNode= findSuccessor(node.right);
                node.value= successNode.value;
                successNode.value= value;
                node.right= deleteNode(node.right, successNode.value);
            }else if(node.left != null){
                System.out.println("\n"+value+"Deleted succesfully");
                node.left = null;
            }else if(node.right != null){
                System.out.println("\n"+value+"Deleted succesfully");
                node.right= null;
            }else{
                node = null;

            }

        }

        int balance = getBalance(node);
        // NOW WE WILL CHACK FOR ROTATION IS REQUIRED OR NOT
        // HERE balance  GREATER THAN 1 SIGNIFIES THAT IT SURELY LEFT-RIGHT OR LEFT-LEFT CONDITION
        // BECAUSE IN getbalance() METHOD WE SUBTRACK HEIGHT OF RIGHT SUB TREE FROM HEIGHT OF LEFT SUB TREE
        // AND balance LESS THAN -1 SIGNIFIES THAT IT IS SURELY RIGHT-LEFT OR RIGHT-RIGHT CONDITION
        if(balance > 1 && value < node.left.value){
            // LL CONDITION
            return rotateRight(node);
        }
        if(balance > 1 && value > node.left.value){
            // LR CONDITION
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if(balance < -1 && value > node.right.value){
            // RIGHT RIGHT CONDITON
            return rotateLeft(node);
        }
        if(balance < -1 && value < node.right.value){
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }
}