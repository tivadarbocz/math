package printer;

/**
 * Created by Tivadar Bocz on 2016.09.01..
 */
public class ConsolePrinter implements IMatrixPrinter {
    public void print(int[][] mtx) {
        for(int i = 0; i < mtx.length; ++i){
            for(int j = 0; j < mtx[0].length; ++j){
                System.out.print((mtx[i][j] < 0 ? "": " ") + mtx[i][j] + "\t");
            }
            System.out.print(System.lineSeparator());
        }
    }
}
