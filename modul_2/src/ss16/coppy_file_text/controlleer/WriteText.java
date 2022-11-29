package ss16.coppy_file_text.controlleer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {
    public void wriText(String[] arr) {
        File file = new File("src/ss16/coppy_file_text/data/source_file.vcs");
        {
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file);
                bufferedWriter = new BufferedWriter(fileWriter);
                for (String s : arr) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
