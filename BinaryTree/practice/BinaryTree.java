class BinaryTree{
    public TreeNode root;
    public void createTree(String data){
        root = new TreeNode();
        root.data= data;
        root.left= null;
        root.right= null;
        System.out.println("Binary Tree created \n");
    }
    public void preOrder(TreeNode node){
        if(node== null){
            return;
        }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(TreeNode node){
        if(node== null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
        
    }
    public void inOrder(TreeNode node){
         if(node== null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
       
    }
}