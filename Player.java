/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball4;

/**
 *
 * @author vlawrence6491
 */
public class Player {
    private String name;
    private String team;
    private float atBats;
    private float hits;
    private float average;
    
    public Player(){}
     //constructor
  public Player(String name, String team, float atBats, float hits)
  {
      this.name = name;
      this.team = team;
      this.atBats= atBats;
      this.hits = hits;
      
  }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public float getAtBats() {
        return atBats;
    }
    public void setAtBats(float atBats) {
        this.atBats = atBats;
    }
    public float getHits() {
        return hits;
    }
    public void setHits(float hits) {
        this.hits = hits;
    }
    public float getAverage() {
        return  ( hits/ atBats);
    }
    public void setAverage(float average) {
       
        this.average = average;
    }
    
    @Override
    public String toString() {
        return "Player:: Name=" + this.name + " Team =" + this.team + " At bats=" + this.atBats +
                " hits=" + this.hits;
    }
    
}