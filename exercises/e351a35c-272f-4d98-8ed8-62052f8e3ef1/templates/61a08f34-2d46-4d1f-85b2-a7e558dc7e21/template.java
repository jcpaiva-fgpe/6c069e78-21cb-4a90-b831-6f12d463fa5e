import java.util.*;

public class Mean {
  private static final Scanner IN = new Scanner(System.in);

  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    int num;
    while ((num = IN.nextInt()) != -1) {
      nums.add(num);
    }
    double result = avg(nums.parallelStream().mapToInt(i -> i).toArray());
    System.out.println(String.format(Locale.US, "%.3f", result));
  }

  ${SOLUTION}
}
