import java.util.ArrayList;
public class GraphNodeList {
    String name;
    int index;
    boolean isVisited =false;
    GraphNodeList parent;
    ArrayList<GraphNodeList> neighbours= new ArrayList<GraphNodeList>();
    

    GraphNodeList(String name, int index){
        this.name=name;
        this.index=index;
    }


    
}
