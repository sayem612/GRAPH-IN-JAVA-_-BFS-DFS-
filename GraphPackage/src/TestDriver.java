/**This class contains the main method which test the Graph class 
 * 
 * @author Kazi
 *
 */
public class TestDriver {
	
	
	
	public static void main(String[] args)

{
//Add argument for what type of data to store 
//since vertex and graph are genric
//also pass in the argument the maximum size of vertices that
//your graph can hold, while instantiating the Graph
		
Graph<Character> theGraph = new Graph<Character>(10);

theGraph.addVertex('A'); // 0 (start for bfs)

theGraph.addVertex('B'); // 1

theGraph.addVertex('C'); // 2

theGraph.addVertex('L'); //3

theGraph.addVertex('D'); // 4

theGraph.addVertex('E'); // 5

//theGraph.addVertex('A'); // Duplicate is not allowed

//the next lines of code is to test the eraseVertex(),
//which belong to the graph class
//theGraph.eraseVertex('A');
//theGraph.eraseVertex('B');

System.out.println("This is the present Number of Vertices " + theGraph.presentNumVerts);

theGraph.addEdge(0, 1); // AB   
//theGraph.eraseEdge(1, 0);

theGraph.addEdge(1, 2); // BC    
//theGraph.eraseEdge(1, 2);

theGraph.addEdge(0, 3); // AL
//theGraph.eraseEdge(0, 3);

theGraph.addEdge(3, 4); // LD
//theGraph.eraseEdge(3, 4);

theGraph.addEdge(2, 3); // CL
//theGraph.eraseEdge(2, 3);

System.out.print("BFS Visits: ");


theGraph.bfs(); // breadth-first search

System.out.println();


System.out.print("DFS Visits: ");

theGraph.dfs(); // breadth-first search

System.out.println();


theGraph.clear(); // This Line of code clears the Graph
theGraph.addVertex('L'); //0

theGraph.addVertex('D'); //1

theGraph.addVertex('E'); //2

theGraph.addVertex('Q'); //3

System.out.println("This is the present Number of Vertices " + theGraph.presentNumVerts);

theGraph.addEdge(0, 1); // LD  
//theGraph.eraseEdge(1, 0);

theGraph.addEdge(1, 2); // DE    
//theGraph.eraseEdge(1, 2);

theGraph.addEdge(0, 3); // LQ

System.out.print("BFS Visits: ");


theGraph.bfs(); // breadth-first search

System.out.println();


System.out.print("DFS Visits: ");

theGraph.dfs(); // breadth-first search
} // end main()

} // end class BFSApp

////////////////////////////////////////////////////////////////
