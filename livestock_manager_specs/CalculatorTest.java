import static org.junit.Assert.*;
import org.junit.*;
import livestock_manager.*;

public class CalculatorTest{
  Calculator calculator;

  @Before
  public void before(){
    calculator = new Calculator(30, 3, 100, 120);
  }

  @Test
  public void hasRation(){
    assertEquals(300, calculator.getRation());
  }

  @Test
  public void hasCost(){
  assertEquals(1080000, calculator.getCost());
  }
}