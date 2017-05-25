//BFS Snippet////////////////////////////////////////////////////
//Please note that, the source node will not be part of the queue
//Hence its level should be preset to 0;
////////////////////////////////////////////////////////////////
public static void doBFS(Node node, int level,Queue<Node> queue){
	if(node==null){
		return;
	}
	
	for(Node adjNode:node.getAdjList()){
		if(!adjNode.isVisited()){
			queue.offer(adjNode);
			adjNode.setVisitedAs(true, level+1);
		}
	}
	
	doBFS(queue.poll(),level+1,queue);
	
}
