package homeworks.file_manager_application;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

/**
 * Created by antoni on 20.07.2018.
 */
public class FileManagerRules {

    private FilesManager fm = new FilesManager();

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

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

    @Test
    public void testProcessFilesFromFolder() throws Exception {

        File tempDir = folder.newFolder("ForFM", "ForFMOne");

        File tempDir1 = folder.newFolder("ForCopy");

        Path path = Paths.get(tempDir.getPath());

        Path sourcePath = Paths.get(tempDir1.getPath());

        fm.contentDirectory(sourcePath);

        System.out.println(tempDir.getName());




    }
}
