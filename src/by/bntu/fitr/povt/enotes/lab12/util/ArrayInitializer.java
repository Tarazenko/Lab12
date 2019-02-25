package by.bntu.fitr.povt.enotes.lab12.util;

public class ArrayInitializer {
    public static void initArray(double[][] array) {
        for (int i = 0; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                array[i][j] =  UserInput.inputDouble();
            }
        }
    }
}
