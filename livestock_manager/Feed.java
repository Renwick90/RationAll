package livestock_manager;

public abstract class Feed{

String type;
int cost;

public Feed(int type, int cost){
  this.type = type;
  this.cost = cost; 
}

public String getType(){
  return this.type;
}

public int getCost(){
  return this.cost;
}
}