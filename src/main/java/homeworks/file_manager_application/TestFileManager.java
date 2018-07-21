package homeworks.file_manager_application;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by antoni on 05.07.2018.
 */
public class TestFileManager {

    public static void main(String[] args) throws Exception {

        FilesManager fileManager = new FilesManager();


//        fileManager.createNewDirectory("F"); // Create a new directory

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
