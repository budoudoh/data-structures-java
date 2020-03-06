class CFBTeam{
  public String name;
  public int games;
  public String winLoss;
  public int offRank;
  public int defRank;
  public int pointsFor;
  public int pointsAgainst;

  public CFBTeam(String name, int games, String winLoss, int offRank, int defRank, int pointsFor, int pointsAgainst){
    this.name = name;
    this.games = games;
    this.winLoss = winLoss;
    this.offRank = offRank;
    this.defRank = defRank;
    this.pointsFor = pointsFor;
    this.pointsAgainst = pointsAgainst;
  }

}
