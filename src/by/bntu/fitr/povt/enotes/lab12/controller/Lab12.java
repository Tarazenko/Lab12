package by.bntu.fitr.povt.enotes.lab12.controller;

import by.bntu.fitr.povt.enotes.lab12.model.logic.ArrayWorker;
import by.bntu.fitr.povt.enotes.lab12.util.ArrayInitializer;
import by.bntu.fitr.povt.enotes.lab12.util.Protector;
import by.bntu.fitr.povt.enotes.lab12.view.Printer;

public class Lab12 {
    public static void main(String[] args) {
        Printer.print("Input amount of rows:");
        int n = Protector.inputPositive("Input right value:");
        Printer.print("Input amount of coloms:");
        int m = Protector.inputPositive("Input right value:");
        Printer.print("Input items:");
        double [][] array = new double[n][m];
        ArrayInitializer.initArray(array);
        Printer.print("Row with longest equal sequence: " + ArrayWorker.findMaxEqualSequence(array));
        Printer.print("Max in descending row: " + ArrayWorker.findMaxInDescendingRow(array));
    }
}
