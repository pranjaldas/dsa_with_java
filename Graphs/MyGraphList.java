import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

public class MyGraphList {
    ArrayList<GraphNodeList> nodeList = new ArrayList<GraphNodeList>();

    MyGraphList(ArrayList<GraphNodeList> nodeList) {
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
  // BREADTH FIRST SEARCH (LEVEL ORDER)
  public void bfs(GraphNodeList node){
    LinkedList<GraphNodeList> queue= new LinkedList<GraphNodeList>();
    queue.add(node);
    while(!queue.isEmpty()){
      GraphNodeList curGraphNodeList= queue.remove(0);
      if(!curGraphNodeList.isVisited){
        System.out.print(curGraphNodeList.name+" ");
        curGraphNodeList.isVisited=true;
        ArrayList<GraphNodeList> neighbours= curGraphNodeList.neighbours;
        for(GraphNodeList neighbour: neighbours){
          if(!neighbour.isVisited){
            queue.add(neighbour);
          }
        }
      }
    }
  }
  public void bfs(){
    System.out.println("Breadth First Search in LinkedList impl of graph:\n");
    for(GraphNodeList node: nodeList){
      bfs(node);
    }
  }
  // DEPTH FIRST SEARCH
  public void dfs(GraphNodeList node){
    Stack<GraphNodeList> mStack = new Stack<GraphNodeList>();
    mStack.push(node);
    while(!mStack.isEmpty()){
      GraphNodeList curGraphNodeList= mStack.pop();
      if(!curGraphNodeList.isVisited){
        curGraphNodeList.isVisited= true;
        System.out.print(curGraphNodeList.name+" ");
        ArrayList<GraphNodeList> neighbours= curGraphNodeList.neighbours;
        for(GraphNodeList neighbor: neighbours){
          if(!neighbor.isVisited){
            mStack.push(neighbor);
          }
        }
      }
    }
  }
  public void dfs(){
    System.out.println("Depth First Search in LinkedList impl of graph:\n");
    for(GraphNodeList node: nodeList){
      if(!node.isVisited){
        dfs(node);
      }
    }
  }
}
