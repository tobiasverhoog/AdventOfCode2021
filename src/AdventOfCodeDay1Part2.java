import java.util.ArrayList;

public class AdventOfCodeDay1Part2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = FileReader.fileReader("inputDay1.txt");
        int score = 0;

        for (int i = 0; i < list.size() - 3; i++) {
            score += list.get(i) < list.get(i + 3) ? 1 : 0;
        }
        System.out.println("Score: " + score);
    }
}
