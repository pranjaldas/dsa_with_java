import java.util.List;
import java.util.ArrayList;

public class MyGraphList {
    List<GraphNodeList> nodeList = new ArrayList<GraphNodeList>();

    MyGraphList(List<GraphNodeList> nodeList) {
        this.nodeList = nodeList;
    }
    public void addUndirectedEdge(int i, int j){
        GraphNodeList firstNode = this.nodeList.get(i);
        GraphNodeList secondNode = this.nodeList.get(j);
        firstNode.neighbours.add(secondNode);
        secondNode.neighbours.add(firstNode);
    }
    // For printing Graph to the console

  public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j =0; j < nodeList.get(i).neighbours.size(); j++) {
        if (j == nodeList.get(i).neighbours.size()-1 ) {
          s.append((nodeList.get(i).neighbours.get(j).name) );
        } else {
          s.append((nodeList.get(i).neighbours.get(j).name) + " -> ");
        }
      }
      s.append("\n");
    }
    return s.toString();
  }
}
