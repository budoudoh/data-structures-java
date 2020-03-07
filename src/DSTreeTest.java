import java.io.FileNotFoundException;

class DSTreeTest {
  private BST<CFBTeam> retrieveTeams(){
    BST<CFBTeam> teams = new BST<>();
    try {
        CFBTeamLoader loader = new CFBTeamLoader();
        loader.loadTeams();
        while (loader.hasNextTeam()) {
            CFBTeam team = loader.getNextTeam();
            teams.insert(team);
        }
        loader.closeTeams();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return teams;
  }



  private CFBTeam searchFromBST(BST<CFBTeam> teams, String name){
    return null;
  }

  private CFBTeam depthFirstSearch(BST<CFBTeam> teams, String name){
    return null;
  }

  private CFBTeam breathFirstSearch(BST<CFBTeam> teams, String name){
    return null;
  }

  public void runTest(){
    BST<CFBTeam> teams = retrieveTeams();

    CFBTeam searchTeam = searchFromBST(teams, "Georgia (SEC)");
    CFBTeam dfsTeam = depthFirstSearch(teams, "Georgia Tech (ACC)");
    CFBTeam bfsTeam = breathFirstSearch(teams, "Georgia St. (Sun Belt)");

    System.out.println("SearchTeam: "+searchTeam.name);
    System.out.println("DFSearchTeam: "+dfsTeam.name);
    System.out.println("BFSearchTeam: "+bfsTeam.name);
  }
}