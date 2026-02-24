import java.util.*;

public class MatrixRotation {

    public static void rotateMatrix(int[][] matrix, int r) {

        int m = matrix.length;
        int n = matrix[0].length;

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            // Top row
            for (int i = left; i <= right; i++)
                elements.add(matrix[top][i]);

            // Right column
            for (int i = top + 1; i <= bottom - 1; i++)
                elements.add(matrix[i][right]);

            // Bottom row
            for (int i = right; i >= left; i--)
                elements.add(matrix[bottom][i]);

            // Left column
            for (int i = bottom - 1; i >= top + 1; i--)
                elements.add(matrix[i][left]);

            int size = elements.size();
            int rotations = r % size;

            Collections.rotate(elements, -rotations);

            int index = 0;

            // Put back Top row
            for (int i = left; i <= right; i++)
                matrix[top][i] = elements.get(index++);

            // Right column
            for (int i = top + 1; i <= bottom - 1; i++)
                matrix[i][ri]()
