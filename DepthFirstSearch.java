/*
Node design:

class Node{
	//Adjacency List
	ArrayList<Node> adjacentNodes;
	boolean visited;
	String label;
	
	Node(String label){
		this.label=label;
		adjacentNodes=new ArrayList<>();
	}
	
	ArrayList<Node> getAdjList(){
		return adjacentNodes;
	}
	
	void setVisitedAs(boolean status){
		visited=status;
	}
	
	boolean isVisited(){
		return visited;
	}

}

*/

//DFS Snippet//////////////////////////////////////////
public static void doDFS(Node node, Stack<Node> stack){
	if(node==null){
		return;
	}
	node.setVisitedAs(true);
	
	for(Node adjNode:node.getAdjList()){
		if(!adjNode.visited){
		stack.push(adjNode);
		doDFS((stack.empty())?null: stack.pop(),stack);
		}
	}
	
}
