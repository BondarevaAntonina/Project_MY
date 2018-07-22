package homeworks.file_manager_application;

import homeworks.learn_enum.Man;
import homeworks.learn_enum.ManService;
import homeworks.learn_enum.Sex;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by antoni on 05.07.2018.
 */
public class TestFileManager {

    TestFileManager testFileManager = new TestFileManager();

    public static void main(String[] args) throws Exception {

        FilesManager fileManager = new FilesManager();


//        fileManager.createNewFile("FM1"); // Create a new file in directory
//
//        fileManager.readModifySavePdf("Hello");

//
//        fileManager.copyFilesToDirectory(); // Copy files from one directory to another, if such a file already exists, overwrite it
////
//        fileManager.removeFile("ForFMFour"); // Delete files
//
//        fileManager.removeDirectoryContents();
//
//        fileManager.renameFile(); //Rename files
//
//        Path path = Paths.get("");


        fileManager.contentDirectory(Paths.get(".\\ForFM\\")); // View the contents of the directory

    }



}
