package livestock_manager;

public class Calculator{
  int days;
  int ration;
  int head;
  int cost;
  int total_ration;
  public Calculator(int days, int ration, int head, int cost){
    this.days = days;
    this.ration = ration;
    this.head = head;
    this.cost = cost;
    this.total_ration = total_ration;
  }

  public int getRation(){
    total_ration = this.ration * this.head;
    return total_ration;
  }
 
  public int getCost(){
    return (this.cost * getRation()) * this.days;
  }

}