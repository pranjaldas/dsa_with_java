import java.util.*;
public class Driver {
    public static void main(String args[]){
        boolean test= true;
        if(test){
            List<GraphNodeArray> list= new ArrayList<GraphNodeArray>();
            list.add(new GraphNodeArray("A",0));
            list.add(new GraphNodeArray("B",1));
            list.add(new GraphNodeArray("C",2));
            list.add(new GraphNodeArray("D",3));
            list.add(new GraphNodeArray("E",4));
            /**
             *  (A)----(B)
             *   | \     \
             *   |   \   (E)
             *   |     \ /
             *  (C)----(D)
             *   ABOVE IS A GRAPH, REPRESENT IT IN ADJACENT MATRIX
             */
            MyGraphArray mGraph= new MyGraphArray(list);
            mGraph.addUndirectedEdge(0,1);
            mGraph.addUndirectedEdge(0,2);
            mGraph.addUndirectedEdge(0,3);
            mGraph.addUndirectedEdge(1,4);
            mGraph.addUndirectedEdge(2,3);
            mGraph.addUndirectedEdge(3,4);
            System.out.println(mGraph.toString());
            mGraph.bfs();
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
