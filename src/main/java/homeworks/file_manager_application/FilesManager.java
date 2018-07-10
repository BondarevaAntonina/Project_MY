package homeworks.file_manager_application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

    private String nameFile;
    private String nameDirectory;

//    private static final String DIRECT = ".\\Project_MY\\src\\Directory2";

    private static final String FILE_PATH = ".\\src\\Direct\\test1.txt";


    public FilesManager() {
        this.nameFile = nameFile;
        this.nameDirectory = nameDirectory;
    }

    // Create a new directory

    public void createNewDirectory() throws IOException {

        String dirPath = ".\\src\\Directory2";

        Path dirPathObj = Paths.get(dirPath);

        boolean dirExists = Files.exists(dirPathObj);

        if (dirExists) {

            System.out.println("Directory Already Exists");

        } else {

            try {

                Files.createDirectories(dirPathObj);

                System.out.println("New Directory successfully Created");

            } catch (IOException ioExceptionObj) {

                System.out.println("Problem Occured While Creating The Directory Structure= " + ioExceptionObj.getMessage());

            }

        }

    }

    // Create a new file in directory

    public void createNewFile() throws Exception {

        try {

            Path path = Files.createFile(Paths.get(FILE_PATH));

            System.out.println("File has been created");

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage());
        }
        System.out.println("File has not been created");
    }

//
//    // Read the file and write the string
//
//    public void reaFileTxt() {
//
//        String text = "Конвертацию текстовых файлов в PDF файлы с помощью библиотеки"; // строка для записи
//        try(FileOutputStream fos=new FileOutputStream(".\\src\\Directory1\\test2Modify.txt"))
//        {
//            byte[] buffer = text.getBytes();
//
//            fos.write(buffer, 0, buffer.length);
//        }
//        catch(IOException ex){
//
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("The file has been written");
//    }
//
//
//    public void readModifySavePdf() {
//
//        try {
//            File file = new File(".\\src\\Directory1\\test2Modify.txt");
//
//            FileReader fr = new FileReader(file);
//
//            BufferedReader reader = new BufferedReader(fr);
//
//            String line = reader.readLine();
//
//            while (line != null) {
//
//                System.out.println(line);
//
//                line = reader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//
//            e.printStackTrace();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//    // Convert text files to PDF files
//
//    public void convertTextToPDF() throws Exception {
//
//    }
//
    //Copy files from one directory to another, if such a file already exists, overwrite it
//
    public void copyFilesToDirect(String sourceDirName, String targetSourceDir) throws InterruptedException, IOException {

        File folder = new File(sourceDirName);

        File[] listOfFiles = folder.listFiles();

        Path destDir = Paths.get(targetSourceDir);

        if (listOfFiles != null) {

            System.out.println("Copy files from one directory to another successfully");
        }

        for (File file : listOfFiles)

            Files.copy(file.toPath(), destDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);

    }


    // Delete files

    public void removeFile() {

        Path path = Paths.get(".\\src\\Direct\\test1.txt");

        boolean pathExists = Files.exists(path);

        if (pathExists) {
            System.out.println("File test1.txt was removed from the project's root folder");
        }

        try {
            Files.delete(path);

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage());
        }
    }




//
//    // Deleting directory contents
//    public void removeDirectoryContents() {
//
//        File index = new File(".\\src\\Directory3");
//
//        String[] entries = index.list();
//
//        for (String s : entries) {
//
//            File currentFile = new File(index.getPath(), s);
//
//            currentFile.delete();
//        }
//    }
//
//    // Deleting directory
//
//    public void removeDirectory() {
//
//        removeDirectoryContents();
//
//        File file = new File(".\\src\\Directory3");
//
//        if (file.delete()) {
//
//            System.out.println(file + " has been removed from the project's root directory");
//
//        } else System.out.println(file + "was not found in the root directory of the project or is not empty");
//    }
//
//    //Rename files
//
//    public void renameFile() {
//
//        File srcFile = new File(".\\src\\Directory4\\test1.txt");
//
//        File destFile = new File(".\\src\\Directory4\\map.txt");
//
//        boolean renamed = srcFile.renameTo(destFile);
//
//        System.out.println("Renamed: " + renamed);
//    }
//
//    //Rename directories
//
//    public void renameDirectory() {
//
//        File srcFile = new File(".\\src\\Directory5");
//
//        File destFile = new File(".\\src\\Directory6");
//
//        boolean renamed = srcFile.renameTo(destFile);
//
//        System.out.println("Renamed: " + renamed);
//
//    }
//
//    // View the contents of the directory
//
//    public void contentDirectory() {
//
//        File content = new File(".\\src\\Directory7");
//
//        for (File item : content.listFiles()) {
//
//            if (item.isDirectory()) {
//
//                System.out.println(item.getName());
//
//            } else {
//
//                System.out.println(item.getName());
//            }
//        }
//    }

}



