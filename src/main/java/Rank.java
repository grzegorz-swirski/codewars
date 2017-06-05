import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Rank {

  public static String nthRank(String names, Integer[] weights, int n) {
    if (names == null || names.isEmpty()) {
      return "No participants";
    }
    final String[] participants = names.split(",");
    if (participants.length < n) {
      return "Not enough participants";
    }

    List<Participant> participantList = IntStream.range(0, participants.length)
        .mapToObj(i -> new Participant(weights[i], participants[i]))
        .sorted(Comparator.comparing(Participant::getWinningNumber).reversed()
            .thenComparing(Comparator.comparing(Participant::getName)))
        .collect(Collectors.toList());

    return participantList.get(n - 1).getName();
  }
}

class Participant {

  private String name;
  private int winningNumber;

  public Participant(int weight, String name) {
    this.winningNumber = weight * (name.toUpperCase().chars()
        .map(c -> c - 64).sum() + name.length());
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getWinningNumber() {
    return winningNumber;
  }
}
