package homeworks.file_manager_application;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by antoni on 20.07.2018.
 */
public class FileManagerRules  extends FilesManager{


    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException {


        File directiry = folder.newFolder("ForFM", "ForFMOne");



    }

}
