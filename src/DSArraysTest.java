import java.io.FileNotFoundException;

/*
* Course Module on using Arrays
* Common Array functions
*
* Create a new array: CFBTeam[] teams = new CFBTeam[1];
* Determine the size of an array: teams.length;
* Access an item from an array: CFBTeam team  = teams[0];
 */
class DSArraysTest{

  private CFBTeam[] retrieveTeams(){
    CFBTeam[] teams = new CFBTeam[1];
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

  private void insertIntoArray(CFBTeam[] teams, CFBTeam team){

  }

  private CFBTeam removeFromArray(CFBTeam[] teams, int index){
    return null;
  }

  private CFBTeam accessFromArray(CFBTeam[] teams, int index){
    return null;
  }

  private CFBTeam searchFromArray(CFBTeam[] teams, String name){
    return null;
  }

  public void runTest(){
    CFBTeam[] teams = retrieveTeams();
    CFBTeam testTeam = new CFBTeam("Awesome University", 13, "13-0", 1, 1);
    insertIntoArray(teams, testTeam);
    CFBTeam removeTeam = removeFromArray(teams, 50);
    CFBTeam accessTeam = accessFromArray(teams, 54);
    CFBTeam searchTeam = searchFromArray(teams, "Georgia (SEC)");

    System.out.println("RemoveTeam: "+removeTeam.name);

    System.out.println("AccessTeam: "+accessTeam.name);

    System.out.println("SearchTeam: "+searchTeam.name);
  }
}