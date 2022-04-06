/**
 * SINGLE SOURCE SHORTEST PATH PROBLEM SOLUTION USING BREADTH FIRST SEARCH
 */
import java.util.ArrayList;
import java.util.LinkedList;
public class BFS {
    ArrayList<GraphNodeList> nodeList;
    ArrayList<GraphNodeArray> nodeListArray;
    int[][] adjacencyMatrix;
    BFS(ArrayList<GraphNodeList> graphNodeList){
        this.nodeList = graphNodeList;
        
    }
    BFS(ArrayList<GraphNodeArray> graphNodeListArray,boolean isArr){
        this.nodeListArray = graphNodeListArray;
        this.adjacencyMatrix = new int[nodeListArray.size()][nodeListArray.size()];
    }
    public void addUndirectedEdge(int i, int j){
        GraphNodeList firstNode = this.nodeList.get(i);
        GraphNodeList secondNode = this.nodeList.get(j);
        firstNode.neighbours.add(secondNode);
        secondNode.neighbours.add(firstNode);
        
    }
    public void addUndirectedEdgeArray(int i, int j){
        //FOR THE ADJACENCY MATRIX
        this.adjacencyMatrix[i][j]=1;
        this.adjacencyMatrix[j][i]=1;
    }
    public ArrayList<GraphNodeArray> getNeighbours(int i){
        ArrayList<GraphNodeArray> neighbors= new ArrayList<GraphNodeArray>();
        for(int j=0; j< this.nodeListArray.size(); j++){
            if(adjacencyMatrix[i][j]==1){
                neighbors.add(nodeListArray.get(j));
            }
        }
        return neighbors;
    }
    public void printPath(GraphNodeList node){
        if(node.parent != null)
            printPath(node.parent);
        System.out.print(node.name+" ");
    }
    public void printPath(GraphNodeArray node){
        if(node.parent != null)
            printPath(node.parent);
        System.out.print(node.name+" ");
    }
    // THIS IS FOR ADJACENCY LIST
    public void findSSSPP(int sourceIndex){
        LinkedList<GraphNodeArray> queue = new LinkedList<>();
        queue.add(nodeListArray.get(sourceIndex));
        while(!queue.isEmpty()) {
            GraphNodeArray currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path from Node  "+this.nodeListArray.get(sourceIndex).name+" to " + currentNode.name + ": ");
            printPath(currentNode);
            System.out.println();
            for (GraphNodeArray neighbor : getNeighbours(currentNode.index)) {
                if (!neighbor.isVisited) {
                    neighbor.parent = currentNode;
                    neighbor.isVisited= true;
                    queue.add(neighbor);
                }
            }
          
        }

    }

    public void findSSSPP(GraphNodeList sourceNode){
        LinkedList<GraphNodeList> queue = new LinkedList<>();
        queue.add(sourceNode);
        while(!queue.isEmpty()) {
          GraphNodeList currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path from Node  "+sourceNode.name+" to " + currentNode.name + ": ");
            printPath(currentNode);
            System.out.println();
            for (GraphNodeList neighbor : currentNode.neighbours) {
                if (!neighbor.isVisited) {
                    neighbor.parent = currentNode;
                    neighbor.isVisited= true;
                    queue.add(neighbor);
                }
            }
          
        }
    } 
}
