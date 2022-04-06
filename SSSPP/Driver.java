import java.util.ArrayList;
public class Driver {
    public static void main(String args[]){
        ArrayList<GraphNodeList> list= new ArrayList<GraphNodeList>();
            list.add(new GraphNodeList("A",0));
            list.add(new GraphNodeList("B",1));
            list.add(new GraphNodeList("C",2));
            list.add(new GraphNodeList("D",3));
            list.add(new GraphNodeList("E",4));
            BFS mGraph= new BFS(list);
            /**
             *  (A)----(B)
             *   |      | \
             *   |      | (E)
             *   |      | /
             *  (C)----(D)
             *   ABOVE IS A GRAPH, REPRESENT IT IN LIST
             */
            mGraph.addUndirectedEdge(0,1);
            mGraph.addUndirectedEdge(0,2);
            mGraph.addUndirectedEdge(1,3);
            mGraph.addUndirectedEdge(1,4);
            mGraph.addUndirectedEdge(2,3);
            mGraph.addUndirectedEdge(3,4);
            mGraph.findSSSPP(list.get(0));
    }
    
}
