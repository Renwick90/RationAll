package livestock_manager;

public abstract class Livestock{

int head;
int weight;
int age;


public Livestock(int head, int weight, int age){
  this.head = head;
  this.weight = weight;
  this.age = age;
}

public int get head(){
  return this.head;
}

public int get weight(){
  return this.weight;
}

public int get age(){
  return this.age;
}
}