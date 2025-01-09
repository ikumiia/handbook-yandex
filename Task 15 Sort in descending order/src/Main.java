import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputList.add(line);
        }

        Collections.sort(inputList, Collections.reverseOrder());

        for (String s : inputList) {
            System.out.println(s);
        }
    }
}
