import static org.junit.Assert.*;
import org.junit.*;
import livestock_manager.*;

public class CattleTest{
  Cattle cattle;

  @Before
  public void before(){
    cattle = new Cattle(100, 120, 5);
  }

  @Test
  public void hasHead(){
    assertEquals(100, cattle.getHead());
  }

  @Test
  public void hasWeight(){
    assertEquals(120, cattle.getWeight());
  }

  @Test
  public void hasRation(){
    assertEquals(5, cattle.getRation());
  }
}