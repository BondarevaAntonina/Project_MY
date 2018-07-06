package homeworks.file_manager_application;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Приложение должно позволять:
 * 1) Создавать текстовые файлы и директории  - СДЕЛАНО
 * 2) Конвертацию текстовых файлов в PDF файлы с помощью библиотеки
 * iText(http://howtodoinjava.com/apache-commons/create-pdf-files-in-java-itext-tutorial/#itext_overview)
 * 3) Копировать файлы из одной директории в другую, если такой файл уже существует - перезатирать его -  СДЕЛАНО
 * 4) Удалять директории и файлы
 * 5) Переименовывать директории и файлы
 * 6) Просматривать содержимое директории
 * <p>
 * Использовать Java 7, 8, Files
 */
public class FileManager {

    private String nameFile;
    private String nameDirectory;

    private static final String DIRECT = "d:\\Project_MY\\src\\Directory2";


    public FileManager() {
        this.nameFile = nameFile;
        this.nameDirectory = nameDirectory;
    }


    // Create a new directory

    public void createNewDirectory() throws Exception {

        final File direct1 = new File(DIRECT);
        if (!direct1.exists()) {
            if (direct1.mkdir()) {
                System.out.println("Directory" + direct1.getAbsolutePath() + " successfully created.");
            } else {
                System.out.println("Directory" + direct1.getAbsolutePath() + " failed to create.");
            }
        } else {
            System.out.println("Directory" + direct1.getAbsolutePath() + " already exists.");
        }
    }

    // Create a new file in directory

    public void createNewFile() throws Exception {

        File newFile = new File(".\\src\\Directory1\\test.txt");
        try {
            boolean created = newFile.createNewFile();
            if (created) System.out.println("File has been created");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    //Convert text files to PDF files

    public void convertTextToPDF() throws Exception {

    }

//Копировать файлы из одной директории в другую, если такой файл уже существует - перезатирать его

    public void copyFilesToDirect() {
//
        File source = new File(".\\src\\Directory1");
        File dest = new File(".\\src\\Directory2");
        try {
            FileUtils.copyDirectory(source, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}









