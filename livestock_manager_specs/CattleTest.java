import static org.junit.Assert.*;
import org.junit.*;
import livestock_manager.*;

public class CattleTest{
  Cattle catle;

  @Before
  public void before(){
    cattle = new Cattle(100, 120, 5);
  }

  @Test
  public void hasHead(){
    assertEquals(100, cattle.getHead());
  }
}