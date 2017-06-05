import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculationsTests {

  private static final double DELTA = 1e-15;

  @Test
  public void avarageTest() {
    assertEquals(2, Calculations.avarage(new int[]{1, 2, 3}), DELTA);
    assertEquals(3, Calculations.avarage(new int[]{1, 2, 6}), DELTA);
  }
}
