public class GraphNodeArray {
    String name;
    int index;
    boolean isVisited= false;
    GraphNodeArray parent;
    GraphNodeArray(String value,int index){
        this.name= value;
        this.index= index;
    }
    
}
