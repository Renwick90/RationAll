import static org.junit.Assert.*;
import org.junit.*;
import livestock_manager.*;

public class SheepFeedTest{
  SheepFeed sheepFeed;

  @Before
  public void before(){
    sheepFeed = new SheepFeed("Barley", 120);
  }

  @Test
  public void hasType(){
    assertEquals("Barley", sheepFeed.getType());
  }

  @Test 
  public void hasCost(){
    assertEquals(120, sheepFeed.getCost());
  }


}