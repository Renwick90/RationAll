package livestock_manager;

public abstract class Feed{

String type;
int cost;

public Feed(int type, int cost){
  this.type = type;
  this.cost = cost; 
}

public String get type(){
  return this.type;
}

public int get cost(){
  return this.cost;
}
}