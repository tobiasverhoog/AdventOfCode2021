import java.nio.file.Paths;
import java.util.Scanner;

public class Day2Part2 {
    public static void main(String[] args) {
        int horizontal = 0;
        int depth = 0;
        int aim = 0;

        try (Scanner scanner = new Scanner(Paths.get("inputDay2.txt"))) {
            while (scanner.hasNextLine()) {
                String[] arrayOfStrings = scanner.nextLine().split(" ");
                if (arrayOfStrings[0].equals("forward")) {
                    horizontal += Integer.parseInt(arrayOfStrings[1]);
                    depth += Integer.parseInt(arrayOfStrings[1]) * aim;
                }
                aim -= (arrayOfStrings[0].equals("up")) ? Integer.parseInt(arrayOfStrings[1]) : 0;
                aim += (arrayOfStrings[0].equals("down")) ? Integer.parseInt(arrayOfStrings[1]) : 0;

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Depth: " + depth);
        System.out.println("Horizontal: " + horizontal);
        System.out.println("Answer: " + depth * horizontal);

    }
}
