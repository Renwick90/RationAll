import static org.junit.Assert.*;
import org.junit.*;
import livestock_manager.*;

public class SheepTest{
  Sheep sheep;

  @Before
  public void before(){
    sheep = new Sheep(100, 40, 3);
  }

  @Test
  public void hasHead(){
    assertEquals(100, sheep.getHead());
  }

  @Test
  public void hasWeight(){
    assertEquals(40, sheep.getWeight());
  }

  @Test
  public void hasAge(){
    assertEquals(3, sheep.getAge());
  }
}