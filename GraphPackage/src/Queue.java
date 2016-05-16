/** This is the Queue class will be used for the breadth first search(bfs)
 * *
 * @author Kazi
 *
 */

public class Queue

{

private  int Length ;

private int[] queueArray;

private int queueFront;

private int queueRear;

// -------------------------------------------------------------

// this is constructor (Program's default constructor)
public Queue(int Length)

{
	this.Length=Length;

queueArray = new int[Length];

queueFront = 0;

queueRear = -1;

}

// -------------------------------------------------------------

// This function inserts item in the rear of the Queue
public void insert(int item) 

{

if(queueRear == Length-1)

queueRear = -1;

queueArray[++queueRear] = item;

}

// -------------------------------------------------------------

//This function removes an item front of the Queue
public int remove() 

{

int temporary = queueArray[queueFront++];

if(queueFront == Length)

queueFront = 0;

return temporary;

}

// -------------------------------------------------------------

// This function returns true if the queue isEmpty (is empty)
public boolean isEmpty() 

{

return ( queueRear+1==queueFront || ( queueFront+ Length-1== queueRear) );

}

// -------------------------------------------------------------

} // end class Queue

