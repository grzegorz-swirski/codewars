import java.util.Arrays;
import java.util.List;

public class CompareStringsBySumOfChars {

  public static boolean compare(String s1, String s2) {
    return getAsciiSum(s1) == getAsciiSum(s2);
  }

  private static int getAsciiSum(String s) {
    int sum = 0;
    if (s == null) {
      return sum;
    }

    String upper = s.toUpperCase();
    for (int i = 0; i < upper.length(); i++) {
      char c = upper.charAt(i);
      if (!(Character.isLetter(c))) {
        return 0;
      }
      sum += (int) c;
    }
    return sum;
  }
}
