package ss16.coppy_file_text.controlleer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadText {
    public List<String> arr() {
        List<String> arr = new ArrayList<>();
        File file1 = new File("src/ss16/coppy_file_text/data/source_file.vcs");

        try {
            FileReader fileReader = new FileReader(file1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arr.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return arr;
    }
}


