package lessons.work_with_files;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class WorkWithFiles {
    public String fileName = "/Logs/logs.txt";

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
