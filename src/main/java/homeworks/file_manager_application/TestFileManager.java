package homeworks.file_manager_application;

/**
 * Created by antoni on 05.07.2018.
 */
public class TestFileManager {

    public static void main(String[] args) throws Exception {

        FileManager fileManager = new FileManager();

        fileManager.createNewDirectory(); // Create a new directory

        fileManager.createNewFile(); // Create a new file in directory

        fileManager.copyFilesToDirect(); // Copy files from one directory to another, if such a file already exists, overwrite it

        fileManager.removeFile(); // Delete files

        fileManager.removeDirectory(); // Deleting directory

        fileManager.renameFile(); //Rename files


    }
}
