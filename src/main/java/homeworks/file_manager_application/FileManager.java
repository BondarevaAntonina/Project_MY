package homeworks.file_manager_application;

import java.io.File;

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

//    private String nameFile;
//    private String nameDirectory;

    private static final String DIRECT = "d:\\Project_MY\\src\\Directory1";


//    public FileManager(String nameFile, String nameDirectory) {
//        this.nameFile = nameFile;
//        this.nameDirectory = nameDirectory;
//    }


    // Create a new directory
    public void createNewDirectory() throws Exception {

        final File direct1 = new File(DIRECT);
        if (!direct1.exists()) {
            if (direct1.mkdir()) {
                System.out.println("Каталог " + direct1.getAbsolutePath() + " успешно создан.");
            } else {
                System.out.println("Каталог " + direct1.getAbsolutePath() + " создать не удалось.");
            }
        } else {
            System.out.println("Каталог " + direct1.getAbsolutePath() + " уже существует.");
        }
    }

    public static void main(String[] args) throws Exception {
        FileManager fileManager = new FileManager();
        fileManager.createNewDirectory();

    }

}
