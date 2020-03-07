import java.io.FileNotFoundException;
import java.util.LinkedList;

class DSLinkedListTest {
  private LinkedList<CFBTeam> retrieveTeams(){
    LinkedList<CFBTeam> teams = new LinkedList<>();
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

  private void insertIntoLinkedList(LinkedList<CFBTeam> teams, CFBTeam team){

  }

  private CFBTeam removeFromLinkedList(LinkedList<CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam accessFromLinkedList(LinkedList<CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam searchFromLinkedList(LinkedList<CFBTeam> teams, String name){
    return null;
  }

  public void runTest(){
    LinkedList<CFBTeam> teams = retrieveTeams();
    CFBTeam testTeam = new CFBTeam("Awesome University", 13, "13-0", 1, 1);
    insertIntoLinkedList(teams, testTeam);
    CFBTeam removeTeam = removeFromLinkedList(teams, 50);
    CFBTeam accessTeam = accessFromLinkedList(teams, 54);
    CFBTeam searchTeam = searchFromLinkedList(teams, "Georgia (SEC)");

    System.out.println("RemoveTeam: "+removeTeam.name);

    System.out.println("AccessTeam: "+accessTeam.name);

    System.out.println("SearchTeam: "+searchTeam.name);
  }
}