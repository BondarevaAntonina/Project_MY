package homeworks.file_manager_application;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.rules.TemporaryFolder;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;


/**
 * Created by antoni on 20.07.2018.
 */
public class FileManagerRules {

    private FilesManager fm = new FilesManager();

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Title("Creating a text file")
    @Test
    public void testUsingTempFolder() throws Exception {


        File tempDir = folder.newFolder("ForFM", "ForFMOne");

        File tempDir1 = folder.newFolder("ForCopy");

        String nameOfFile = "Temp.txt";

        Path path = Paths.get(tempDir.getPath(), nameOfFile);

        fm.createNewFile(path);

        Path sourcePath = Paths.get(tempDir1.getPath(), nameOfFile);

        fm.copyFilesToDirectory(path, sourcePath);

        Assert.assertTrue(Files.exists(sourcePath));

    }
    @Title("View the contents of the directory")
    @Test
    public void testProcessFilesFromFolder() throws Exception {

        File tempDir = folder.newFolder("ForFM");

        Path path = Paths.get(tempDir.getPath(), "Text.txt");

        fm.createNewFile(path);

        Path path1 = Paths.get(tempDir.getPath(), "NameDir");

        fm.createNewDirectory(path1);

        Path sourcePath = Paths.get(tempDir.getPath());

        fm.contentDirectory(sourcePath);

        String log = systemOutRule.getLog();

        assertTrue(log.contains("Text.txt") && log.contains(path1.toFile().getName()));

    }
    @Title("Rename directory")
    @Test
    public void testRenameFile() throws Exception {

        File tempDirectory = folder.newFolder("ForFM");

        Path path = Paths.get(tempDirectory.getPath(), "Temp.txt");

        Path nameOfFile = Files.createFile(path);

        Path pathTo = Paths.get(tempDirectory.getPath(), "RenameTemp.txt");

        Path renameFile = Files.createFile(pathTo);

        fm.renameFileDirectory(path, pathTo, nameOfFile, renameFile );

    }
    @Title("Convert text files to PDF files using the library")
    @Test
    public void testConvertFilesTxtToPdf() throws Exception {

        File tempDirectory = folder.newFolder("ForFM");

        String nameOfFile = "Temp";

        Path path = Paths.get(tempDirectory.getPath(), nameOfFile);

        fm.createNewFile(path);

        fm.readFileTxt(nameOfFile);
    }

}