//A common for all Graph Based algorithms, and hence will contain a lot of functionality.
//Its advisable to remove any unnecessary functionality, base on the chosen Algorithm.

class Node{
	//Adjacency List
	ArrayList<Node> adjacentNodes;
	boolean visited;
	String label;
	
	int level;					//For BFS
	
	int weight; 				//For Dijkstra
	int INFINITY=999;
	Node prevNode;
	
	Node(String label){
		this.label=label;
		adjacentNodes=new ArrayList<>();
		level=-1;
		weight=INFINITY;
	}
	
	ArrayList<Node> getAdjList(){
		return adjacentNodes;
	}
	
	void setVisitedAs(boolean status){
		visited=status;
	}
	
	void setVisitedAs(boolean status,int level){
		visited=status;
		this.level=level;
	}
	
	boolean isVisited(){
		return visited;
	}
	
	int getLevel(){
		return level;
	}
	
	int getWeight(){
		return weight;
	}
	
	void setWeightTo(int weight){
		this.weight=weight;
	}
	
	void setPreviousNode(Node node){
		this.prevNode=node;
	}
	
	Node getPreviousNode(){
		return prevNode;
	}
}
