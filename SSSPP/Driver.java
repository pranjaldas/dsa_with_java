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
        mGraph.addUndirectedEdgeArray(0,1);
        mGraph.addUndirectedEdgeArray(0,2);
        mGraph.addUndirectedEdgeArray(1,3);
        mGraph.addUndirectedEdgeArray(1,4);
        mGraph.addUndirectedEdgeArray(2,3);
        mGraph.addUndirectedEdgeArray(3,4);
        mGraph.findSSSPP(list.get(0));

        ArrayList<GraphNodeArray> list2= new ArrayList<GraphNodeArray>();
        list2.add(new GraphNodeArray("0",0));
        list2.add(new GraphNodeArray("1",1));
        list2.add(new GraphNodeArray("2",2));
        list2.add(new GraphNodeArray("3",3));
        list2.add(new GraphNodeArray("4",4));
        list2.add(new GraphNodeArray("5",5));
        list2.add(new GraphNodeArray("6",6));
        // /**
        //  *  (0)----(1)
        //  *   |      | \
        //  *  (2)----(3)(6)
        //  *   |      | /
        //  *  (4)----(5)
        //  *   ABOVE IS A GRAPH, REPRESENT IT IN ADJACENT MATRIX
        //  */
        BFS mGraphArr= new BFS(list2,true);
        mGraphArr.addUndirectedEdge(0,1);
        mGraphArr.addUndirectedEdge(0,2);
        mGraphArr.addUndirectedEdge(1,3);
        mGraphArr.addUndirectedEdge(1,6);
        mGraphArr.addUndirectedEdge(2,3);
        mGraphArr.addUndirectedEdge(2,4);
        mGraphArr.addUndirectedEdge(3,5);
        mGraphArr.addUndirectedEdge(4,5);
        mGraphArr.addUndirectedEdge(5,6);
        mGraphArr.findSSSPP(0);
    }
    
}
