import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Stack;

public class DSGraphTest {
    private HashMap<Integer, FBSportsNode> retrieveNodes(){
        HashMap<Integer, FBSportsNode> teams = new HashMap<>();
        try {
            FBSportsNodeLoader loader = new FBSportsNodeLoader();
            loader.loadSportsNodes();
            while (loader.hasNextNode()) {
                FBSportsNode team = loader.getNextNode();
                teams.put(team.id, team);
            }
            loader.closeSportsNodes();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return teams;
    }

    private Stack<FBSportsEdge> retrieveEdges(){
        Stack<FBSportsEdge> stack = new Stack<>();
        try {
            FBSportsEdgeLoader loader = new FBSportsEdgeLoader();
            loader.loadSportsEdges();
            while (loader.hasNextEdge()) {
                FBSportsEdge edge = loader.getNextEdge();
                stack.push(edge);
            }
            loader.closeSportsEdge();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return stack;
    }

    private Graph<FBSportsNode> createGraph(){
        return null;
    }

    private int findNumberEdges(Graph<FBSportsNode> graph, String team){
        return 0;
    }



    public void runTest(){

        Graph<FBSportsNode> sportsGraph = createGraph();
        int relationships = findNumberEdges(sportsGraph, "Atlanta Falcons");
        System.out.println("Atlanta Falcons have : "+relationships+" relationships");

    }
}

