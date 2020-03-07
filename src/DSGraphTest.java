import java.io.FileNotFoundException;
import java.util.HashMap;

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
}

