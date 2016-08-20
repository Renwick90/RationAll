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

public int getHead(){
  return this.head;
}

public int getWeight(){
  return this.weight;
}

public int getAge(){
  return this.age;
}
}