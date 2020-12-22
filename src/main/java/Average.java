import java.util.Random;

public class Average {
    int[][] createMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = new Random().nextInt(90) + 10;
            }
        }
        return matrix;
    }

    int[] matrixToArray(int[][] matrix) {
        int[] onedimension = new int[matrix.length * matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                onedimension[i * matrix.length + j] = matrix[i][j];
            }
        }
        return onedimension;

    }


    double arrayAverage1(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;

    }
}
