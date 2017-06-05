import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Map;
import java.util.Optional;

public class MaxLengthDiffTest {

  @Test
  public void test() {
    String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
    String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
    assertEquals(13, MaxLengthDiff.maxLengthDiff(s1, s2)); // 13
  }

  @Test
  public void testAnyEmpty() {
    String[] s1 = new String[0];
    String[] s2 = {"a", "b"};

    assertEquals(-1, MaxLengthDiff.maxLengthDiff(s1, s1));
    assertEquals(-1, MaxLengthDiff.maxLengthDiff(s1, s2));
    assertEquals(-1, MaxLengthDiff.maxLengthDiff(s2, s1));
  }
}
