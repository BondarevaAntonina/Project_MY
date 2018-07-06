package homeworks.file_manager_application;

import java.io.File;
import java.io.IOException;

/**
 * Приложение должно позволять:
 * 1) Создавать текстовые файлы и директории
 * 2) Конвертацию текстовых файлов в PDF файлы с помощью библиотеки
 * iText(http://howtodoinjava.com/apache-commons/create-pdf-files-in-java-itext-tutorial/#itext_overview)
 * 3) Копировать файлы из одной директории в другую, если такой файл уже существует - перезатирать его
 * 4) Удалять директории и файлы
 * 5) Переименовывать директории и файлы
 * 6) Просматривать содержимое директории
 * <p>
 * Использовать Java 7, 8, Files
 */
public class FileManager {

    private String nameFile;
    private String nameDirectory;

    private static final String DIRECT = "d:\\Project_MY\\src\\Directory1";


    public FileManager() {
        this.nameFile = nameFile;
        this.nameDirectory = nameDirectory;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getNameDirectory() {
        return nameDirectory;
    }

    public void setNameDirectory(String nameDirectory) {
        this.nameDirectory = nameDirectory;
    }

    public static String getDIRECT() {
        return DIRECT;
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
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }


}




