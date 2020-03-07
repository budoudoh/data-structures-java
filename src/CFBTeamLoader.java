import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CFBTeamLoader {
    private Scanner teamsReader;

    public void loadTeams() throws FileNotFoundException{
        File teamsCSV = new File("src/cfb2019.csv");
        teamsReader = new Scanner(teamsCSV);
        teamsReader.nextLine();
    }

    public boolean hasNextTeam(){
        return teamsReader.hasNextLine();
    }

    public CFBTeam getNextTeam() {
        CFBTeam team = null;
        if (hasNextTeam()) {
            String data = teamsReader.nextLine();
            String[] attributes = data.split(",");
            team = new CFBTeam(attributes[0],
                    Integer.parseInt(attributes[1]),
                    attributes[2], Integer.parseInt(attributes[3]),
                    Integer.parseInt(attributes[9]));
        }
        return team;
    }

    public void closeTeams(){
        teamsReader.close();
    }
}
