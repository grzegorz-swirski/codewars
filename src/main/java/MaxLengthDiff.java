/*
You are given two arrays a1 and a2 of strings.
Each string is composed with letters from a to z.
Let x be any string in the first array and y be any string in the second array.

Find max(abs(length(x) − length(y)))

If a1 or a2 are empty return -1 in each language except in Haskell where you will return Nothing.

#Example:

s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(s1, s2) --> 13
 */

import java.util.*;

public class MaxLengthDiff {

  public static int maxLengthDiff(String[] s1, String[] s2) {
    if (s1.length == 0 || s1 == null || s2.length == 0 || s2 == null) {
      return -1;
    }

    int diff1 = Math.abs(Arrays.stream(s1).map(p -> p.length()).min(Comparator.naturalOrder()).get()
        - Arrays.stream(s2).map(p -> p.length()).max(Comparator.naturalOrder()).get());
    int diff2 = Math.abs(Arrays.stream(s2).map(p -> p.length()).min(Comparator.naturalOrder()).get()
        - Arrays.stream(s1).map(p -> p.length()).max(Comparator.naturalOrder()).get());

    return Math.max(diff1, diff2);
  }
}
