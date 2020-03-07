import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashMap;

class DSHashMapTest {
  private HashMap<String, CFBTeam> retrieveTeams(){
    HashMap<String, CFBTeam> teams = new HashMap<>();
    try {
        CFBTeamLoader loader = new CFBTeamLoader();
        loader.loadTeams();
        while (loader.hasNextTeam()) {
            CFBTeam team = loader.getNextTeam();

        }
        loader.closeTeams();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return teams;
  }

  private void insertIntoHashMap(HashMap<String, CFBTeam> teams, CFBTeam team){

  }

  private CFBTeam removeFromHashMap(HashMap<String, CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam accessFromHashMap(HashMap<String, CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam searchFromHashMap(HashMap<String, CFBTeam> teams, String name){
    return null;
  }

  public void runTest(){
    HashMap<String, CFBTeam> teams = retrieveTeams();
    CFBTeam testTeam = new CFBTeam("Awesome University", 13, "13-0", 1, 1);
    insertIntoHashMap(teams, testTeam);
    CFBTeam removeTeam = removeFromHashMap(teams, 50);
    CFBTeam accessTeam = accessFromHashMap(teams, 54);
    CFBTeam searchTeam = searchFromHashMap(teams, "Georgia (SEC)");

    System.out.println("RemoveTeam: "+removeTeam.name);

    System.out.println("AccessTeam: "+accessTeam.name);

    System.out.println("SearchTeam: "+searchTeam.name);
  }
}