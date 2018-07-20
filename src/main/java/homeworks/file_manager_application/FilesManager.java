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
 * 3) Копировать файлы из одной директории в другую, если такой файл уже существует - перезатирать его -  СДЕЛАНО
 * 4) Удалять директории и файлы  - СДЕЛАНО
 * 5) Переименовывать директории и файлы - СДЕЛАНО
 * 6) Просматривать содержимое директории
 * <p>
 * Использовать Java 7, 8, Files
 */
public class FilesManager {


//    private static final String DIRECT = ".\\Project_MY\\src\\Directory2";

    private static final String FILE_PATH = "./ForFM/";
    private static final String EXTENSION_TXT = ".txt";
    private static final String EXTENSION_PDF = ".pdf";


    // Create a new directory

    public void createNewDirectory(String nameDir) throws IOException {

        String dirPath = FILE_PATH + nameDir;

        Path dirPathObj = Paths.get(dirPath);

        boolean dirExists = Files.exists(dirPathObj);

        if (dirExists) {

            System.out.println("Directory Already Exists");

            return;

        }

        try {

            Files.createDirectory(dirPathObj);

            System.out.println("New Directory successfully Created");

        } catch (IOException ioExceptionObj) {

            System.out.println("Problem Occured While Creating The Directory Structure= " + ioExceptionObj.getMessage());

        }

    }

    // Create a new file in directory

    public void createNewFile(String nameOfFile) throws Exception {

        try {

            Files.createFile(Paths.get(FILE_PATH + nameOfFile + EXTENSION_TXT));

            System.out.println("File has been created");

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage() + "\nFile has not been created");
        }

    }

    //
//    // Read the file and write the string
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

    public void copyFilesToDirectory() throws InterruptedException, IOException {


        Path targetPath = Paths.get("./ForFM/ForFMTwo/"); // target

        Path sourcePath = Paths.get("./ForFM/ForFMOne/"); // source

                Files.walkFileTree(sourcePath, new SimpleFileVisitor <Path>() {

                    @Override
                    public FileVisitResult preVisitDirectory(final Path dir, final BasicFileAttributes attrs) throws IOException {
                        Files.createDirectories(targetPath.resolve(sourcePath.relativize(dir)));
                        return FileVisitResult.CONTINUE;
                    }

                    @Override
                    public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {
                        Files.copy(file, targetPath.resolve(sourcePath.relativize(file)));
                        return FileVisitResult.CONTINUE;
                    }
                });
    }





    // Delete files

    public void removeFile(String nameOfFile) {

        Path path = Paths.get(".\\src\\Direct\\test1.txt");//FILE_PATH

        try {
            Files.deleteIfExists(path);

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage());
        }
    }

    // Deleting directory contents

    public void removeDirectoryContents() throws IOException {


        Path path = Paths.get(".\\src\\Directory3");

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

    public void renameFile() throws IOException {//add incoming params

        Path source = Paths.get(".\\src\\Directory2\\source.txt");

        Path newdir = Paths.get(".\\src\\Directory2\\test1.txt");

        if (Files.exists(source)) {

        }
        System.out.println("This file exists");

        Files.move(source, newdir, REPLACE_EXISTING);

    }

//
//    //Rename directories

    public void renameDirectory() throws IOException {//refactor

        Path file1 = Paths.get(".\\src\\Directory3");

        Path file2 = Paths.get(".\\src\\Directory2");

        if (Files.exists(file1)) {
            System.out.println("Directory successfully renamed");
            Files.move(file1, file2, REPLACE_EXISTING);
        }
    }

    // View the contents of the directory

    public void contentDirectory(String nameDir) {
//        Files.walkFileTree(Paths.get())
    }

}



