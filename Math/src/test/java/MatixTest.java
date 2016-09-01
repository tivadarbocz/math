/**
 * Created by Tivadar Bocz on 2016.08.31..
 */
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatixTest {

    @Test
    public void scalarMultiplicationTest() throws Exception{
        int mtx[][] = {
                {1, 2, -3},
                {4, -2, 5}
        };
        int expectedMtx[][] = {
                {2, 4, -6},
                {8, -4, 10}
        };

        assertEquals(Matrix.isEqual(Matrix.scalarMultiplication(mtx,2), expectedMtx),true);
    }

    @Test
    public void sumTest() throws  Exception{
        int mtxA[][] = {
                {1, 2, -3},
                {4, -2, 5}
        };

        int mtxB[][] = {
                {1, 2, -3},
                {4, -2, 5}
        };
        int expectedMtx[][] = {
                {2, 4, -6},
                {8, -4, 10}
        };

        assertEquals(Matrix.isEqual(Matrix.sum(mtxA, mtxB), expectedMtx),true);
    }

    @Test
    public void transpositionTest() throws  Exception{
        int mtx[][] = {
                {1, 2, -3},
                {4, -2, 5}
        };

        int mtxT[][] = {
                {1, 4},
                {2, -2},
                {-3, 5}
        };

        assertEquals(Matrix.isEqual(mtxT, Matrix.transposition(mtx)),true);
    }

    @Test
    public void generateNxMRandomMatrixTest(){
        int n = 5;
        int m = 6;
        int low = 0;
        int high = 1;
        int[][] mtx = Matrix.generateNxMRandomMatrix(n,m,low,high);
        assertEquals(mtx.length,n);
        assertEquals(mtx[0].length,m);
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; ++j){
                assertEquals((mtx[i][j] >= low && mtx[i][j] <= high),true);
            }
        }
    }
}
