public class Main {
    public static void main(String args[]){
       BinaryTree binarytree= new BinaryTree();
       binarytree.createTree("Drinks");

       TreeNode hot =  new TreeNode();
       hot.data= "Hot";

       TreeNode cold =  new TreeNode();
       cold.data= "Cold";

       TreeNode tea =  new TreeNode();
       tea.data= "Tea";

       TreeNode coffee =  new TreeNode();
       coffee.data= "coffee";

       TreeNode nonalcoholic =  new TreeNode();
       nonalcoholic.data= "Non-alcoholic";

       TreeNode alcoholic =  new TreeNode();
       alcoholic.data= "Alcoholic";


       binarytree.root.left=hot;
       binarytree.root.right=cold;

       hot.left= tea;
       hot.right= coffee;

       cold.left=nonalcoholic;
       cold.right=alcoholic;

       System.out.println("\nPre Order Traversal: \n");
       binarytree.preOrder(binarytree.root);
       System.out.println("\nPost Order Traversal: \n");
       binarytree.postOrder(binarytree.root);
       System.out.println("\nIn Order Traversal: \n");
       binarytree.inOrder(binarytree.root);
       
    }
}
