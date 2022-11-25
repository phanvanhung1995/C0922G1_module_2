package ss16.coppy_file_text.controlleer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public void copyFile() {
        ReadText readText = new ReadText();
        readText.arr();
        File file = new File("src/ss16/coppy_file_text/data/target_file.vcs");
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (String s : readText.arr()) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
