import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class MyGraphArray {
    // GRAPH REPRESENTATION USING ADJACENTY MATRIX
    List<GraphNodeArray> nodeList= new ArrayList<GraphNodeArray>();
    int[][] adjacentMatrix;
    MyGraphArray(List<GraphNodeArray> nodeList){
        this.nodeList= nodeList;
        adjacentMatrix= new int[nodeList.size()][nodeList.size()];
    }
    public void addUndirectedEdge(int i,int j){
        adjacentMatrix[i][j]=1;
        adjacentMatrix[j][j]=1;
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
        for (int j : adjacentMatrix[i]) {
          s.append((j) + " ");
        }
        s.append("\n");
      }
      return s.toString();
    }
    // TO GET NEIGHBOURS OF A NODE
    public ArrayList<GraphNodeArray> getNeighbours(GraphNodeArray node){
      ArrayList<GraphNodeArray> neighbours= new ArrayList<GraphNodeArray>();
      for(int i=0; i<adjacentMatrix.length;i++){
        if(adjacentMatrix[node.index][i]==1){
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
    
}
