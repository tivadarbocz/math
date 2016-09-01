package printer;

import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Tivadar Bocz on 2016.09.01..
 */
public class FilePrinter implements IPrinter{
    private Logger logger = Logger.getLogger(FilePrinter.class);
    String fileName;

    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }

    public void print(int[][] mtx) {
    try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")){
        for(int i = 0; i < mtx.length; ++i){
            for(int j = 0; j < mtx[0].length; ++j){
                writer.print((mtx[i][j] < 0 ? "" : " ") + mtx[i][j] + "\t");
            }
            writer.print((System.lineSeparator()));
        }
    } catch (FileNotFoundException e) {
       logger.error(e.getMessage());
    } catch (UnsupportedEncodingException e) {
        logger.error(e.getMessage());
    }

    }
}
