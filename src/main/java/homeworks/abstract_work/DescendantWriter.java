package homeworks.abstract_work;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by antoni on 04.07.2018.
 */
public class DescendantWriter extends Writer{

    @Override
    public void write(String log) {
        Path path = Paths.get("./Logs", "Poem.txt");
//        Path path = Paths.get("Poem.txt");
        try {
            //Files.write(path, ("\n" + modifyText(log)).getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE_NEW);
            Files.write(path, modifyText(log).getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
