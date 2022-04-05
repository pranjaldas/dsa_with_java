import java.util.*;
public class Driver {
    public static void main(String args[]){
        boolean test= true;
        if(test){
            ArrayList<GraphNodeArray> list= new ArrayList<GraphNodeArray>();
            list.add(new GraphNodeArray("0",0));
            list.add(new GraphNodeArray("1",1));
            list.add(new GraphNodeArray("2",2));
            list.add(new GraphNodeArray("3",3));
            list.add(new GraphNodeArray("4",4));
            list.add(new GraphNodeArray("5",5));
            list.add(new GraphNodeArray("6",6));
            /**
             *  (0)----(1)
             *   |      | \
             *  (2)----(3)(6)
             *   |      | /
             *  (4)----(5)
             *   ABOVE IS A GRAPH, REPRESENT IT IN ADJACENT MATRIX
             */
            MyGraphArray mGraph= new MyGraphArray(list);
            mGraph.addUndirectedEdge(0,1);
            mGraph.addUndirectedEdge(0,2);
            mGraph.addUndirectedEdge(1,3);
            mGraph.addUndirectedEdge(1,6);
            mGraph.addUndirectedEdge(2,3);
            mGraph.addUndirectedEdge(2,4);
            mGraph.addUndirectedEdge(3,5);
            mGraph.addUndirectedEdge(4,5);
            mGraph.addUndirectedEdge(5,6);
            System.out.println(mGraph.toString());
            // mGraph.bfs();
            System.out.println("hii");
            mGraph.dfs();
        }else{
            ArrayList<GraphNodeList> list= new ArrayList<GraphNodeList>();
            list.add(new GraphNodeList("A",0));
            list.add(new GraphNodeList("B",1));
            list.add(new GraphNodeList("C",2));
            list.add(new GraphNodeList("D",3));
            list.add(new GraphNodeList("E",4));
            MyGraphList mGraph= new MyGraphList(list);
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
            System.out.println(mGraph.toString());
            mGraph.bfs();
            System.out.println();
            mGraph.dfs();

        }
        
    }
}
