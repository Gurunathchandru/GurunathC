import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            countMap.put(i, count);
        }

        System.out.println(countMap);

    }
}
