package by.bntu.fitr.povt.enotes.lab12.model.logic;

public class ArrayWorker {
    public static int findMaxEqualSequence(double[][] array) {
        int maxSequence = 0, row = 0;
        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] == array[i][j - 1]) {
                    counter++;
                    if (maxSequence < counter) {
                        maxSequence = counter;
                        row = i;
                    }
                } else {
                    counter = 1;
                }
            }
        }
        return row;
    }

    public static double findMaxInDescendingRow(double[][] array) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length; i++) {
            double maxRow = array[i][0];
            boolean flag = false;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j - 1] >= array[i][j]) {
                    maxRow = Math.max(array[i][j], maxRow);
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                max = Math.max(max, maxRow);
            }
        }
        return max;
    }
}
