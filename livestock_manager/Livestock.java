package livestock_manager;

public abstract class Livestock{

int head;
int weight;
int ration;


public Livestock(int head, int weight, int ration){
  this.head = head;
  this.weight = weight;
  this.ration = ration;
}

public int getHead(){
  return this.head;
}

public int getWeight(){
  return this.weight;
}

public int getRation(){
  return this.ration;
}
}