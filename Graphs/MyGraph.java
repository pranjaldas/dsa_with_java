import java.util.List;
import java.util.ArrayList;
public class MyGraph {
    List<GraphNode> nodeList= new ArrayList<GraphNode>();
    int[][] adjacentMatrix;
    MyGraph(List<GraphNode> nodeList){
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

    
}
