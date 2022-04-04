import java.util.ArrayList;
import java.util.List;
public class GraphNodeList {
    String name;
    int index;
    List<GraphNodeList> neighbours= new ArrayList<GraphNodeList>();

    GraphNodeList(String name, int index){
        this.name=name;
        this.index=index;
    }

    
}
