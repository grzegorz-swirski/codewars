import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class RankTest {

  @Test
  public void testNoParticipants() {
    String st = "";
    Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
    assertEquals("No participants", Rank.nthRank(st, we, 4));
    assertEquals("No participants", Rank.nthRank(null, we, 4));
  }

  @Test
  public void testNotEnoughParticipants() {
    String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
    Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
    assertEquals("Not enough participants", Rank.nthRank(st, we, 8));
  }

  @Test
  public void test1() {
    String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
    Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
    assertEquals("Benjamin", Rank.nthRank(st, we, 4));
  }

  @Test
  public void test2() {
    String st = "Elijah,Chloe,Matthew,Elizabeth,Natalie,Jayden";
    Integer[] we = new Integer[] {1, 3, 5, 5, 3, 6};
    assertEquals("Matthew", Rank.nthRank(st, we, 2));
  }
}
