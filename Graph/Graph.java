package Graph;

import java.util.LinkedList;
import java.util.Queue;

//adjacency matrix implementation
public class Graph {
	private boolean adjacencyMatrix[][];
	private int vertexCount;
	
	public Graph(int vertexCount){
		this.vertexCount = vertexCount;
		adjacencyMatrix = new boolean[vertexCount][vertexCount];
	}
	
	public void addEdge(int i, int j){
		if(i >= 0 && i < vertexCount && j > 0 && j < vertexCount){
			adjacencyMatrix[i][j] = true;
			adjacencyMatrix[j][i] = true;
		}
	}
	
	public void removeEdge(int i, int j){
		if(i >= 0 && i<vertexCount && j >0 && j < vertexCount){
			adjacencyMatrix[i][j] = false;
			adjacencyMatrix[j][i] = false;
		}
	}
	
	public boolean isEdge(int i, int j){
		if(i >= 0 && i<vertexCount && j >0 && j < vertexCount)
			return adjacencyMatrix[i][j];
		else
			return false;
	}
	
	enum VertexState {
		White,
		Gray,
		Black
	}
	
	public void DFS(){
		VertexState state[] = new VertexState[vertexCount];
		for(int i =0 ;i<vertexCount; i++){
			state[i] = VertexState.White;
			runDFS(0, state);
		}
	}
	
	public void runDFS(int u, VertexState[] state){
		state[u] = VertexState.Gray;
		for(int v =0; v< vertexCount; v++)
			if(isEdge(u,v) && state[v] == VertexState.White)
				runDFS(v,state);
		state[u]=VertexState.Black;
	}
	
	public void bfs()
	   {
	      // BFS uses Queue data structure
		
	      Queue<Node> q = new LinkedList<Node>();

	      q.add(rootNode);
	      visited[rootNode] = true;

	      printNode(rootNode);

	      while( !q.isEmpty() )
	      {
	         int n, child;

	         n = (q.peek()).intValue();

	         child = getUnvisitedChildNode(n);    // Returns -1 if no unvisited niode left     

	         if ( child != -1 )
	         {  // Found an unvisted node 

	            visited[child] = true;        // Mark as visited

	            printNode(child);

	            q.add(child);      // Add to queue 
	         }
	         else
	         {
	            q.remove();                  // Process next node
	         }
	      }
	   }
}
