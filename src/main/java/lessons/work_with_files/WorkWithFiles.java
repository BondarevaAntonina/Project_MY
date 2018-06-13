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



    private static void readUsingBufferedReader(String fileName, Charset cs) throws IOException {
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis, cs);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

    }

    private static void readUsingBufferedReaderJava7(String fileName, Charset cs) throws IOException {
        Path path = Paths.get(fileName);
        BufferedReader br = Files.newBufferedReader(path, cs);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }


    private static void readUsingScanner(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        //читаем построчно
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
        }
    }

    private static void readUsingFiles(String fileName) throws IOException {

        Path path = Paths.get(fileName);
        //считываем содержимое файла в массив байт
        byte[] bytes = Files.readAllBytes(path);
        //считываем содержимое файла в список строк
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
    }
}
