/** This is a Stack class
 * This will be used for the Depth First Search algorithm in the Graph class (dfs())
 * @author Kazi
 *
 */
public class Stack
{
	   private int Length;
	   private int[] stackx;
	   private int Top;
	// ------------------------------------------------------------
	   //This is the constructor for the Stack object class
	   public Stack(int Length)      
	      {
		   this.Length=Length;
	      stackx = new int[Length];    // make array
	      Top = -1;
	      }
	// ------------------------------------------------------------
	   //This function pushes item on the top of stackx
	   public void push(int j)   // put item on stack
	      { stackx[++Top] = j; }
	// ------------------------------------------------------------
	   //This function pops/removes item from the top of stackx
	   public int pop()          // take item off stack
	      { return stackx[Top--]; }
	// ------------------------------------------------------------
	   //This function return what is on the top most item on stackx
	   public int returnTop()         // returns item at top of stack
	      { return stackx[Top]; }
	// ------------------------------------------------------------
	   //This function returns true if the stack is empty
	   //otherwise (if item in the stack it returns false
	   public boolean isEmpty()  // true if nothing on stack
	      { return (Top == -1); }
	// ------------------------------------------------------------
	   }  // end class Stack