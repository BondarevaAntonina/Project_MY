package lessons.work_with_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Objects;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("./Logs", "logs.txt");

//        Files.write(path, "Hello1".getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);


        try (BufferedReader reader = Files.newBufferedReader(path)) {

            String line;

            while (Objects.nonNull(line = reader.readLine())) {
                System.out.println(line);
            }
        }

//        List<String> strings = Files.readAllLines(path);
    }
}
