package ss17.thuc_hanh.copy_file;

import java.io.*;

public class CopyByte {
    public static void main(String[] args) {
        FileInputStream inputStream = null ;
        FileOutputStream outputStream = null ;
        int c ;

        File fileinput =new File("src/ss17/thuc_hanh/copy_file/inout.txt");
        File fileoutput =new File("src/ss17/thuc_hanh/copy_file/output.txt");

        try {
            inputStream = new FileInputStream(fileinput) ;
            outputStream = new FileOutputStream(fileoutput);

            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (outputStream != null);
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
