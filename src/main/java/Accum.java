public class Accum {

  public static String accum(String input) {
    int length = input.length();
    char[] inputChars = input.toCharArray();
    StringBuilder builder = new StringBuilder();

    int i = 0;
    for (char c : inputChars) {
      builder
          .append(Character.toUpperCase(c))
          .append(new String(new char[i]).replace("\0",
              String.valueOf(c).toLowerCase()));
      if (i < length - 1) {
        builder.append("-");
      }
      i++;
    }
    return builder.toString();
  }
}
