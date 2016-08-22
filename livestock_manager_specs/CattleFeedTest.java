import static org.junit.Assert.*;
import org.junit.*;
import livestock_manager.*;

public class CattleFeedTest{
  CattleFeed cattleFeed;

  @Before
  public void before(){
    cattleFeed = new CattleFeed("Barley", 120);
  }

  @Test
  public void hasType(){
    assertEquals("Barley", cattleFeed.getType());
  }

  @Test 
  public void hasCost(){
    assertEquals(120, cattleFeed.getCost());
  }


}
