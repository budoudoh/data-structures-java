class CFBTeam implements Comparable<CFBTeam>{
  public String name;
  public int games;
  public String winLoss;
  public int offRank;
  public int defRank;

  public CFBTeam(String name, int games, String winLoss, int offRank, int defRank){
    this.name = name;
    this.games = games;
    this.winLoss = winLoss;
    this.offRank = offRank;
    this.defRank = defRank;
  }


  @Override
  public int compareTo(CFBTeam o) {
      return this.name.compareTo(o.name);
  }
}
