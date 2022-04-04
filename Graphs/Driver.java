import java.util.*;
public class Driver {
    public static void main(String args[]){
        boolean test= false;
        if(test){
            List<GraphNode> list= new ArrayList<GraphNode>();
            list.add(new GraphNode("A",0));
            list.add(new GraphNode("B",1));
            list.add(new GraphNode("C",2));
            list.add(new GraphNode("D",3));
            list.add(new GraphNode("E",4));
            /**
             *  (A)----(B)
             *   | \     \
             *   |   \   (E)
             *   |     \ /
             *  (C)----(D)
             *   ABOVE IS A GRAPH, REPRESENT IT IN ADJACENT MATRIX
             */
            MyGraph mGraph= new MyGraph(list);
            mGraph.addUndirectedEdge(0,1);
            mGraph.addUndirectedEdge(0,2);
            mGraph.addUndirectedEdge(0,3);
            mGraph.addUndirectedEdge(1,4);
            mGraph.addUndirectedEdge(2,3);
            mGraph.addUndirectedEdge(3,4);
            System.out.println(mGraph.toString());
        }else{
            List<GraphNodeList> list= new ArrayList<GraphNodeList>();
            list.add(new GraphNodeList("A",0));
            list.add(new GraphNodeList("B",1));
            list.add(new GraphNodeList("C",2));
            list.add(new GraphNodeList("D",3));
            list.add(new GraphNodeList("E",4));
            MyGraphList mGraph= new MyGraphList(list);
             /**
             *  (A)----(B)
             *   | \     \
             *   |   \   (E)
             *   |     \ /
             *  (C)----(D)
             *   ABOVE IS A GRAPH, REPRESENT IT IN ADJACENT MATRIX
             */
            mGraph.addUndirectedEdge(0,1);
            mGraph.addUndirectedEdge(0,2);
            mGraph.addUndirectedEdge(0,3);
            mGraph.addUndirectedEdge(1,4);
            mGraph.addUndirectedEdge(2,3);
            mGraph.addUndirectedEdge(3,4);
            System.out.println(mGraph.toString());

        }
        

        

    }
}
