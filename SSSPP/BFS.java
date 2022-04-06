/**
 * SINGLE SOURCE SHORTEST PATH PROBLEM SOLUTION USING BREADTH FIRST SEARCH
 */
import java.util.ArrayList;
import java.util.LinkedList;
public class BFS {
    ArrayList<GraphNodeList> nodeList;
    BFS(ArrayList<GraphNodeList> graphNodeList){
        this.nodeList = graphNodeList;
    }
    public void addUndirectedEdge(int i, int j){
        GraphNodeList firstNode = this.nodeList.get(i);
        GraphNodeList secondNode = this.nodeList.get(j);
        firstNode.neighbours.add(secondNode);
        secondNode.neighbours.add(firstNode);
    }
    public void printPath(GraphNodeList node){
        if(node.parent != null)
            printPath(node.parent);
        System.out.print(node.name+" ");
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
