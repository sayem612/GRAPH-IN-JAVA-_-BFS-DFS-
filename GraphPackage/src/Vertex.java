/**This is the Vertex class will be used in the Graph class
 * 
 * @author Kazi
 *
 */
public class Vertex <T>

{

public T data; // data (e.g. can char 'A' or any other data type)

public boolean ifVisited;



// -------------------------------------------------------------

//The is the constructor for the Vertex
public Vertex (T dat) 

{

data=dat;

ifVisited = false;

}


// -------------------------------------------------------------





//-------------------------------------------------------------

//This function return true if the Vertex isEmpty() (is empty)
//otherwise it returns false
public boolean isEmpty () 

{
 if(this.equals(null)){
	 return true;
}
else {
	return false;
}

}


//-------------------------------------------------------------

//-------------------------------------------------------------

//This function clears/remove a vertex
public void remove() 
{
this.data=null;
ifVisited=false;
}

//-------------------------------------------------------------



} // end class Vertex

