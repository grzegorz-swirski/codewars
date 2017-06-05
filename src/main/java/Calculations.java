import java.util.Arrays;

public class Calculations {

  public static double avarage(int[] array) {
    return Arrays.stream(array).average().orElse(0);
  }
}
