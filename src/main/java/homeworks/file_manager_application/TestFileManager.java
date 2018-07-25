package homeworks.file_manager_application;

import java.nio.file.Paths;

/**
 * Created by antoni on 05.07.2018.
 */
public class TestFileManager {

    TestFileManager testFileManager = new TestFileManager();

    public static void main(String[] args) throws Exception {

        FilesManager fileManager = new FilesManager();


//
//        fileManager.readModifySavePdf("Hello");
//
//        Path path1 = Paths.get("./ForFM/ForFMTwo/");
//        Path path2 = Paths.get("./ForFM/ForFMOne/");
//
//        fileManager.copyFilesToDirectory(path1, path2); // Copy files from one directory to another, if such a file already exists, overwrite it
//
//        fileManager.removeFile("ForFMFour"); // Delete files
//
////        fileManager.removeDirectoryContents(".\\src\\Directory3");
////
////        fileManager.renameFileDirectory(); //Rename files
//
//        Path path = Paths.get("");
//
        fileManager.contentDirectory(Paths.get(".\\ForFM\\")); // View the contents of the directory

    }



}
