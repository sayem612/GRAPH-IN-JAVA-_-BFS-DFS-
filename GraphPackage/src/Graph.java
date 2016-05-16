/** 
 * This is Graph Class which will be used to create the graph
 * 
@author Kazi
 */
 


public class Graph <T>

{

private int numberOfVertices;

private Vertex vertexList[]; // list of vertices

private int adjacencyMatrix[][]; // adjacency matrix

int presentNumVerts; // current number of vertices

private Queue bfsQueue;  //this will used in the bfs method

private Stack dfsStack;  //this will be used in the dfs method
// ------------------------------------------------------------

//This is the constructor of the graph
//user must pass in the maximum number of vertices 
// they would need for their graph
public Graph( int numberOfVertices) 

{
this.numberOfVertices=numberOfVertices;
vertexList = new Vertex[numberOfVertices];

// adjacency matrix

adjacencyMatrix = new int[numberOfVertices][numberOfVertices];

presentNumVerts = 0;

for(int j=0; j<numberOfVertices; j++) // set adjacency

for(int k=0; k<numberOfVertices; k++) // matrix to 0

	adjacencyMatrix[j][k] = 0;

//initializes the Queue and the Stack size equal 
//to the size of the maximum number of vertices 
//which is the number that will be passed in 
//during the initialization of the Graph object
bfsQueue = new Queue(this.numberOfVertices);
dfsStack=new Stack(this.numberOfVertices);

} // end constructor

// -------------------------------------------------------------

// This function adds vertex to the graph
//passing the data as the parameter
public void addVertex(T dat)

{
for (int i=0; i<presentNumVerts;i++){
	if(dat==vertexList[i].data){	
		return;
	}
}
	for (int i=0; i<presentNumVerts;i++){
		if(vertexList[i].isEmpty()){	
			vertexList[i] = new Vertex(dat);
			return;
		}
		
	}
	vertexList[presentNumVerts++] = new Vertex(dat);

}
// -------------------------------------------------------------

//This function erases/removes vertex to the graph
//passing the data as the parameter
public void eraseVertex(T dat){
int j=-1;
for (int i=0; i<presentNumVerts;i++){
	if(dat==vertexList[i].data){	
		vertexList[i].remove();
		j=i;	
	}
	}
if((j>-1)){
	
	for(int q=j; q<presentNumVerts-1;q++){
	//vertexList[q].data=vertexList[q+1].data;
	//vertexList[q].ifVisited=vertexList[q+1].ifVisited;
	vertexList[q]=vertexList[q+1];
	}
    //vertexList[presentNumVerts-1].remove();
	presentNumVerts--;
		
}
}

//-------------------------------------------------------------

//This function adds an edge (Undirected edge)

public void addEdge(int start, int end)

{

	adjacencyMatrix[start][end] = 1;

	adjacencyMatrix[end][start] = 1;

}

// -------------------------------------------------------------


//-------------------------------------------------------------

//This function erase an edge (Undirected edge)

public void eraseEdge(int start, int end)

{

	adjacencyMatrix[start][end] = 0;

	adjacencyMatrix[end][start] = 0;

}

//-------------------------------------------------------------

//This function clears the vertexList (array)
//This function clears the graph	

public void clear()

{

	this.numberOfVertices=numberOfVertices;
	vertexList = new Vertex[numberOfVertices];

	// adjacency matrix

	adjacencyMatrix = new int[numberOfVertices][numberOfVertices];

	presentNumVerts = 0;

	for(int j=0; j<numberOfVertices; j++) // set adjacency

	for(int k=0; k<numberOfVertices; k++) // matrix to 0

		adjacencyMatrix[j][k] = 0;


}

//-------------------------------------------------------------


//-------------------------------------------------------------

//This function prints the data stored in the vertex 
//the index of the vertex list is passed as an argument

public void printVertex(int v)

{

System.out.print(vertexList[v].data);

}

// -------------------------------------------------------------

public void bfs() // breadth-first search

{ // begin at vertex 0

vertexList[0].ifVisited = true; // mark it

printVertex(0); // display it

bfsQueue.insert(0); // insert at tail

int vert2;


while( !bfsQueue.isEmpty() ) // until queue empty,

{

int vert1 = bfsQueue.remove(); // remove vertex at head

// until it has no unvisited neighbors

while( (vert2=getAdjacentUnvisitedVertex(vert1)) != -1 )

{ // get one,

vertexList[vert2].ifVisited = true; // mark it

printVertex(vert2); // display it

bfsQueue.insert(vert2); // insert it

} // end while

} // end while(queue not empty)


// queue is empty, so we're done

for(int j=0; j<presentNumVerts; j++) // reset flags

vertexList[j].ifVisited = false;

} // end bfs()

// -------------------------------------------------------------

// returns an unvisited vertex adj to v

public int getAdjacentUnvisitedVertex(int vert)

{

for(int q=0; q<presentNumVerts; q++)

if(adjacencyMatrix[vert][q]==1 && vertexList[q].ifVisited==false)

return q;

return -1;

} // end getAdjUnvisitedVertex()

// -------------------------------------------------------------



//------------------------------------------------------------
public void dfs()  // depth-first search
   {                                 // begin at vertex 0
   vertexList[0].ifVisited = true;  // mark it
   printVertex(0);                 // display it
   dfsStack.push(0);                 // push it

   while( !dfsStack.isEmpty() )      // until stack empty,
      {
      // get an unvisited vertex adjacent to stack top
      int vert = getAdjacentUnvisitedVertex( dfsStack.returnTop() );
      if(vert == -1)                    // if no such vertex,
         dfsStack.pop();
      else                           // if it exists,
         {
         vertexList[vert].ifVisited = true;  // mark it
         printVertex(vert);                 // display it
         dfsStack.push(vert);                 // push it
         }
      }  // end while

   // stack is empty, so we're done
   for(int q=0; q<presentNumVerts; q++)  // This is to reset all the flags
      vertexList[q].ifVisited = false;
   }  // end dfs
//------------------------------------------------------------
// returns an unvisited vertex adj to v




} // end class Graph

////////////////////////////////////////////////////////////////