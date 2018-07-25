package homeworks.file_manager_application;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Приложение должно позволять:
 * 1) Создавать текстовые файлы и директории  - СДЕЛАНО
 * 2) Конвертацию текстовых файлов в PDF файлы с помощью библиотеки
 * iText(http://howtodoinjava.com/apache-commons/create-pdf-files-in-java-itext-tutorial/#itext_overview)
 * 3) Копировать файлы из одной директории в другую, если такой файл уже существует - перезатирать его -  СДЕЛАНО RULE
 * 4) Удалять директории и файлы  - СДЕЛАНО
 * 5) Переименовывать директории и файлы - СДЕЛАНО RULE
 * 6) Просматривать содержимое директории
 * <p>
 * Использовать Java 7, 8, Files
 */
public class FilesManager {

//    private static final String DIRECT = ".\\Project_MY\\src\\Directory2";

    public static final String FILE_PATH = "./ForFM/";
    public static final String FILE_TO_COPY = "./ForFMOne/";
    public static final String EXTENSION_TXT = ".txt";
    public static final String EXTENSION_PDF = ".pdf";
    public static final String FILE_PATH_DEL = "./ForFMFour/";


   // Create a new directory

    public void createNewDirectory(Path path) throws IOException {


        boolean dirExists = Files.exists(path);

        if (dirExists) {

            System.out.println("Directory Already Exists");

            return;

        }

        try {

            Files.createDirectory(path);

            System.out.println("New Directory successfully Created");

        } catch (IOException ioExceptionObj) {

            System.out.println("Problem Occured While Creating The Directory Structure= " + ioExceptionObj.getMessage());

        }

    }

    // Create a new file in directory

    public void createNewFile(Path path) throws Exception {


        try {

            Files.createFile(path);

            System.out.println("File has been created");

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage() + "\nFile has not been created");
        }

    }

   // Read the file and write the string
//TODO change String to Path
    private String readFileTxt(String nameOfFile) throws IOException {


        String text = "Конвертацию текстовых файлов в PDF файлы с помощью библиотеки";

        byte[] bytes = Files.readAllBytes(Paths.get(FILE_PATH, nameOfFile + EXTENSION_TXT));

        return new String(bytes);

    }

    //
//
    public void readModifySavePdf(String nameOfFile) {

        Document document = new Document();
        try {
            String text = readFileTxt(nameOfFile);

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(FILE_PATH + nameOfFile + EXTENSION_PDF));
            document.open();
            document.add(new Paragraph(text));
            document.close();
            writer.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }

    }

    //Copy files from one directory to another, if such a file already exists, overwrite it

    public void copyFilesToDirectory(Path targetPath, Path sourcePath ) throws InterruptedException, IOException {

        Files.copy(targetPath, sourcePath, StandardCopyOption.REPLACE_EXISTING);
    }


    // Delete files

    public void removeFile(String nameOfFile) {

        Path path = Paths.get(FILE_PATH_DEL + nameOfFile);

        try {
            Files.deleteIfExists(path);

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage());
        }
    }

    // Deleting directory contents

    public void removeDirectoryContents(Path path) throws IOException {


//        Path path = Paths.get(".\\src\\Directory3");

        try {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {//SimpleFileVisitor напечатать все записи в дереве файла

                @Override

                //BasicFileAttributeView – базовые атрибуты, поддерживаемые всеми реализациями файловых систем

                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

                    return action("Deleting file: " + file);
                }

                @Override
                //Вызванный после того, как все записи в каталоге посещают. Если с какими-либо ошибками встречаются, определенное исключение передают к методу
                public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException {

                    return action("Deleting path: " + path);
                }

                private FileVisitResult action(String message) throws IOException {
                    System.out.println();

                    Files.delete(path);

                    return FileVisitResult.CONTINUE; //CONTINUE – Указывает, что обход файла должен продолжаться
                }
            });
        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    //Rename files

    public void renameFileDirectory(Path source, Path newDir, Path file1, Path file2) throws IOException {

        if (Files.exists(source)) {
            System.out.println("This file exists");
        }
        Files.move(source, newDir, REPLACE_EXISTING);

        if (Files.exists(file1)) {
            System.out.println("Directory successfully renamed");
            Files.move(file1, file2, REPLACE_EXISTING);
        }

    }

    // View the contents of the directory

    public void contentDirectory(Path nameDir) {

        try {
            Files.walkFileTree(nameDir, new SimpleFileVisitor<Path>() {//SimpleFileVisitor напечатать все записи в дереве файла

                @Override

                //BasicFileAttributeView – базовые атрибуты, поддерживаемые всеми реализациями файловых систем

                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

                    return action("File -> " + file.toFile().getName());
                }

                @Override
                //Вызванный после того, как все записи в каталоге посещают. Если с какими-либо ошибками встречаются, определенное исключение передают к методу
                public FileVisitResult postVisitDirectory(Path path, IOException exc) throws IOException {

                    return action("Directory -> " + path.toFile().getName());
                }

                private FileVisitResult action(String message) throws IOException {
                    System.out.println(message);

                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}



