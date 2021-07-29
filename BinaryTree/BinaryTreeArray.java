class BinaryTreeArray{
    // IN ARRAY IMPLEMENTATION OF BINARY TREE IF THE INDEX OF THE PARENT IS N
    // THEN THE LEFT CHILD INDEX IS 2*N AND RIGHT CHILD INDEX IS (2*N)+1
    // AND LEFT CHILD INDEX IS ALWAYS EVEN AND RIGHT CHILD INDEX IS ALWAYS ODD
    String arr[];
    int lastIndex;
    public BinaryTreeArray(int size){
        // WE ARE NOT GOING TO USE THE 0th INDEX BECAUSE IT CREATES A MATHMATICAL COMPLEXITY
        this.arr =new String[size+1];
        this.lastIndex =0;
        System.out.println("THE BINARY TREE HAS CREATED");
    }

    public boolean isFull(){
        if(this.arr.length-1 == this.lastIndex)
            return true;
        else
            return false;
    }
    // INSERT IN THE TREES 
    public void insert(String value){
        if(this.isFull()){
            System.out.println("THE BINARY TREE IS FULL!");
        }else{
            this.arr[this.lastIndex+1]=value;
            this.lastIndex++;
            System.out.println("THE VALUE "+value+" HAS INSERTED");
        }
    }
    //TRAVERSAL IN BINARY TREES DFS(inorder,preorder,postorder)
    public void preOrder(int index){
        if(index >this.lastIndex){
            return;
        }else{
           System.out.print(" "+arr[index]);
           preOrder(2 * index);
           preOrder(2 * index + 1);
        }
    }
    public void postOrder(int index){
        if(index >this.lastIndex){
            return;
        }else{
           postOrder(2 * index);
           postOrder(2 * index + 1);
           System.out.print(" "+arr[index]);
        }
    }
    public void inOrder(int index){
        if(index >this.lastIndex){
            return;
        }else{
            inOrder(2 * index);
            System.out.print(" "+arr[index]);
            inOrder(2 * index + 1);
        }

    }
    // BFS TRAVERSAL (levelorder)
    // levelorder traversal in array binary three is nothing but traversing through the array
    public void levelOrder(){
        for(int i=1; i<=this.lastIndex; i++){
            System.out.print(" "+arr[i]);
        }
    }
    // SEARCHING IN BINARY TREES
    public void search(String value){
        for(int i=1; i<this.lastIndex; i++){
            if(arr[i]==value){
                System.out.print(value+ " FOUND AT LOCATION: "+i);
                return;
            } 
                
        }
        System.out.print(value+ " NOT EXISTS");
    }
    // DELETING IN BINARY TREE USING LEVELORDER TRAVERSAL
    public void delete(String value){
        for(int i=1; i<=this.lastIndex; i++){
            if(arr[i]==value){
                arr[i]=arr[this.lastIndex];
                this.lastIndex--;
                System.out.print(value+ " DELETED SUCCESSFULLY");
                return;
            }   
        }
        System.out.println(value+ " NOT FOUND");
    }
    // DELETING THE ENTIRE BINARY TREE 
    public void deleteEntireTree(){
        this.arr=null;
        System.out.println("THE TREE HAS DELETED!");
    }

}