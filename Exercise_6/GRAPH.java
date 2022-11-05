

public class GRAPH {
	 class Edge {
	        String src, dest;
	    }

	    int vertices, edges;

	   
	    Edge[] edge;

	    GRAPH(int vertices, int edges) {
	        this.vertices = vertices;
	        this.edges = edges;

	        
	        edge = new Edge[edges];
	        for (int i = 0; i < edges; i++) {

	         
	            edge[i] = new Edge();
	        }
	    }

	    public static void main(String[] args) {

	        // create an object of Graph class
	        int noVertices = 12;
	        int noEdges = 12;
	        GRAPH myGraph = new GRAPH(noVertices, noEdges);

	      
	        myGraph.edge[0].src = "Angel";
	        myGraph.edge[0].dest = "Dave";

	        myGraph.edge[1].src = "Angel";
	        myGraph.edge[1].dest = "Eujuan";

	        myGraph.edge[2].src = "Angel";
	        myGraph.edge[2].dest = "Dustin";

	        myGraph.edge[3].src = "Angel";
	        myGraph.edge[3].dest = "Marjorie";
	        
	        myGraph.edge[4].src = "Angel";
	        myGraph.edge[4].dest = "Analyn";
	        
	        myGraph.edge[5].src = "Angel";
	        myGraph.edge[5].dest = "Nicos";
	        
	        myGraph.edge[6].src = "Angel";
	        myGraph.edge[6].dest = "Joshua";
	        
	        myGraph.edge[7].src = "Angel";
	        myGraph.edge[7].dest = "Miguel";
	        
	        myGraph.edge[8].src = "Angel";
	        myGraph.edge[8].dest = "Magu";
	        
	        myGraph.edge[9].src = "Angel";
	        myGraph.edge[9].dest = "Kris";
	        
	        myGraph.edge[10].src = "Joshua";
	        myGraph.edge[10].dest = "Nicos";
	        
	        myGraph.edge[11].src = "Eujuan";
	        myGraph.edge[11].dest = "Dustin";


	        for (int i = 0; i < noEdges; i++) {
	            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
	        }

	    }
	}
