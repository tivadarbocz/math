import printer.ConsolePrinter;

/**
 * Created by Tivadar Bocz on 2016.08.31..
 */
public class Main {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        //FilePrinter filePrinter = new FilePrinter("c:\\Users\\example\\Desktop\\test1.txt");

        int mtx[][] = {
                {1, 2, -3},
                {4, -2, 5}
        };

        int mtx2[][] = {
                {5, 3, 7},
                {3, 1, -8}
        };

        Matrix.printMatrix(consolePrinter,mtx);
        Matrix.printMatrix(consolePrinter,mtx2);
        Matrix.printMatrix(consolePrinter,Matrix.generateNxMRandomMatrix(5, 6, 0, 1));
        //Matrix.printMatrix(consolePrinter, Matrix.transposition(mtx));
        //Matrix.printMatrix(consolePrinter, Matrix.scalarMultiplication(mtx, 2));
        //Matrix.printMatrix(consolePrinter, Matrix.sum(mtx,mtx2));
    }
}


