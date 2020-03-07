import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FBSportsEdgeLoader {
    private Scanner sportsReader;

    public void loadSportsEdges() throws FileNotFoundException{
        File sportsCSV = new File("src/fb-pages-sports.edges");
        sportsReader = new Scanner(sportsCSV);
        sportsReader.nextLine();
    }

    public boolean hasNextEdge(){
        return sportsReader.hasNextLine();
    }

    public FBSportsEdge getNextEdge() {
        FBSportsEdge edge = null;
        if (hasNextEdge()) {
            String data = sportsReader.nextLine();
            String[] attributes = data.split(",");
            edge = new FBSportsEdge(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[1]));
        }
        return edge;
    }

    public void closeSportsEdge(){
        sportsReader.close();
    }
}
