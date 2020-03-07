import java.io.FileNotFoundException;
import java.util.Stack;

class DSStackTest {
  private Stack<CFBTeam> retrieveTeams(){
    Stack<CFBTeam> teams = new Stack<>();
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

  private void insertIntoStack(Stack<CFBTeam> teams, CFBTeam team){

  }

  private CFBTeam removeFromStack(Stack<CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam accessFromStack(Stack<CFBTeam> teams, int index){
    return null;
  }

  private CFBTeam searchFromStack(Stack<CFBTeam> teams, String name){
    return null;
  }

  public void runTest(){
    Stack<CFBTeam> teams = retrieveTeams();
    CFBTeam testTeam = new CFBTeam("Awesome University", 13, "13-0", 1, 1);
    insertIntoStack(teams, testTeam);
    CFBTeam removeTeam = removeFromStack(teams, 50);
    CFBTeam accessTeam = accessFromStack(teams, 54);
    CFBTeam searchTeam = searchFromStack(teams, "Georgia (SEC)");

    System.out.println("RemoveTeam: "+removeTeam.name);

    System.out.println("AccessTeam: "+accessTeam.name);

    System.out.println("SearchTeam: "+searchTeam.name);
  }
}