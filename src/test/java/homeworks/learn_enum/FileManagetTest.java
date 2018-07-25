package homeworks.learn_enum;

import homeworks.file_manager_application.FilesManager;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManagetTest {
    private FilesManager fm = new FilesManager();

    @Test
    @Title("Create a new directory")
    public void shouldCreateDirectory() throws Exception {

        String nameOfDirectory = "TempDirectory";

        Path path = Paths.get(FilesManager.FILE_PATH + nameOfDirectory);

        fm.createNewDirectory(path);

        Assert.assertTrue(Files.exists(path));

    }


    @Test
    @Title("Create a new file in directory")
    public void shouldCreateFile() throws Exception {
        String nameOfFile = "Temp";

        Path path = Paths.get(FilesManager.FILE_PATH + nameOfFile + FilesManager.EXTENSION_TXT);

        fm.createNewFile(path);

        Assert.assertTrue(Files.exists(path));

        fm.removeFile(nameOfFile);
    }


    @Test
    @Title("Read the file and write the string")
    public void shouldReadAndWriteAndModifySavePdf() throws Exception {

    }

    @Test
    @Title("Copy files from one directory to another, if such a file already exists, overwrite it")
    public void shouldCopyFilesToDirectory() throws Exception {

        Path targetPath = Paths.get(FilesManager.FILE_PATH);

        Path sourcePath = Paths.get(FilesManager.FILE_TO_COPY);

        fm.copyFilesToDirectory(targetPath,sourcePath);








    }


}
