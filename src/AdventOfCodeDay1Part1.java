import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventOfCodeDay1Part1 {
    public static void main(String[] args) {
        int numberOfIncreasedValues = 0;
        ArrayList<Integer> list = FileReader.fileReader("inputDay1.txt");

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                numberOfIncreasedValues++;
            }
        }
        System.out.println(numberOfIncreasedValues);
    }
}
