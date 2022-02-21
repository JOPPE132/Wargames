package org.ntnu.no.wargames;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Army {

  private String name;
  private ArrayList<Unit> units;

  public Army(String name){
    this.name = name;
    List<Unit> units = new ArrayList<Unit>();
  }

  public String getName(){
    return name;
  }

  public void addUnit(Unit unit){
    units.add(unit);
  }

  public void addAll(ArrayList<Unit> allUnits){

    units.add(allUnits);
  }

  public void removeUnit(Unit unit){
    units.remove(unit);
  }

  public boolean hasUnits(){
    if(units.isEmpty()){
      return false;
    }
    else{
      return true;
    }
  }

  public List<Unit> getAllUnits(List<Unit> allUnits) {
    return units;
  }

    public int getRandom(List<Unit> randomUnit){
      Random random = new Random();

      random.nextInt(randomUnit);


    }








}
