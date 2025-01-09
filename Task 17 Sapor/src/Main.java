import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] dimensions = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int mines = Integer.parseInt(dimensions[2]);


        char[][] field = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                field[i][j] = '.';
            }
        }


        for (int k = 0; k < mines; k++) {
            String[] minePosition = scanner.nextLine().split(" ");
            int row = Integer.parseInt(minePosition[0]) - 1;
            int col = Integer.parseInt(minePosition[1]) - 1;
            field[row][col] = '*';
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (field[i][j] != '*') {
                    int count = countAdjacentMines(field, i, j);
                    if (count > 0) {
                        field[i][j] = Character.forDigit(count, 10);
                    }
                }
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(field[i][j]);
                if (j < cols - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static int countAdjacentMines(char[][] field, int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;
                if (newRow >= 0 && newRow < field.length && newCol >= 0 && newCol < field[0].length) {
                    if (field[newRow][newCol] == '*') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
