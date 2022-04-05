import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;
public class MyGraphArray {
    // GRAPH REPRESENTATION USING ADJACENTY MATRIX
    ArrayList<GraphNodeArray> nodeList= new ArrayList<GraphNodeArray>();
    int[][] adjacencyMatrix;
    public MyGraphArray(ArrayList<GraphNodeArray> nodeList) {
      this.nodeList = nodeList;
      adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }
  
    public void addUndirectedEdge(int i, int j) {
      adjacencyMatrix[i][j] = 1;
      adjacencyMatrix[j][i] = 1;
    }
  
    public String toString() {
      StringBuilder s = new StringBuilder();
      s.append("   ");
      for (int i = 0; i < nodeList.size(); i++) {
        s.append(nodeList.get(i).name + " ");
      }
      s.append("\n");
      for (int i = 0; i < nodeList.size(); i++) {
        s.append(nodeList.get(i).name + ": ");
        for (int j : adjacencyMatrix[i]) {
          s.append((j) + " ");
        }
        s.append("\n");
      }
      return s.toString();
    }
    // TO GET NEIGHBOURS OF A NODE
    public ArrayList<GraphNodeArray> getNeighbours(GraphNodeArray node){
      ArrayList<GraphNodeArray> neighbours= new ArrayList<GraphNodeArray>();
      for(int i=0; i<adjacencyMatrix.length;i++){
        if(adjacencyMatrix[node.index][i]==1){
          neighbours.add(nodeList.get(i));
        }
      }
      return neighbours;
    }

    // BREADTH FIRST SEARCH
    public void bfs(GraphNodeArray startNode){
      // IMPLEMENTING QUEUE WITH LINKED LIST
      List<GraphNodeArray> queue= new LinkedList<>();
      System.out.println("The Breadth First Search of the graph:\n");
      queue.add(startNode);
      while(!queue.isEmpty()){
        GraphNodeArray node= queue.remove(0);
        if(!node.isVisited){
          node.isVisited= true;
          System.out.print(node.name+" ");
          ArrayList<GraphNodeArray> neighbours= getNeighbours(node);
          for(GraphNodeArray neighbourNode: neighbours){
            if(!neighbourNode.isVisited){
              queue.add(neighbourNode);
            }
          }
        }
      }
    }
    public void bfs(){
      for (GraphNodeArray node : nodeList) {
        if(!node.isVisited) {
          bfs(node);
        }
      }
    }

    // DEPTH FIRST SEARCH
    public void dfs(GraphNodeArray startNode){
      // IMPLEMENTING QUEUE WITH LINKED LIST
      Stack<GraphNodeArray> stack= new Stack<GraphNodeArray>();
      stack.push(startNode);
      while(!stack.isEmpty()){
        GraphNodeArray node= stack.pop();
        if(!node.isVisited){
          node.isVisited= true;
          System.out.print(node.name+" ");
          ArrayList<GraphNodeArray> neighbours= getNeighbours(node);
          for(GraphNodeArray neighbourNode: neighbours){
            if(!neighbourNode.isVisited){
              stack.push(neighbourNode);
            }
          }
        }
      }
    }
    public void dfs(){
      System.out.println("The Depth First Search of the graph:\n");
      for (GraphNodeArray node : nodeList) {
        if(!node.isVisited) {
          dfs(node);
        }
      }
    }
    
}
