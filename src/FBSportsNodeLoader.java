import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FBSportsNodeLoader {
    private Scanner sportsReader;

    public void loadSportsNodes() throws FileNotFoundException{
        File sportsCSV = new File("src/fb-pages-sports.nodes");
        sportsReader = new Scanner(sportsCSV);
        sportsReader.nextLine();
    }

    public boolean hasNextNode(){
        return sportsReader.hasNextLine();
    }

    public FBSportsNode getNextNode() {
        FBSportsNode node = null;
        if (hasNextNode()) {
            String data = sportsReader.nextLine();
            String[] attributes = data.split(",");
            node = new FBSportsNode(Integer.parseInt(attributes[0]), attributes[1], Integer.parseInt(attributes[2]));
        }
        return node;
    }

    public void closeSportsNodes(){
        sportsReader.close();
    }
}
