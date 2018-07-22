package homeworks.learn_enum;

import com.sun.jna.platform.win32.OaIdl;
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
    @Title("")
    public void shouldCreateFile() throws Exception {
        String nameOfFile = "Temp";

        Path path = Paths.get(FilesManager.FILE_PATH + nameOfFile + FilesManager.EXTENSION_TXT);

        fm.createNewFile(path);

        Assert.assertTrue(Files.exists(path));

        fm.removeFile(nameOfFile);
    }




}
