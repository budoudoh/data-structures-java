import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner;

class DSArraysTest{
  private CFBTeam[] retrieveTeams(){
    CFBTeam[] teams = new CFBTeam[0];
    try {
      File teamsCSV = new File("cfb2019.csv");
      Scanner teamsReader = new Scanner(teamsCSV);
      teamsReader.nextLine();
      while (teamsReader.hasNextLine()) {
        String data = teamsReader.nextLine();
        String[] attributes = data.split(",");
        CFBTeam team = new CFBTeam(attributes[0], Inte)
        teams = new CFBTeam[teams.length()+1];
        teams[teams.length-1] = team;
      }
      teamsReader.close();
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
    CFBTeam testTeam = new CFBTeam("Awesome University", 13, "13-0", 1, 1, 10000, 0);
    insertIntoArray(teams, testTeam);
    CFBTeam removeTeam = removeFromArray(teams, 50);
    CFBTeam accessTeam = accessFromArray(teams, 54);
    CFBTeam searchTeam = searchFromArray(teams, "Georgia (SEC)");

    System.out.println("RemoveTeam: "+removeTeam.name);

    System.out.println("AccessTeam: "+accessTeam.name);

    System.out.println("SearchTeam: "+searchTeam.name);
  }
}