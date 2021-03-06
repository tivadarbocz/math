import printer.IMatrixPrinter;

import java.util.Random;

/**
 * Created by Tivadar Bocz on 2016.08.31..
 */
public class Matrix {
    /**
     * @return (AT)i,j = Aj,i.
     */
    public static int[][] transposition(int[][] mtx){
        int[][] tmpMatrix = new int[mtx[0].length][mtx.length];

        for(int i = 0; i < mtx.length; ++i){
            for(int j = 0; j < mtx[0].length; ++j){
                tmpMatrix[j][i] = mtx[i][j];
            }
        }
        return tmpMatrix;
    }

    /**
     *
     * @param mtx n*m matrix
     * @param scalar value of the multiplication
     * @return (cA)i,j = c · Ai,j.   The product cA of a number c (also called a scalar in the parlance of abstract algebra) and a matrix A is computed by multiplying every entry of A by c:
    ,
     */
    public static int[][] scalarMultiplication(int[][] mtx, int scalar){
        int[][] tmpMtx = new int[mtx.length][mtx[0].length];
        for(int i = 0; i < mtx.length; ++i){
            for(int j = 0; j < mtx[0].length; ++j){
                tmpMtx[i][j] =  mtx[i][j] * scalar;
            }
        }
        return tmpMtx;
    }

    /**
     *
     * @param a n*m matrix
     * @param b n*m matrix
     * @return with new n*m matrix after addition
     */
    public static int[][] sum(int[][] a, int[][] b){
        if(a.length != b.length || a[0].length != b[0].length){
            throw new IllegalArgumentException("This method excepts only 2 n*m matrix!");
        }
        else{
            int[][] mtx = new int[a.length][a[0].length];
            for(int i = 0; i < a.length; ++i){
                for(int j = 0; j < a[0].length; ++j){
                    mtx[i][j] = a[i][j] + b[i][j];
                }
            }
            return mtx;
        }
    }

    public static void printMatrix(IMatrixPrinter printer, int[][] mtx){
        printer.print(mtx);
    }

    /**
     * Generate n*m matrix with rqandom values between low and high values
     * @param n
     * @param m
     * @param low
     * @param high
     * @return
     */
    public static int[][] generateNxMRandomMatrix(int n, int m, int low, int high){
        Random r = new Random();
        int[][] mtx = new int[n][m];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                mtx[i][j] = r.nextInt(high+1-low) + low;
            }
        }
        return mtx;
    }

    /**
     *
     * @param a n*m matrix
     * @param b n*m matrix
     * @return true if all values are equal, false if values are not equal
     */
    static boolean isEqual(int[][] a, int[][] b){
        if(a.length != b.length || a[0].length != b[0].length){
            throw new IllegalArgumentException("This method excepts only 2 n*m matrix!");
        }
        else{
            for(int i = 0; i < a.length; ++i){
                for(int j = 0; j < a[0].length; ++j){
                   if(!(a[i][j] == b[i][j])){
                       return false;
                   }
                }
            }
        }
        return true;
    }
}
