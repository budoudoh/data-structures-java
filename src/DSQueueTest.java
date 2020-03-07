import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Queue;

class DSQueueTest {
  private Queue<CFBTeam> retrieveTeams(){
    Queue<CFBTeam> teams = new PriorityQueue<>();
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

  private void insertIntoQueue(Queue<CFBTeam> teams, CFBTeam team){

  }

  private CFBTeam removeFromQueue(Queue<CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam accessFromQueue(Queue<CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam searchFromQueue(Queue<CFBTeam> teams, String name){
    return null;
  }

  public void runTest(){
    Queue<CFBTeam> teams = retrieveTeams();
    CFBTeam testTeam = new CFBTeam("Awesome University", 13, "13-0", 1, 1);
    insertIntoQueue(teams, testTeam);
    CFBTeam removeTeam = removeFromQueue(teams, 50);
    CFBTeam accessTeam = accessFromQueue(teams, 54);
    CFBTeam searchTeam = searchFromQueue(teams, "Georgia (SEC)");

    System.out.println("RemoveTeam: "+removeTeam.name);

    System.out.println("AccessTeam: "+accessTeam.name);

    System.out.println("SearchTeam: "+searchTeam.name);
  }
}