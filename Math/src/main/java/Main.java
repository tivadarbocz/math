/**
 * Created by Tivadar Bocz on 2016.08.31..
 */
public class Main {
    public static void main(String[] args) {
        int mtx[][] = {
                {1, 2, -3},
                {4, -2, 5}
        };

        int mtx2[][] = {
                {5, 3, 7},
                {3, 1, -8}
        };

        Matrix.printMatrix(mtx);
        Matrix.printMatrix(mtx2);
        //Matrix.printMatrix(Matrix.transposition(mtx));
        //Matrix.printMatrix(Matrix.scalarMultiplication(mtx, 2));
        //Matrix.printMatrix(Matrix.sum(mtx,mtx2));
    }
}


